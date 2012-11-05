package com.github.offby1.twodifferentactivities;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends HasASettingsMenuActivity {

    MainActivity this_activity;
    ListView lv;

    String[] data = { "item1", "item2", "item3" };
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

                    Class<?> target_class = MainActivity.class;

                    switch (index) {
                    case 1: target_class = OtherActivity.class; break;
                    case 2: target_class = ThirdActivity.class; break;
                    default: break;
                    }

                    Intent i = new Intent(this_activity, target_class);
                    this_activity.startActivity(i);
                }
            });
    }
}
