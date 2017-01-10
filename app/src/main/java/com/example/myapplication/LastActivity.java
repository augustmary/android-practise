package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LastActivity extends Activity {
    private TextView textLogin;
    private TextView textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);

        textLogin = (TextView) findViewById(R.id.textLogin);
        textPassword = (TextView) findViewById(R.id.textPassword);

        textLogin.setText(getIntent().getStringExtra("login"));
        textPassword.setText(getIntent().getStringExtra("password"));
    }
    public void goBack(View v){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
