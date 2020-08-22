package com.www.developerakshaym.baihai.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import com.www.developerakshaym.baihai.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.tv_login)
    TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

    }

    @OnClick({R.id.tv_login})
    public void onClick(View v) {
        if (v.getId() == R.id.tv_login) {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        }
    }
}
