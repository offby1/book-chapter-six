package com.github.offby1.twodifferentactivities;

import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public abstract class HasASettingsMenuActivity extends Activity {

    public HasASettingsMenuActivity() {
        super();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void toast (String message) {
        Toast.makeText(this, message,
                       Toast.LENGTH_SHORT).show();
    }
}
