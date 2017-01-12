package com.example.myapplication.activity.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Switch;
import com.example.myapplication.R;

public class FragmentsActivity extends FragmentActivity {

    private ButtonFragment buttonFragment;
    private ImageFragment imageFragment;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private Switch isBackStack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        manager = getSupportFragmentManager();

        buttonFragment = new ButtonFragment();
        imageFragment = new ImageFragment();
        isBackStack = (Switch) findViewById(R.id.switchBackStack);
    }

    public void onClickFragment(View view){
        transaction = manager.beginTransaction();
        switch (view.getId()){
            case R.id.btnAdd:
                if(manager.findFragmentByTag(ButtonFragment.TAG)==null){
                transaction.add(R.id.container, buttonFragment, ButtonFragment.TAG);}
                break;
            case R.id.btnDelete:
                if (manager.findFragmentByTag(ButtonFragment.TAG)!=null){
                transaction.remove(buttonFragment);}
                if (manager.findFragmentByTag(ImageFragment.TAG)!=null){
                    transaction.remove(imageFragment);}
                break;
            case R.id.btnReplace:
                if (manager.findFragmentByTag(ButtonFragment.TAG)!=null){
                    transaction.replace(R.id.container, imageFragment, ImageFragment.TAG);
                    break; }
                if (manager.findFragmentByTag(ImageFragment.TAG)!=null){
                    transaction.replace(R.id.container, buttonFragment, ButtonFragment.TAG);}
                break;
        }
        if (isBackStack.isChecked()){
            transaction.addToBackStack(null);
        }
        transaction.commit();

    }
}
