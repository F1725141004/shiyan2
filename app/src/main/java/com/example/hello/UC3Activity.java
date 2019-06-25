package com.example.hello;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class UC3Activity extends AppCompatActivity {

    private  int i=0;
    private int index=0;
    private int arr[]={R.drawable.i01,R.drawable.i02,R.drawable.i03,R.drawable.i04,
            R.drawable.i05};
    private ImageView image;
    private static Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        image=(ImageView)findViewById(R.id.uc3_iv1);
        handler=new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message message) {
                image.setImageResource(arr[index]);
                image.bringToFront();
                return true;
            }
        });

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Message msg = new Message();
                msg.what = index;
                handler.sendMessage(msg);
                index=index+1;
                if(index>arr.length-1)
                {index=0;}
            }

        },0,1000);
  }

    public void return1(View view){
        finish();
    }
}
