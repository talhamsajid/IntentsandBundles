package com.noobmaster048.intentsandbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView userName,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.button);
        userName = (TextView) findViewById(R.id.editTextTextPersonName);
        password = (TextView) findViewById(R.id.editTextTextPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.toString() == "Admin" && password.toString() == "pass" ){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("welcomeText", "Very good Lab is Done");
                        intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });

    }



}