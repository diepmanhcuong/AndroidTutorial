package com.example.admin.removeandpopbackstack;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addFragA(View view) {
        Button button = (Button)view;
        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        fragmentTransaction.add(R.id.reContain,fragmentA,"fragmentA");
        fragmentTransaction.addToBackStack("a");
        fragmentTransaction.commit();
    }
    public void addFragB(View view) {
        Button button = (Button)view;
        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        fragmentTransaction.add(R.id.reContain,fragmentB,"fragmentB");
        fragmentTransaction.addToBackStack("b");
        fragmentTransaction.commit();
    }
    public void addFragC(View view) {
        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentC fragmentC = new FragmentC();
        fragmentTransaction.add(R.id.reContain,fragmentC,"fragmentC");
        fragmentTransaction.addToBackStack("c");
        fragmentTransaction.commit();
    }
    public void removeFragA(View view){

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentA fragmentA  = (FragmentA) getFragmentManager().findFragmentByTag("fragmentA");
        if(fragmentA!=null){
            fragmentTransaction.remove(fragmentA);
            fragmentTransaction.commit();
        }
    }
    public void removeFragC(View view){

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentC fragmentC  = (FragmentC) getFragmentManager().findFragmentByTag("fragmentC");
        if(fragmentC!=null){
            fragmentTransaction.remove(fragmentC);
            fragmentTransaction.commit();
        }
    }
    public void removeFragB(View view){

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentB fragmentB  = (FragmentB) getFragmentManager().findFragmentByTag("fragmentB");
        if(fragmentB!=null){
            fragmentTransaction.remove(fragmentB);
            fragmentTransaction.commit();
        }
    }
    public void back(View view){
        getFragmentManager().popBackStack();
    }
    public void popA(View view){
        getFragmentManager().popBackStack("a",0);
    }

    @Override
    public void onBackPressed() {
        if(getFragmentManager().getBackStackEntryCount() > 0){
            getFragmentManager().popBackStack();
        }else{
            super.onBackPressed();
        }
    }
}
