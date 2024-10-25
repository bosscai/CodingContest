package com.faw.codingcontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected Button mBtnCCX, mBtnSJS, mBtnJLJ, mBtnMCJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnCCX = findViewById(R.id.btn_ccx);
        mBtnSJS = findViewById(R.id.btn_sjs);
        mBtnJLJ = findViewById(R.id.btn_jlj);
        mBtnMCJ = findViewById(R.id.btn_mcj);
        mBtnCCX.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, OneActivity.class));
        });
        mBtnSJS.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, TwoActivity.class));
        });
        mBtnJLJ.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ThreeActivity.class));
        });
        mBtnMCJ.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, FourActivity.class));
        });
    }
}