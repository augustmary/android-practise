package com.example.myapplication.activity.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myapplication.R;

/**
 * Created by Маша on 12.01.2017.
 */
public class ImageFragment extends Fragment {
    public final static String TAG = "ImageFragmentTag";

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.image_layout, null);

    }
}
