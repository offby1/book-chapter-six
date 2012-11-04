package com.github.offby1.twodifferentactivities;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OtherActivity extends HasASettingsMenuActivity {
    Button b;
    OtherActivity this_activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.darker_layout);

        this_activity = this;

        b = (Button)this.findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(this_activity, MainActivity.class);
                    this_activity.startActivity(i);
                }
            });
    }
}
