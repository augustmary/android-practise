package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);

    }

    public void sendData(View view){
        Intent intent= new Intent(this, LastActivity.class);

        intent.putExtra("login", login.getText().toString());
        intent.putExtra("password", password.getText().toString());

        startActivity(intent);
    }


    public void onPosition(View view){
        Configuration configuration = getResources().getConfiguration();
        if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "Portrait orientation", Toast.LENGTH_SHORT).show();
        }
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(this, "Landscape orientation", Toast.LENGTH_SHORT).show();
        }
    }

}
