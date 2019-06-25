package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UC4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc4);
    }
    public void showToast_1(View view){
        Toast.makeText(this,"BOTTON1被点击",Toast.LENGTH_SHORT).show();
    }
    public void showToast_2(View view){
        Toast.makeText(this,"BOTTON2被点击",Toast.LENGTH_SHORT).show();
    }

    public void showToast_3(View view){
        Toast.makeText(this,"BOTTON3被点击",Toast.LENGTH_SHORT).show();
    }

    public void showToast_4(View view){
        Toast.makeText(this,"BOTTON4被点击",Toast.LENGTH_SHORT).show();
    }
    public void return1(View view){
        finish();
    }
}

