package com.vigneshtraining.assignment34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button loginBtn;
    private EditText userNameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginBtn=(Button) findViewById(R.id.button);
        userNameTxt=(EditText) findViewById(R.id.userName);
        loginBtn.setOnClickListener(this);
        this.setTitle(R.string.login);
    }

    @Override
    public void onClick(View v) {
        Log.d("OnClicked","SSS");
        switch (v.getId()){
            case R.id.button:
                Log.d("OnClicked","Button");
                if (userNameTxt.getText().toString().isEmpty()){
                    Toast.makeText(this,"Please entet the user name",Toast.LENGTH_LONG).show();
                }else{
                    Intent login=new Intent(this,Welcome.class);
                    login.putExtra("userID",userNameTxt.getText().toString());
                    startActivity(login);
                }

            break;


        }
    }
}
