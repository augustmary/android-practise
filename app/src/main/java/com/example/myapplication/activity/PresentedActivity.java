package com.example.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import com.example.myapplication.R;

/**
 * Created by Маша on 10.01.2017.
 */
public class PresentedActivity extends Activity {
    private EditText txtname;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presented_layout);
        txtname = (EditText) findViewById(R.id.txtname);
    }

    public void onIntro(View view){
        Intent intent = new Intent();//(this, MainActivity.class);
        intent.putExtra("name", txtname.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
