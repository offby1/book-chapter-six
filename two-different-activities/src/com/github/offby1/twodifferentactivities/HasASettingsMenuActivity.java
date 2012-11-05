package com.github.offby1.twodifferentactivities;

import android.app.Activity;
import android.view.Menu;

public abstract class HasASettingsMenuActivity extends Activity {

	public HasASettingsMenuActivity() {
		super();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    getMenuInflater().inflate(R.menu.activity_main, menu);
	    return true;
	}

}
