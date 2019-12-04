package com.example.fragmentassignment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseFragment extends Fragment {

    EditText etReverse;
    Button buttonReverse;
    HashMap<Character, Integer> charCountMap;
    TextView textViewReverse;


    public ReverseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse, container, false);
        etReverse = view.findViewById(R.id.editReverse);
        buttonReverse = view.findViewById(R.id.btnReverse);
        textViewReverse = view.findViewById(R.id.textReverse);

        charCountMap = new HashMap<>();

        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etReverse.getText().toString().isEmpty()) {
                    StringBuffer c = new StringBuffer(etReverse.getText().toString());
                    textViewReverse.setText(c.reverse());
                    Toast.makeText(getActivity(), "Added the string", Toast.LENGTH_LONG).show();
                } else {
                    etReverse.setError("Enter Your Text");
                }
            }
        });

        return view;
    }

}
