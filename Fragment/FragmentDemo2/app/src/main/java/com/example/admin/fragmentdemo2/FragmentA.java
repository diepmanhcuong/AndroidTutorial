package com.example.admin.fragmentdemo2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Admin on 4/21/2018.
 */

public class FragmentA extends Fragment {
    TextView txFrag;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        txFrag = (TextView)view.findViewById(R.id.txfrag);
        Bundle bundle = getArguments();
        if ((bundle!=null)){
           txFrag.setText(bundle.getString("hoten"));
        }

        return  view;
    }
}
