package com.www.developerakshaym.baihai.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.activity.ThankyouPointActivity;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class UploadFragment extends Fragment {


    Context mContext;
    FragmentListener listener;
    ImageView iv_back;
    TextView tv_uploadproduct, iv_card2, iv_card3;

    public UploadFragment(FragmentListener listener) {
        this.listener = listener;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mContext=getActivity();
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_upload, container, false);



        iv_back=view.findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(new PersonalDonateFragment(listener));
            }
        });
        tv_uploadproduct=view.findViewById(R.id.tv_uploadproduct);
        tv_uploadproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // listener.click(new ThankyouPointActivity(listener));
                startActivity(new Intent(getActivity(), ThankyouPointActivity.class));

            }
        });

        return view;

    }
}