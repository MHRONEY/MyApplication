package com.example.a.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] fruit;
    private final String[] color;
    private final Integer[] image;

    public MyListAdapter(Activity context, String[] fruit,String[] color, Integer[] image) {
        super(context, R.layout.mycustom, fruit);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.fruit=fruit;
        this.color=color;
        this.image=image;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mycustom, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(fruit[position]);
        imageView.setImageResource(image[position]);
        subtitleText.setText(color[position]);

        return rowView;

    };
}