package com.lakhanpal.ankit.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class picfrag extends Fragment {

    private static TextView topmeme1;
    private static TextView bottommeme1;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,@Nullable Bundle savedInstanceState) {

                         ///alt insert override on create view
                         ///whwnever u use it whatlayout look like

        View view=inflater.inflate(R.layout.botton_pic_fragment, container, false);
        topmeme1 = (TextView) view.findViewById(R.id.topmeme);
        bottommeme1 = (TextView) view.findViewById(R.id.bottommeme);
        return view;
    }


    public void SetMemeText(String top,String bottom){
        topmeme1.setText(top);
        bottommeme1.setText(bottom);
    }
}