package com.example.myapplication.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.myapplication.R;

import java.util.Calendar;

public class CurrentDateActivity extends Activity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_date);
        textView = (TextView) findViewById(R.id.textDate);
        textView.setText(Calendar.getInstance().getTime().toString());
    }
}
