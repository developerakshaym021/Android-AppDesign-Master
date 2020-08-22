package com.www.developerakshaym.baihai.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.listner.FragmentListener;

public class HeartFragment extends Fragment  {

    Context mContext;
    FragmentListener listener;
    CardView product_1;

    public HeartFragment(FragmentListener listener) {
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
        View view = inflater.inflate(R.layout.fragment_heart, container, false);


        product_1=view.findViewById(R.id.product_1);
        product_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(new MessageFragment(listener));
            }
        });

        return view;
    }

}
