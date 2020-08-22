package com.www.developerakshaym.baihai.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.technorizen.baihai.fragment.SearchFragment;
import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.fragment.ChatFragment;
import com.www.developerakshaym.baihai.fragment.HomeFragment;
import com.www.developerakshaym.baihai.listner.FragmentListener;

public class HomeActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener , FragmentListener {
    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setColorOnBar(R.color.colorBackground);

        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

        loadFragment(new HomeFragment(this));
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.home:
                setColorOnBar(R.color.colorBackground);
                loadFragment(new HomeFragment(this));
                break;
            case R.id.search:
                setColorOnBar(R.color.colorWhite);
                loadFragment(new SearchFragment(this));
                break;
            case R.id.chat:
                setColorOnBar(R.color.colorBackground);
                loadFragment(new ChatFragment(this));
                break;
            case R.id.profile:
                setColorOnBar(R.color.colorBackground);
               startActivity(new Intent(HomeActivity.this,AccountActivity.class));
                break;
        }

        return true;

    }

    @Override
    public void click(Fragment fragment) {
        loadFragment(fragment);
    }

    void setColorOnBar(int color){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(color, this.getTheme()));
        }
        else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(color));
        }
    }
}
