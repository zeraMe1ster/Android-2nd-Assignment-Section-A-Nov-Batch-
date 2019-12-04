package com.example.fragmentassignment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CircleFragment extends Fragment {


    Button buttoncircle;
    EditText etFirst;


    public CircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle, container, false);

        buttoncircle = view.findViewById(R.id.btnCalRadius);
        etFirst = view.findViewById(R.id.editNumber);

        buttoncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float radius = Float.parseFloat(etFirst.getText().toString());
                float result = 22/7*(radius*radius);
                Toast.makeText(getActivity(), "The area of radius is " + result, Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }

}
