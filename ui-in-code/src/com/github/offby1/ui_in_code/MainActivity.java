package com.github.offby1.ui_in_code;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private LinearLayout nameContainer;
    private LinearLayout addressContainer;
    private LinearLayout parentContainer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createNameContainer ();
        createAddressContainer ();
        createParentContainer ();

        setContentView(parentContainer);
    }

    private void createNameContainer () {
        nameContainer = new LinearLayout (this);

        nameContainer.setLayoutParams (new LayoutParams (LayoutParams.FILL_PARENT,
                                                         LayoutParams.WRAP_CONTENT));
        nameContainer.setOrientation (LinearLayout.HORIZONTAL);

        TextView nameLb1 = new TextView (this);
        nameLb1.setText ("Name: ");

        TextView nameValue = new TextView (this);
        nameValue.setText ("John Doe");

        nameContainer.addView (nameLb1);
        nameContainer.addView (nameValue);
    }

    private void createAddressContainer () {
        addressContainer = new LinearLayout (this);

        addressContainer.setLayoutParams (new LayoutParams(LayoutParams.FILL_PARENT,
                                                           LayoutParams.WRAP_CONTENT));
        addressContainer.setOrientation (LinearLayout.VERTICAL);

        TextView addrLb1 = new TextView (this);
        addrLb1.setText ("Address: ");

        TextView addrValue = new TextView (this);
        addrValue.setText ("911 Code Blvd");

        addressContainer.addView (addrLb1);
        addressContainer.addView (addrValue);
    }

    private void createParentContainer () {
        parentContainer = new LinearLayout (this);

        parentContainer.setLayoutParams (new LayoutParams (LayoutParams.FILL_PARENT,
                                                           LayoutParams.FILL_PARENT));
        parentContainer.setOrientation (LinearLayout.VERTICAL);

        parentContainer.addView (nameContainer);
        parentContainer.addView (addressContainer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
