package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UC5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc5);
    }
    public void return1(View view){
        finish();
    }
}

