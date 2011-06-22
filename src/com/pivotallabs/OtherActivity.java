package com.pivotallabs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OtherActivity extends LifecyclePrintingActivity {
    private TextView textview;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        textview = new TextView(this);
        textview.setText("Other!");
        layout.addView(textview);

        Button button = new Button(this);
        button.setText("OK");
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setResult(Activity.RESULT_OK);
                finish();
            }
        });
        layout.addView(button);

        setContentView(layout);
    }
}
