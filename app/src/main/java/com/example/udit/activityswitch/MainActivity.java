package com.example.udit.activityswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button first_activity;
    Button second_activity;
    Button third_activity;
    EditText enterName,enterPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_activity=(Button)findViewById(R.id.button1);
        second_activity=(Button)findViewById(R.id.button2);
        third_activity=(Button)findViewById(R.id.button3);
        enterName=(EditText)findViewById(R.id.edit1);
        enterPassword=(EditText)findViewById(R.id.edit2);
        first_activity.setOnClickListener(this);
        second_activity.setOnClickListener(this);
        third_activity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view==first_activity)
        {
            Intent intent=new Intent(getApplicationContext(),FirstActivity.class);
            intent.putExtra("name",enterName.getText().toString());
            intent.putExtra("pass",enterPassword.getText().toString());
            Log.e("n",enterName.getText()+"."+enterPassword.getText());
            startActivity(intent);
        }
        if(view==second_activity)
        {
            Intent intent=new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
        if(view==third_activity)
        {
            Intent intent=new Intent(this,ThirdActivity.class);
            startActivity(intent);
        }
    }
}
