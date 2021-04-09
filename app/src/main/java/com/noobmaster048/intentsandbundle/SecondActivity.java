package com.noobmaster048.intentsandbundle;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView incomingText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        incomingText = (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        String welcomeMessage = bundle.getString("welcomeMessage");

        incomingText.setText(welcomeMessage);
    }

}
