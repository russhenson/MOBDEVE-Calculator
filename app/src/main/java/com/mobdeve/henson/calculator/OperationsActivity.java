package com.mobdeve.henson.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class OperationsActivity extends AppCompatActivity {

//    private Button equalBtn, minusBtn, divideBtn, plusBtn, multBtn;
    private EditText computeOpsEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // hide title in title bar
        getSupportActionBar().hide(); // hide title bar

        setContentView(R.layout.activity_operations);

        /*this.equalBtn = findViewById(R.id.equalBtn);

        this.minusBtn = findViewById(R.id.minusBtn);

        this.divideBtn = findViewById(R.id.divideBtn);

        this.plusBtn = findViewById(R.id.plusBtn);

        this.multBtn = findViewById(R.id.multBtn);*/

        this.computeOpsEt = findViewById(R.id.computeOpsEt);

        Intent i = getIntent();
        int num1 = i.getIntExtra(MainActivity.NUM_1, 0);
        String display = i.getStringExtra(MainActivity.DISPLAY);

        computeOpsEt.setText(display);

    }
}