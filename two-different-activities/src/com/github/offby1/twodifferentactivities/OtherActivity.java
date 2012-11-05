package com.github.offby1.twodifferentactivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends HasASettingsMenuActivity {
    String displayMe;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.darker_layout);

        TextView tv = (TextView)this.findViewById(R.id.textView2);

        Intent i = this.getIntent ();
        displayMe = i.getExtras().getString("Extra");

        if (displayMe == null) {
            displayMe = "";
        }

        tv.setText(displayMe);
    }
}
