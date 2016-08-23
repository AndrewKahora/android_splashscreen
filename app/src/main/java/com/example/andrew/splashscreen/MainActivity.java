package com.example.andrew.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread bg = new Thread(){
            public void run()  {
                super.run();
                try{
                 sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

        };

    }
}
