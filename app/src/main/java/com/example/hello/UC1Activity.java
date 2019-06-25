package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

public class UC1Activity extends AppCompatActivity {
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1);
        layout=(LinearLayout)findViewById(R.id.ll_2);
    }

    public void changeHorizontal(View view){
        layout.setOrientation(LinearLayout.HORIZONTAL);
    }

    public void changeVertical(View view){
        layout.setOrientation(LinearLayout.VERTICAL);
    }

    public void changeLeft(View view){
        layout.setGravity(Gravity.LEFT);
    }

    public void return1(View view){
        finish();
    }
}

