package com.www.developerakshaym.baihai.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class PickUpFragment extends Fragment {
    Context mContext;
    FragmentListener listener;
    ImageView iv_back;
    TextView tv_continue;

    public PickUpFragment(FragmentListener listener) {
        this.listener = listener;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_pick_up, container, false);



        iv_back=view.findViewById(R.id.iv_backpickup);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(new PersonalDonateFragment(listener));
            }
        });

        tv_continue=view.findViewById(R.id.tv_continue);
        tv_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(new PersonalDonateFragment(listener));
            }
        });
        return view;
    }
}