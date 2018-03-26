package com.example.ltc_pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class frag_conf_papers extends Fragment implements View.OnClickListener{


    private ImageButton imageButton;
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;


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


        imageButton=(ImageButton)view.findViewById(R.id.imageButton);
        imageButton1=(ImageButton)view.findViewById(R.id.imageButton4);
        imageButton2=(ImageButton)view.findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)view.findViewById(R.id.imageButton5);

        imageButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case (R.id.imageButton):
                Intent intent = new Intent(getActivity(),Viewer.class);
                intent.putExtra("url", " https://drive.google.com/file/d/1Glq0Ede9KKStaEQDiI9Lrc1VfTFeWXUB/view");
                startActivity(intent);

                default:break;
        }
    }
}