package com.example.admin.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 4/18/2018.
 */

public class FragmentB extends Fragment {
    EditText edtB;
    TextView txB;
    Button btB;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        txB = (TextView)view.findViewById(R.id.FB);
        edtB = (EditText)view.findViewById(R.id.edtb);
        btB= (Button)view.findViewById(R.id.btb);
        btB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               TextView txB = getActivity().findViewById(R.id.fa);
               txB.setText("Fragment to fragment");
            }
        });
        return view;
    }
}
