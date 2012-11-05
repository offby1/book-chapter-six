package com.github.offby1.twodifferentactivities;

import android.os.Bundle;
import android.app.Activity;

public class ThirdActivity extends HasASettingsMenuActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
    }
}
