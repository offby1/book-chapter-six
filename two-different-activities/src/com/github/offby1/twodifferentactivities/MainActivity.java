package com.github.offby1.twodifferentactivities;

import android.os.Bundle;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends HasASettingsMenuActivity {

    MainActivity this_activity;
    ListView lv;

    String[] data = {
        MainActivity .class.getName(),
        OtherActivity.class.getName(),
        ThirdActivity.class.getName()
    };
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this_activity = this;
        lv = (ListView)this.findViewById (R.id.list);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter (adapter);

        lv.setOnItemClickListener(new OnItemClickListener() {

                public void onItemClick(AdapterView<?> arg0, View arg1, int index,
					long arg3) {

                    CharSequence classFullName = ((TextView) arg1).getText ();

                    Intent i = new Intent();
                    i.setComponent(new ComponentName("com.github.offby1.twodifferentactivities", classFullName.toString()));
                    this_activity.startActivity(i);
                }
            });
    }
}
