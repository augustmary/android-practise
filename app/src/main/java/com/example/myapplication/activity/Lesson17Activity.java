package com.example.myapplication.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.myapplication.R;

public class Lesson17Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson17);
    }

    public void explicitCall(View view){
        Intent intent = new Intent(this, CurrentDateActivity.class);
        startActivity(intent);
    }

    public void implicitCall(View view){
        Intent intent = new Intent(".activity.SiteActivity");
        startActivity(intent);
    }
    public void openContacts(View view){
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
        startActivity(intent);

    }
}
