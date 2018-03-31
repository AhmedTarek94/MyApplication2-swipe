package com.example.ltc_pc.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.content.Intent;


public class frag_conf_papers extends Fragment {

    private ImageButton btn_dep1;
    private ImageButton btn_dep2;
    private ImageButton btn_dep3;
    private ImageButton btn_dep4;

    public static frag_conf_papers newInstance(int position) {
        frag_conf_papers fragment = new frag_conf_papers();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);



        return fragment;
    }

    public frag_conf_papers() {

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
        View view = inflater.inflate(R.layout.frag_conf_papers, container, false);

        btn_dep1=(ImageButton)view.findViewById(R.id.btn_dep1);
        btn_dep2=(ImageButton)view.findViewById(R.id.btn_dep2);
        btn_dep3=(ImageButton)view.findViewById(R.id.btn_dep3);
        btn_dep4=(ImageButton)view.findViewById(R.id.btn_dep4);

        btn_dep1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getActivity(), dep1.class);
                ((MainActivity) getActivity()).startActivity(intent);

            }
        });

        btn_dep2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getActivity(), dep2.class);
                ((MainActivity) getActivity()).startActivity(intent);

            }
        });

        btn_dep3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getActivity(), dep3.class);
                ((MainActivity) getActivity()).startActivity(intent);

            }
        });

        btn_dep4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getActivity(), dep4.class);
                ((MainActivity) getActivity()).startActivity(intent);

            }
        });

        return view;


    }


}