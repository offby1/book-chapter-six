package com.github.offby1.ui_in_both_code_and_xml;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView nameValue = (TextView)findViewById (R.id.nameValue);
        nameValue.setText ("John Doe");

        TextView addrValue = (TextView)findViewById (R.id.addrValue);
        addrValue.setText ("911 Both Blvd");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
