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

public class FragmentA extends Fragment {
    EditText edtA;
    TextView txA;
    Button btA;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment_a,container,false);
       txA = (TextView)view.findViewById(R.id.fa);
       edtA = (EditText)view.findViewById(R.id.edta);
       btA= (Button)view.findViewById(R.id.bta);
       btA.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              TextView textMain = getActivity().findViewById(R.id.txmain);
              textMain.setText("fragment to Activity");
           }
       });
        return view;
    }

    //Activity to fragment
     public void changeText(String change){
        edtA.setText(change);
     }
}
