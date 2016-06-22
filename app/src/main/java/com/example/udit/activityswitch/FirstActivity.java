package com.example.udit.activityswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView eName,ePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        eName=(TextView) findViewById(R.id.eName);
        ePass=(TextView)findViewById(R.id.ePass);

        Intent i=getIntent();
        String name=i.getStringExtra("name");
        String pass=i.getStringExtra("pass");
        Log.e("FirstActivty",name + "." + pass);

        eName.setText(name);
        ePass.setText(pass);
    }
}
