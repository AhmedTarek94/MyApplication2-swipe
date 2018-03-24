package com.example.ltc_pc.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;



public class frag_mtc_map extends Fragment  {



    public static frag_mtc_map newInstance(int position) {
        frag_mtc_map fragment = new frag_mtc_map();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);



        return fragment;
    }

    public frag_mtc_map() {

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
        View view = inflater.inflate(R.layout.frag_mtc_map, container, false);

        ImageView imageView3 = (ImageView) view.findViewById(R.id.imageView3);
        imageView3.setOnTouchListener(new ImageMatrixTouchHandler(view.getContext()));

        ImageView imageView4 = (ImageView) view.findViewById(R.id.imageView4);
        imageView4.setOnTouchListener(new ImageMatrixTouchHandler(view.getContext()));

        return view;
    }


}