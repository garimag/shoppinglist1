package com.example.helloandroid;

import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;

public class HelloAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.main);
        TextView tv = new TextView(this);
        tv.setText("Hello Akshat");
        setContentView(tv);

    }
}