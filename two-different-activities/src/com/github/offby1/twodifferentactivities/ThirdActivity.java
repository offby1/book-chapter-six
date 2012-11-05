package com.github.offby1.twodifferentactivities;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

public class ThirdActivity extends HasASettingsMenuActivity {
    EditText input;
    ThirdActivity this_activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        this_activity = this;

        input = (EditText)this.findViewById(R.id.editText1);

        input.setOnFocusChangeListener(new OnFocusChangeListener() {

                public void onFocusChange(View v, boolean hasFocus) {

                    this_activity.toast (String.format ("We now %s the focus.", hasFocus ? "have" : "do not have"));

                    if (!hasFocus) {
                    	Intent i = new Intent();
                        i.setComponent(new ComponentName("com.github.offby1.twodifferentactivities",
                                                         "com.github.offby1.twodifferentactivities.OtherActivity"));
                        Bundle extras = new Bundle ();
                        extras.putString("Extra", ((EditText) v).getText().toString()) ;
                        i.putExtras (extras);

                        this_activity.startActivity(i);

                    }
                }


            });
    }
}
