package com.example.ltc_pc.myapplication;

import android.os.Bundle;
import android.app.FragmentManager;
import android.app.Fragment;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.codekidlabs.storagechooser.StorageChooser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Tab_enroll extends android.app.Fragment implements View.OnClickListener,AdapterView.OnItemSelectedListener {

    private  FirebaseDatabase database;
    DatabaseReference users;

    private Spinner spinner;
    private static final String[]paths = {"Cairo", "Tanta", "MTC"};

    private double uni=0;

    private TextView txt_name;
    private TextView txt_email;
    private TextView txt_mob;


    public static frag_parts_mtc newInstance(int position) {
        frag_parts_mtc fragment = new frag_parts_mtc();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);



        return fragment;
    }

    public Tab_enroll() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {


           /* mPosition = getArguments().getInt("position");*/
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_enroll, container, false);


        Button btn_submit=(Button)view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(this);

         database = FirebaseDatabase.getInstance();

         users = database.getReference("Users:");
        //this code for keep posts even app offline until the app online again
        users.keepSynced(true);

        spinner = (Spinner)view.findViewById(R.id.spinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {

/*user (String name,String email,int id,int mob,int univ)*/

        switch (view.getId()) {
            case (R.id.btn_submit): {
                /*user u1 = new user("Tarek", "Sherya", 20, 010, 20);*/


                //users.push().setValue(u1);


                Toast.makeText(getActivity(),"Done",Toast.LENGTH_LONG).show();
            }

            case (R.id.btn_file):
                    {
                        // Initialize Builder
                        StorageChooser chooser = new StorageChooser.Builder()
                                .withActivity(getActivity())
                                .withFragmentManager(getFragmentManager())
                                .withMemoryBar(true)
                                .build();

// Show dialog whenever you want by
                        chooser.show();

// get path that the user has chosen
                        chooser.setOnSelectListener(new StorageChooser.OnSelectListener() {
                            @Override
                            public void onSelect(String path) {
                                Log.e("SELECTED_PATH", path);
                            }
                        });
                    }
            default:break;

        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        switch (position) {
            case 0:
                uni=0;
                break;
            case 1:
                uni=1;
                break;
            case 2:
                uni=2;
                break;

            default:break;

    }


}

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }}