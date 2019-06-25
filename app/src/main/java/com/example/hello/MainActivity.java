package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt_bt1;
    private Button bt_bt2;
    private Button bt_bt3;
    private Button bt_bt4;
    private Button mbt_nuc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_bt1=(Button)findViewById(R.id.btn_uc1);
        bt_bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UC1Activity.class);
                startActivity(intent);
            }
        });
        bt_bt2=(Button)findViewById(R.id.btn_uc2);
        bt_bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UC2Activity.class);
                startActivity(intent);
            }
        });
        bt_bt3=(Button)findViewById(R.id.btn_uc3);
        bt_bt3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UC3Activity.class);
                startActivity(intent);
            }
        });
        bt_bt4=(Button)findViewById(R.id.btn_uc4);
        bt_bt4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UC4Activity.class);
                startActivity(intent);
            }
        });
        mbt_nuc5=(Button)findViewById(R.id.btn_uc5);
        mbt_nuc5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UC5Activity.class);
                startActivity(intent);
            }
        });

    }
}

