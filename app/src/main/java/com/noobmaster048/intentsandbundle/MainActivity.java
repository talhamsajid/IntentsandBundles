package com.noobmaster048.intentsandbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView userName,password,error;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.button);
        userName = (EditText) findViewById(R.id.editTextTextPersonName);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        error = (TextView) findViewById(R.id.textView);


    }
    public void login(View view) {
       String username=userName.getText().toString();
       String pass= password.getText().toString();
        if(username.equals("Bahria")&& pass.equals("12345"))
        {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("welcomeMessage", "Lab task is done!");
            intent.putExtras(bundle);
            startActivity(intent);

        }
        else {
            Toast toast=Toast.makeText(getBaseContext(),"Wrong Inputs",Toast.LENGTH_SHORT);
                    toast.show();
        }}



}