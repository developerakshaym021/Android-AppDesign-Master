package com.www.developerakshaym.baihai.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.adapter.MyTabAdapter;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class TabDonateFragment extends Fragment {


    FragmentListener listener;
    TabLayout tabLayout;
    ViewPager viewPager;
    View view;

    public TabDonateFragment(FragmentListener listener) {
        this.listener = listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_tab_donate, container, false);
        tabLayout=view.findViewById(R.id.tabLayout);
        viewPager=view.findViewById(R.id.viewPager);


        tabLayout.addTab(tabLayout.newTab().setText("My Donations"));
        tabLayout.addTab(tabLayout.newTab().setText("Donate Now"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        // this.listener=listener;



        final MyTabAdapter adapter = new MyTabAdapter(getActivity(), getActivity().getSupportFragmentManager(),
                tabLayout.getTabCount(),listener);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


            return view;

}





}