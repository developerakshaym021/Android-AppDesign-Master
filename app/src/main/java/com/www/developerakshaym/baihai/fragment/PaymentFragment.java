package com.www.developerakshaym.baihai.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.activity.ThankyouActivity;
import com.www.developerakshaym.baihai.listner.FragmentListener;


public class PaymentFragment extends Fragment  {

    Context mContext;
    FragmentListener listener;
    ImageView iv_back;

    TextView done;

    public PaymentFragment(FragmentListener listener) {
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
        View view = inflater.inflate(R.layout.fragment_payment ,container, false);

        iv_back=view.findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(new DeliveryFragment(listener));
            }
        });

        done=view.findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, ThankyouActivity.class));
            }
        });

        return view;
    }

}
