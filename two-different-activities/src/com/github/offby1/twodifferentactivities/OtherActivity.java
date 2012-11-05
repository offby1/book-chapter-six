package com.github.offby1.twodifferentactivities;

import android.os.Bundle;

public class OtherActivity extends HasASettingsMenuActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.darker_layout);
    }
}
