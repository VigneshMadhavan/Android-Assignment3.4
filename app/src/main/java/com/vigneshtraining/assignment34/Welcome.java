package com.vigneshtraining.assignment34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    private TextView welcomeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        this.setTitle(R.string.welcome);
        welcomeText=(TextView) findViewById(R.id.label);
        Intent intentObject = getIntent();
        String userName = intentObject.getStringExtra("userID");
        welcomeText.setText("Hi! "+userName+" Welcome");
    }
}
