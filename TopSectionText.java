package com.lakhanpal.ankit.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TopSectionText extends Fragment {
    @Nullable

    private static EditText top_text_input;
    private static EditText bottom_text_input;

    TopSectionListener activityCommander;

    @Override  //exception handling

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopSectionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {  ///alt insert override on create view
        ///whwnever u use it whatlayout look like

        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        top_text_input = (EditText) view.findViewById(R.id.top1);
        bottom_text_input = (EditText) view.findViewById(R.id.bottom1);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    //hjhv
                    public void onClick(View v) {

                        ButtonClicked(v);


                    }
                }

        );


        return view;


    }

    public void ButtonClicked(View view) {

        activityCommander.createMeme(top_text_input.getText().toString(), bottom_text_input.getText().toString());

    }

    public interface TopSectionListener {//to talk to top section ad , main activit

        void createMeme(String top, String bottom);

    }
}
