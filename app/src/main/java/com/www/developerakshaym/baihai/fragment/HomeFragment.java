package com.www.developerakshaym.baihai.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.activity.AccountActivity;
import com.www.developerakshaym.baihai.activity.SubscribeFoundationActivity;
import com.www.developerakshaym.baihai.activity.ThankyouPointActivity;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class HomeFragment extends Fragment  {

    Context mContext;
    FragmentListener listener;
    LinearLayout donation,point;
    CardView card, card2, card3, card4;
    ImageView img_card;

    public HomeFragment(FragmentListener listener) {
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        img_card=view.findViewById(R.id.profile_card);
        img_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  listener.click(new DonateFragment(listener));
                startActivity(new Intent(mContext, AccountActivity.class));

            }
        });


        donation=view.findViewById(R.id.donation);
        donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listener.click(new FoundationFragment(listener));
                listener.click(new TabDonateFragment(listener));

            }
        });

        point=view.findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, ThankyouPointActivity.class));
            }
        });
        card=view.findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  listener.click(new DonateFragment(listener));
                listener.click(new DonationFragment(listener));

            }
        });

        card2=view.findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(new HeartFragment(listener));
            }
        });
        card3=view.findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getActivity().getPackageManager()
                        .getLaunchIntentForPackage("com.technorizen.baihaiprovider");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(getActivity(), "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
        card4=view.findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, SubscribeFoundationActivity.class));
            }
        });

        return view;
    }

}
