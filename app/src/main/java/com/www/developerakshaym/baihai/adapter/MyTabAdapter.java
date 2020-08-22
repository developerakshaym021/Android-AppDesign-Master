package com.www.developerakshaym.baihai.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.www.developerakshaym.baihai.fragment.MyDonationFragment;
import com.www.developerakshaym.baihai.fragment.ProductDonateFragment;
import com.www.developerakshaym.baihai.listner.FragmentListener;

public class MyTabAdapter extends FragmentPagerAdapter {
    FragmentListener listener;
    private Context myContext;
    int totalTabs;

    public MyTabAdapter(Context context, FragmentManager fm, int totalTabs, FragmentListener listener) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
        this.listener=listener;
    }



    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MyDonationFragment myDonation = new MyDonationFragment();
                return myDonation;
            case 1:
            ProductDonateFragment newProDonateFragment =new ProductDonateFragment(listener);
            return newProDonateFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
