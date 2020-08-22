package com.www.developerakshaym.baihai.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.www.developerakshaym.baihai.R;


public class AccountActivity extends AppCompatActivity {

    TextView tv_cancel,tv_edit_account,tv_signout;
    LinearLayout tv_aboutus,tv_support;
    CardView setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        tv_cancel=findViewById(R.id.tv_cancel);

        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv_edit_account=findViewById(R.id.tv_edit_account);

        tv_edit_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountActivity.this,EditAccountActivity.class));
            }
        });

        setting=findViewById(R.id.setting);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountActivity.this,SettingActivity.class));
            }
        });


        tv_aboutus=findViewById(R.id.tv_aboutus);

        tv_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountActivity.this,AboutUsActivity.class));
            }
        });



        tv_support=findViewById(R.id.tv_support);

        tv_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountActivity.this,SupportActivity.class));
            }
        });


        tv_signout=findViewById(R.id.tv_signout);
        tv_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AccountActivity.this,LoginActivity.class));
            }
        });

    }
}
