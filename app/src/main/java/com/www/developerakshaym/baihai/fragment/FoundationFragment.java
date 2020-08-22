package com.www.developerakshaym.baihai.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class FoundationFragment extends Fragment {

    Context mContext;
    FragmentListener listener;
    ImageView iv_back;
    CardView iv_card1,iv_card3;


    public FoundationFragment(FragmentListener listener) {
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
        View view= inflater.inflate(R.layout.fragment_foundation, container, false);

        iv_back=view.findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(new DonationFragment(listener));
            }
        });
        iv_card1=view.findViewById(R.id.card1);
        iv_card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(new PersonalDonateFragment(listener));
            }
        });
        iv_card3=view.findViewById(R.id.card3);
        iv_card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(new PersonalDonateFragment(listener));
            }
        });


        return view;
    }
}