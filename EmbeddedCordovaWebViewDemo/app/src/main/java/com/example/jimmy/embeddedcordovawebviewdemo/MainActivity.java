package com.example.jimmy.embeddedcordovawebviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCordovaActivity(View view) {
        Intent intent = new Intent(this, TestCordovaActivity.class);
        startActivity(intent);
    }

    public void startCordovaActivityWithLayout(View view) {
        Intent intent = new Intent(this, TestCordovaWithLayoutActivity.class);
        startActivity(intent);
    }

}
