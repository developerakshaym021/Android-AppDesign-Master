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

import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.activity.ThankyouActivity;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class PersonalDonateFragment extends Fragment {

    Context mContext;
    FragmentListener listener;
    ImageView iv_back;
    CardView iv_card1, iv_card2, iv_card3;




    public PersonalDonateFragment(FragmentListener listener) {
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
        View view= inflater.inflate(R.layout.fragment_personal_donate, container, false);


        iv_back=view.findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(new FoundationFragment(listener));
            }
        });
        iv_card1=view.findViewById(R.id.card1);
        iv_card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // listener.click(new ProductDonateFragment(listener));
                startActivity(new Intent(getActivity(), ThankyouActivity.class));

            }
        });
        iv_card2=view.findViewById(R.id.card2);
        iv_card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(new DeliveryFragment(listener));



            }
        });


        return view;
    }
}