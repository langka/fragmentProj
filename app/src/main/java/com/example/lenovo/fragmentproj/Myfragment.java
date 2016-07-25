package com.example.lenovo.fragmentproj;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lenovo on 2016/7/24.
 */
public class Myfragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.choice,container,true);
        TextView a=(TextView)v.findViewById(R.id.a);
        TextView b=(TextView)v.findViewById(R.id.b);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show("a");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show("b");
            }
        });
        return v;
    }
    public void show(String x){
        if(x=="a"){
            Achoosed a = new Achoosed();
            FragmentTransaction ft=getFragmentManager().beginTransaction();
            ft.replace(R.id.area,a);
            ft.commit();
        }
        else{
            Bchoosed b= new Bchoosed();
            FragmentTransaction ft=getFragmentManager().beginTransaction();
            ft.replace(R.id.area,b);
            ft.commit();

        }
    }
}
