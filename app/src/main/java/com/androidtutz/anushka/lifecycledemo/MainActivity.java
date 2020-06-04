package com.androidtutz.anushka.lifecycledemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int clickCount = 0;
    private TextView textView;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial_views();

        textView.setText("Count is: " + clickCount);
    }

    private void initial_views() {
        textView = findViewById(R.id.tvCount);
        fab = findViewById(R.id.fab);
    }


    public void fab_onclickListener(View view) {
        textView.setText("Count is: " + getCurrentCount());
    }


    public int getCurrentCount() {

        clickCount += 1;
        return clickCount;
    }


}
