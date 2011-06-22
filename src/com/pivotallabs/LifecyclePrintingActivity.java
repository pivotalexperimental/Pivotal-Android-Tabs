package com.pivotallabs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LifecyclePrintingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        log("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log("onRestart");
    }

    private void log(String method) {
        Log.w("**********************", this.getClass().getSimpleName() + " " + method + "()");
    }
}
