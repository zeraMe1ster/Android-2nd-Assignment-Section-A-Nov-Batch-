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
public class PalendromeFragment extends Fragment {

    EditText editTextPalen;
    Button buttonPalen;
    HashMap<Character, Integer> charCountMap;
    TextView textViewReverse;


    public PalendromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palendrome, container, false);

        editTextPalen = view.findViewById(R.id.editPalen);
        buttonPalen = view.findViewById(R.id.btnPalendrome);
        textViewReverse = view.findViewById(R.id.textPalendrome);

        charCountMap = new HashMap<>();

        buttonPalen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextPalen.getText().toString().isEmpty()) {
                    StringBuffer c = new StringBuffer(editTextPalen.getText().toString());
                    textViewReverse.setText(c.reverse());

                    if (editTextPalen.getText().toString().equals(textViewReverse.getText().toString())) {
                        Toast.makeText(getActivity(), "The value is palendrome", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getActivity(), "Oops!! Not a palendrome number", Toast.LENGTH_LONG).show();
                    }
                } else {
                    editTextPalen.setError("Enter Your Text");
                }
            }
        });

        return view;
    }

}
