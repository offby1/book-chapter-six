package com.github.offby1.twodifferentactivities;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class ThirdActivity extends HasASettingsMenuActivity {
    EditText input;
    ThirdActivity this_activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        this_activity = this;

        input = (EditText)this.findViewById(R.id.editText1);
        input.setOnEditorActionListener(new OnEditorActionListener() {

               public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    boolean handled = false;
                    if (actionId == EditorInfo.IME_ACTION_DONE) {
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.github.offby1.twodifferentactivities",
                                                         "com.github.offby1.twodifferentactivities.OtherActivity"));
                        Bundle extras = new Bundle ();
                        extras.putString("Extra", ((EditText) v).getText().toString()) ;
                        i.putExtras (extras);

                        this_activity.startActivity(i);

                        handled = true;
                    }
                    return handled;
                }

            });
    }
}
