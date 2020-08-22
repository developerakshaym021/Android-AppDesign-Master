package com.www.developerakshaym.baihai.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.activity.ThankyouPointActivity;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class ProductDonateFragment extends Fragment  {

    Context mContext;
    FragmentListener listener;
    CardView iv_donate;


    public ProductDonateFragment(FragmentListener listener) {
        // Required empty public constructor
        this.listener=listener;

    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mContext = getActivity();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_donate, container, false);


        iv_donate=view.findViewById(R.id.tv_donate);
        iv_donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // listener.click(new T(listener));
                startActivity(new Intent(mContext, ThankyouPointActivity.class));
            }
        });

        return view;
    }

    }






