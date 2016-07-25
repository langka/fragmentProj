package com.example.lenovo.fragmentproj;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

/**
 * Created by lenovo on 2016/7/24.
 */
public class Bchoosed extends Fragment{
    private TabHost tabHost;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab,null);
        tabHost=(TabHost)v.findViewById(android.R.id.tabhost);
        tabHost.setup();
        inflater.inflate(R.layout.tab1,tabHost.getTabContentView());
        inflater.inflate(R.layout.tab2,tabHost.getTabContentView());
        tabHost.addTab(tabHost.newTabSpec("a").setIndicator("first").setContent(R.id.tab1a));
        tabHost.addTab(tabHost.newTabSpec("b").setIndicator("second").setContent(R.id.tab2b));
        return v;
    }
}
