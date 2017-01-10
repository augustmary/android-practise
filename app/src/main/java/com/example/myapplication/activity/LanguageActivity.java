package com.example.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.example.myapplication.R;
import com.example.myapplication.util.Language;

/**
 * Created by Маша on 10.01.2017.
 */
public class LanguageActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_layout);
    }

    public void onSelectedLanguage(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.btnEng:
                intent = new Intent();
                intent.putExtra("lang", Language.ENGLISH.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btnRus:
                intent = new Intent();
                intent.putExtra("lang", Language.RUSSIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btnUkr:
                intent = new Intent();
                intent.putExtra("lang", Language.UKRAINIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
        }
    }
}
