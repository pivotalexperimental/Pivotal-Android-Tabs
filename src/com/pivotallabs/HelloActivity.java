package com.pivotallabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelloActivity extends LifecyclePrintingActivity
{
    private TextView textview;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        textview = new TextView(this);
        textview.setText("Hello!");
        layout.addView(textview);

        Button button = new Button(this);
        button.setText("Go to other");
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivityForResult(new Intent(HelloActivity.this, OtherActivity.class), 999);
            }
        });
        layout.addView(button);

        setContentView(layout);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 999) {
            Log.w("*****************", "got result from other activity");
            String s = "Hello! ";
            if (resultCode == Activity.RESULT_OK) {
                s += "Pressed OK.";
            } else if (resultCode == Activity.RESULT_CANCELED) {
                s += "Pressed Back.";
            }
            textview.setText(s);
        }
    }
}
