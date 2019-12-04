package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSum, buttonCircle, buttonReverse, buttonPalendrome, buttonAutomorphic, buttonReverseString;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SumFragment sumFragment = new SumFragment();
        fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        buttonSum = findViewById(R.id.btnSum);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    SumFragment sumFragment = new SumFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        buttonCircle = findViewById(R.id.btnCircle);
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    CircleFragment circleFragment = new CircleFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, circleFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });
    }
}
