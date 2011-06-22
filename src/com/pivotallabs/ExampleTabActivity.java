package com.pivotallabs;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

public class ExampleTabActivity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;

        spec = tabHost
                .newTabSpec("hello")
                .setIndicator(createTabView(this, "Hello"))
                .setContent(new Intent().setClass(this, HelloActivity.class));

        tabHost.addTab(spec);

        spec = tabHost
                .newTabSpec("bye")
                .setIndicator(createTabView(this, "Goodbye"))
                .setContent(new Intent().setClass(this, GoodbyeActivity.class));

        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
    }

    private static View createTabView(final Context context, final String text) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab, null);
        TextView tv = (TextView) view.findViewById(R.id.tabText);
        tv.setText(text);
        return view;
    }

}
