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
import com.www.developerakshaym.baihai.activity.ThankyouActivity;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class WantToDonateFragment extends Fragment {

    Context mContext;
    FragmentListener listener;
    ImageView iv_back;
    TextView tv_submitproduct;


    public WantToDonateFragment(FragmentListener listener) {
        // Required empty public constructor
        this.listener=listener;
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
        View view= inflater.inflate(R.layout.fragment_want_to_donate, container, false);
        iv_back=view.findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(new PersonalDonateFragment(listener));
            }
        });

        tv_submitproduct=view.findViewById(R.id.tv_submitproduct);
        tv_submitproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //listener.click(new Tha(listener));
                startActivity(new Intent(getActivity(), ThankyouActivity.class));

            }
        });
        return view;
    }
}