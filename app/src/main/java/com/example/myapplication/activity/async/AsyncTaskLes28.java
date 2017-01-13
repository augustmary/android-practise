package com.example.myapplication.activity.async;

import android.os.AsyncTask;
import android.util.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by Маша on 13.01.2017.
 */
public class AsyncTaskLes28 extends AsyncTask<Void, Void, String> {

    @Override
    protected String doInBackground(Void... params) {
        try {
            for (int i = 0; i<=5; i++){
                Log.i("MY_TASK", "task is working...");
                TimeUnit.SECONDS.sleep(2);
                if (isCancelled()){
                    Log.i("MY_TASK", "task is canceled! ");
                    return null;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello!";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
