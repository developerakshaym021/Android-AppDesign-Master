package com.www.developerakshaym.baihai.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class DeliveryFragment extends Fragment  {

    Context mContext;
    FragmentListener listener;
    ImageView iv_back,check,uncheck;

    public DeliveryFragment(FragmentListener listener) {
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
        View view = inflater.inflate(R.layout.fragment_delivery ,container, false);

        iv_back=view.findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(new DonationFragment(listener));
            }
        });
        check=view.findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               listener.click(new WantToDonateFragment(listener));
                //startActivity(new Intent(mContext, WantToDonateFragment.class));
            }
        });
        uncheck=view.findViewById(R.id.uncheck);
        uncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(new PersonalDonateFragment(listener));
                //startActivity(new Intent(mContext, WantToDonateFragment.class));
            }
        });

        return view;
    }

}
