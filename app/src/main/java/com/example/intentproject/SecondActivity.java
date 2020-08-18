package com.example.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editNum1;
    EditText editNum2;

    String number1;
    String number2;
    TextView lbsum;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);
        lbsum = findViewById(R.id.lbsum);

        Intent intent = getIntent();

         number1 = intent.getStringExtra("n1");
         number2 = intent.getStringExtra("n2");

        editNum1.setText(number1);
        editNum2.setText(number2);

        n1 =Integer.parseInt(number1);
        n2 =Integer.parseInt(number2);

    }
    public void add(View view){
        lbsum.setText(number1 + " + " + number2 + " = " + (n1+n2));
    }
    public void substract(View view){
        lbsum.setText(number1 + " - " + number2 + " = " + (n1-n2));
    }
    public void multiply(View view){
        lbsum.setText(number1 + " X " + number2 + " = " + (n1*n2));
    }
    public void devide(View view){
        lbsum.setText(number1 + " / " + number2 + " = " + (n1/n2));
    }


}