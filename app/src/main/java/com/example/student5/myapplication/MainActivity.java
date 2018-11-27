package com.example.student5.myapplication;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void do2(View v) {
        ConstraintLayout  cll = findViewById(R.id.root);
        cll.setBackgroundColor(Color.BLUE);

    }
}
