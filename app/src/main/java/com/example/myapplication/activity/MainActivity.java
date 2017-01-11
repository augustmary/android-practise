package com.example.myapplication.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication.R;
import com.example.myapplication.util.RequestCode;

public class MainActivity extends Activity {
    private TextView textName;
    private TextView textLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = (TextView) findViewById(R.id.textName);
        textLang = (TextView) findViewById(R.id.textLang);

    }




    public void onShow(View view){
       Intent intent;
        switch (view.getId()){
            case R.id.btnIntro:
                intent =  new Intent(this, PresentedActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_INTRO);
                break;
            case R.id.btnLang:
                intent =  new Intent(this, LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_LANG);
                break;
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK){
            switch (requestCode){
                case RequestCode.REQUEST_CODE_INTRO:
                    String name = data.getStringExtra("name");
                    textName.setText("Nice to meet you, " + name);
                    break;
                case RequestCode.REQUEST_CODE_LANG:
                    String lang = data.getStringExtra("lang");
                    textLang.setText("Your language:" + lang);
                    break;
            }

        }else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

    }

    public void onAlertClick(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Some question")
                .setMessage("Are you sure?")
                .setCancelable(true)
                .setIcon(R.drawable.ic_launcher)
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"You rejected!", Toast.LENGTH_SHORT).show();
                    }
                })
        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You agreed!", Toast.LENGTH_SHORT).show();
            }
        })
        .setOnCancelListener(new DialogInterface.OnCancelListener(){
            @Override
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(getApplicationContext(),"You canceled!", Toast.LENGTH_SHORT).show();            }
        } );
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void startLesson17(View view){
        Intent intent =  new Intent(this, Lesson17Activity.class);
        startActivity(intent);
    }
}
