package com.mobdeve.henson.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView titleTextView;
    private EditText computeEditText;
    private Button opsBtn;
    private Button btn1, btn2, btn3, btn4;
    private Button btn5, btn6, btn7, btn8, btn9, btn0;

    public static String NUM_1 = "NUM_1";
    public static String NUM_2 = "NUM_2";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // hide title in title bar
        getSupportActionBar().hide(); // hide title bar

        setContentView(R.layout.activity_main);

        // number buttons
        this.opsBtn = findViewById(R.id.opsBtn);
        opsBtn.setOnClickListener(this);
        this.btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        this.btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        this.btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        this.btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        this.btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        this.btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        this.btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        this.btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        this.btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        this.btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(this);

        // computeET
        this.computeEditText = findViewById(R.id.computeEditText);


        // ops button
        this.opsBtn = findViewById(R.id.opsBtn);
        opsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(computeEditText.getText().toString());
                Intent i = new Intent(MainActivity.this, OperationsActivity.class);
                i.putExtra(NUM_1, num1);
                startActivity(i);
            }
        });




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            /*case R.id.opsBtn:
                Intent i = new Intent(MainActivity.this, OperationsActivity.class);
                startActivity(i);
                break;*/
            case R.id.btn1:
                this.computeEditText.setText(computeEditText.getText().append("1"));
                break;
            case R.id.btn2:
                 computeEditText.setText(computeEditText.getText().append("2"));
                 break;
            case R.id.btn3:
                computeEditText.setText(computeEditText.getText().append("3"));
                break;
            case R.id.btn4:
                computeEditText.setText(computeEditText.getText().append("4"));
                break;
            case R.id.btn5:
                computeEditText.setText(computeEditText.getText().append("5"));
                break;
            case R.id.btn6:
                computeEditText.setText(computeEditText.getText().append("6"));
                break;
            case R.id.btn7:
                computeEditText.setText(computeEditText.getText().append("7"));
                break;
            case R.id.btn8:
                computeEditText.setText(computeEditText.getText().append("8"));
                break;
            case R.id.btn9:
                computeEditText.setText(computeEditText.getText().append("9"));
                break;
            case R.id.btn0:
                computeEditText.setText(computeEditText.getText().append("0"));
                break;
        }



    }

}