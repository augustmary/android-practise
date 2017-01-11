package com.example.myapplication.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.myapplication.R;
import com.example.myapplication.adapter.PhoneModelAdapter;
import com.example.myapplication.pojo.PhoneModel;

import java.util.ArrayList;
import java.util.List;

public class Lesson18Activity extends Activity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson18);
        listView = (ListView) findViewById(R.id.listView);

        List<PhoneModel> items = initData();
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        PhoneModelAdapter phoneModelAdapter = new PhoneModelAdapter(this, items);

        listView.setAdapter(phoneModelAdapter);
    }
    private List<PhoneModel> initData(){
        List<PhoneModel> list = new ArrayList<>();
        list.add(new PhoneModel(1,"iPhone", 50));
        list.add(new PhoneModel(2,"HTC",60));
        list.add(new PhoneModel(3,"Samsung", 70));
        return  list;
    }
}
