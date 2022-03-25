package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    List<Items> itemsList;
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item , parent , false);

        Items currentItems = itemsList.get(position);

        TextView itemsname = view.findViewById(R.id.text_donut);
        TextView itemNum = view.findViewById(R.id.itemsPrice);
        ImageView itemimg = view.findViewById(R.id.donut);



        itemsname.setText(currentItems.getItemName());
        itemimg.setImageResource(currentItems.getItemImge());
        itemNum.setText(""+currentItems.getItemPrice());


        return view;
    }
}
