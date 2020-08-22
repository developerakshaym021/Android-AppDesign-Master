package com.technorizen.baihai.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;


import com.www.developerakshaym.baihai.R;
import com.www.developerakshaym.baihai.listner.FragmentListener;

public class SearchFragment extends Fragment  {

    Context mContext;
    FragmentListener listener;
    ImageView et_RightFilter;


    public SearchFragment(FragmentListener listener) {
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
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        et_RightFilter=view.findViewById(R.id.et_RightFilter);
        et_RightFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initAlertDialog();

            }
        });


        return view;
    }
    public void initAlertDialog(){

        String[] listItems = {"1-3", "4-5", "2-3", "5-6", "7-8"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Choose items");

        boolean[] checkedItems = new boolean[]{false, false, false, false, false}; //this will checked the items when user open the dialog
        builder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                Toast.makeText(getActivity(), "Position: " + which + " Value: " +
                        listItems[which] + " State: " +
                        (isChecked ? "checked" : "unchecked"), Toast.LENGTH_LONG).show();
            }
        });

        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

}
