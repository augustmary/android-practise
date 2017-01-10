package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
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

    public void onShow(View view){
        Toast toast = Toast.makeText(this, "Toast message", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 20, 0);
        toast.show();
    }

}
