package com.mobdeve.henson.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView titleTextView;
    private EditText computeEditText;
    private Button opsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // hide title in title bar
        getSupportActionBar().hide(); // hide title bar

        setContentView(R.layout.activity_main);

        this.opsBtn = findViewById(R.id.opsBtn);
        this.opsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, OperationsActivity.class);
                startActivity(i);
            }
        });



    }
}