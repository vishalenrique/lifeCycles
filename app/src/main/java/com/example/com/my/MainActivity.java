package com.example.com.my;

import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("onCreate Activity","onCreate Activity");
        getFragmentManager().beginTransaction().replace(R.id.textview,new BlankFragment()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("onStart Activity","onStart Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("onPause Activity","onPause Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("onStop Activity","onStop Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("onRestart Activity","onRestart Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("onResume  Activity","onResume  Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("onDestroy Activity","onDestroy Activity");
    }
}
