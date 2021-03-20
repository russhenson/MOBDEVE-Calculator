package com.mobdeve.henson.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class OperationsActivity extends AppCompatActivity implements View.OnClickListener{

    private Button equalBtn, minusBtn, divideBtn, plusBtn, multBtn;
    private EditText computeOpsEt;
    private String display;

    public static String RESULT_TAG = "RESULTS";
    public static String LOG_TAG = "OperationsActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // hide title in title bar
        getSupportActionBar().hide(); // hide title bar

        setContentView(R.layout.activity_operations);

        this.equalBtn = findViewById(R.id.equalBtn);
        equalBtn.setOnClickListener(this);
        this.minusBtn = findViewById(R.id.minusBtn);
        minusBtn.setOnClickListener(this);
        this.divideBtn = findViewById(R.id.divideBtn);
        divideBtn.setOnClickListener(this);
        this.plusBtn = findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(this);
        this.multBtn = findViewById(R.id.multBtn);
        multBtn.setOnClickListener(this);

        this.computeOpsEt = findViewById(R.id.computeOpsEt);

        Intent i = getIntent();
        int num1 = i.getIntExtra(MainActivity.NUM_1, 0);
        display = i.getStringExtra(MainActivity.DISPLAY);

        computeOpsEt.setText(display);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.minusBtn:
                //computeOpsEt.setText(computeOpsEt.getText().append("-"));
                display = computeOpsEt.getText().append("-").toString();
                Intent return_intent = new Intent();

                return_intent.putExtra(RESULT_TAG, display);
                setResult(Activity.RESULT_OK, return_intent);
                finish();
                break;
        }
    }

}