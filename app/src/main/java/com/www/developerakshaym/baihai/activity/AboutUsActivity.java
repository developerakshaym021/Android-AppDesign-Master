package com.www.developerakshaym.baihai.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.www.developerakshaym.baihai.R;


public class AboutUsActivity extends AppCompatActivity {

    TextView tv_cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        tv_cancel=findViewById(R.id.tv_cancel);

        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });


    }
}
