package com.example.udit.activityswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view==button1)
        {
            Intent intent=new Intent(this,FirstActivity.class);
            startActivity(intent);
        }
        if(view==button2)
        {
            Intent intent=new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
        if(view==button3)
        {
            Intent intent=new Intent(this,ThirdActivity.class);
            startActivity(intent);
        }
    }
}
