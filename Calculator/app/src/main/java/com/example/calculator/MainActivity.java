package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String EXTRA_MESSAGE = "com.example.calculator.MESSAGE";
    private Expression exp = new Expression();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display = (TextView) findViewById(R.id.display);
        display.setText(exp.getExpression());
    }

    public void buttonClick(View view) {
        String button_value;
        Button button = (Button) findViewById(view.getId());
        button_value = button.getText().toString();
        System.out.println(button_value);
        exp.addSymbol(button_value);
        TextView display = (TextView) findViewById(R.id.display);
        display.setText(exp.getExpression());
    }


    public void evaluateClick(View view){
        exp.evalExpression();
        TextView display = (TextView) findViewById(R.id.display);
        display.setText(exp.getExpression());
    }

    public void clearClick(View view){
        exp.clearExpression();
        TextView display = (TextView) findViewById(R.id.display);
        display.setText(exp.getExpression());
    }
}

