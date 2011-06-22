package com.pivotallabs;

import android.os.Bundle;
import android.widget.TextView;

public class GoodbyeActivity extends LifecyclePrintingActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("Goodbye!");
        setContentView(textview);
    }
}
