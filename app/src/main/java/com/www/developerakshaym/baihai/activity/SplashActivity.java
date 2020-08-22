package com.www.developerakshaym.baihai.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.www.developerakshaym.baihai.R;


public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handlerMethod();
    }

    private void handlerMethod() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }, SPLASH_TIME);
    }
}
