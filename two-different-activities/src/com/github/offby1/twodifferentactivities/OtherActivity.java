package com.github.offby1.twodifferentactivities;

import android.os.Bundle;
import android.app.Activity;

public class OtherActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.darker_layout);
    }
}
