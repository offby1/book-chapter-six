package com.github.offby1.twodifferentactivities;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends HasASettingsMenuActivity {
    Button b;

    MainActivity this_activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this_activity = this;

        b = (Button)this.findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(this_activity, OtherActivity.class);
                    this_activity.startActivity(i);
                }
            });
    }
}
