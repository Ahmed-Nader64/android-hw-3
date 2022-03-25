package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListAdapter imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> itemlist = new ArrayList<Items>();

        Items item1 = new Items("donut",4,R.drawable.donut);
        Items item2 = new Items("coffee",5,R.drawable.coffee);
        Items item3 = new Items("chocolate",2,R.drawable.chocolate);
        Items item4 = new Items("cheese",1,R.drawable.cheese);
        Items item5 = new Items("honey",2,R.drawable.honey);
        Items item6 = new Items("fries",8,R.drawable.fries);

        itemlist.add(item1);
        itemlist.add(item2);
        itemlist.add(item3);
        itemlist.add(item4);
        itemlist.add(item5);
        itemlist.add(item6);

        ItemsAdapter itemsAdapter = new ItemsAdapter(this , 0, itemlist);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

    }
}