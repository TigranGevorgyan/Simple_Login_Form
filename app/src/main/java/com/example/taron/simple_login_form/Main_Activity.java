package com.example.taron.simple_login_form;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Taron on 04/24/17.
 */

public class Main_Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSANGE);

        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText("You are logged in as " + message);
    }
}
