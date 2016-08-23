package com.example.andrew.splashscreen;

import android.content.Intent;
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
                 sleep(3000);
                    Intent white = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(white);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };

    }
}
