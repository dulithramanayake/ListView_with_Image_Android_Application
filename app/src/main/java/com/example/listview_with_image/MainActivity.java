package com.example.listview_with_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    /**
     * Steps to create ListView Static Item
     * 01) Create Data source
     * 02) Create the separate XML fie to represent single data row (Text view, ImageView)
     * 03) Create the ArrayAdapter with passing 1,Context 2,Layout 3,TextView 4,Data Source
     * 04) Put ListView in Layout which you would like to put your ListView
     * 05) Get Reference to Layout which you like to populate  ListView with ArrayAdapter
     * 06) Finally set the adapter to ListView object
     */

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String week[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textView,week);

        listView=findViewById(R.id.list_View);

        listView.setAdapter(arrayAdapter);
    }
}