package com.example.myapplication.activity.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication.R;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;

public class ProgressBarExample extends Activity {
    ProgressBar progressBar;
    TextView textView;
    AsyncTaskLes28 asyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_example);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        textView = (TextView) findViewById(R.id.textProgress);
        asyncTask = AsyncTaskLes28.getInstance(getApplicationContext());
    }
    public void onclickStartProcess(View view){
        //new MyAsyncTask().execute();

    }
    class MyAsyncTask extends AsyncTask<Void, Integer, Void>{
        private int progressBarValue = 0;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(getApplicationContext(), "Process started at " + Calendar.getInstance().getTime(), Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(getApplicationContext(), "Process finished at " + Calendar.getInstance().getTime(), Toast.LENGTH_SHORT).show();
            super.onPostExecute(aVoid);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setProgress(values[0]);
            textView.setText(values[0] + " %");
        }

        @Override
        protected Void doInBackground(Void... params) {
            while (progressBarValue<100){
                progressBarValue++;
                publishProgress(progressBarValue);
                SystemClock.sleep(100);
            }
            return null;
        }
    }
    public void onShowMessage(View view) throws ExecutionException, InterruptedException {

        asyncTask.execute();

        String text = null;
       // try {
           // text = asyncTask.get();//(2, TimeUnit.SECONDS);
            //Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
//        } catch (TimeoutException e) {
//            Toast.makeText(this, "We waited for to long!", Toast.LENGTH_SHORT).show();
//        }

    }

    public  void onCancelTask(View view){
        asyncTask.cancel(false);
    }

    public  void onStatusTask(View view){
        Toast.makeText(getApplicationContext(), asyncTask.getStatus().toString(), Toast.LENGTH_LONG).show();
    }


}
