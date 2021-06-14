package com.example.listview_intership;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class Myadapter extends BaseAdapter {
    int[] image;
    String[] name;
    Context context;
    LayoutInflater layoutInflater;


    public Myadapter(int[] image, String[] name, Context context) {
        this.image = image;
        this.name = name;
        this.context = context;
        layoutInflater =(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView =  layoutInflater.inflate(R.layout.raw_listview,null);

        ImageView iv1 = convertView.findViewById(R.id.iv1);
        TextView tv1 = convertView.findViewById(R.id.tv1);

        tv1.setText(name[position]);
        iv1.setImageResource(image[position]);

        return convertView;
    }
}
