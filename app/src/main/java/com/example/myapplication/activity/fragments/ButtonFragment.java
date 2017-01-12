package com.example.myapplication.activity.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication.R;

/**
 * Created by Маша on 12.01.2017.
 */
public class ButtonFragment extends Fragment {
    public final static String TAG = "ButtonFragmentTag";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.button_layout, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();
        Button button = (Button) getActivity().findViewById(R.id.btnTransmitData);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"blah", Toast.LENGTH_LONG).show();
                EditText editText = (EditText) getActivity().findViewById(R.id.put_some_text);
                TextView textView = (TextView) getActivity().findViewById(R.id.textFrombtnFragment);
                textView.setText("kkk");//.setText(editText.getText().toString());
            }
        });
    }

    public void onClickBtn(View v) {
        Toast.makeText(getActivity().getApplicationContext(),"blah", Toast.LENGTH_LONG).show();
        EditText editText = (EditText) getActivity().findViewById(R.id.put_some_text);
        TextView textView = (TextView) getActivity().findViewById(R.id.textFrombtnFragment);
        textView.setText("kkk");//(editText.getText().toString());
    }
}
