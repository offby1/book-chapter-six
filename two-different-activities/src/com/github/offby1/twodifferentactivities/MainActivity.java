package com.github.offby1.twodifferentactivities;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    Button b;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)this.findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener()
            {
                @Override
                public void onClick(View v) {
                	Intent i = new Intent();
                	i.setComponent(new ComponentName("com.github.offby1.twodifferentactivities",
                                                         "OtherActivity"));
                    startActivity(i);
                }
            });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
