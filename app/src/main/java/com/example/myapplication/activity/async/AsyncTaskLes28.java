package com.example.myapplication.activity.async;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by Маша on 13.01.2017.
 */
public class AsyncTaskLes28 extends AsyncTask<Void, Void, String> {

    private static AsyncTaskLes28 instance;

    private static Context context;

    public static AsyncTaskLes28 getInstance(Context context){
        if (instance == null){
            instance = new AsyncTaskLes28();
            instance.execute();
        }
        setContext(context);
        return instance;

    }

    public static void setContext(Context context) {
        AsyncTaskLes28.context = context;
    }

    @Override
    protected String doInBackground(Void... params) {
        try {
            for (int i = 0; i<=5; i++){
                Log.i("MY_TASK", "task is working...");
                TimeUnit.SECONDS.sleep(2);
                printInfo();
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

    private void printInfo() {
        Log.i("DEV_MODE", "CODE: "+ this.hashCode() + "|" + context.hashCode());
    }

    @Override
    protected void onPostExecute(String s) {
        instance = null;
    }
}
