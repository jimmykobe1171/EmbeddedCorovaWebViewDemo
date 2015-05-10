package com.example.jimmy.embeddedcordovawebviewdemo;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.apache.cordova.CordovaActivity;


public class TestCordovaActivity extends CordovaActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
        // Load your application
         launchUrl = "file:///android_asset/www/index.html";
//        launchUrl = "file:///android_asset/www/index2.html";
        loadUrl(launchUrl);
   }
}
