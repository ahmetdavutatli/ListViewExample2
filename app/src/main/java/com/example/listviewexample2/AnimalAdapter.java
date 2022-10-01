package com.example.listviewexample2;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Animal> animals;

    public AnimalAdapter(Activity activity, List<Animal> animals) {
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.animals = animals;
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int i) {
        return animals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowview;
        rowview = mInflater.inflate(R.layout.listview_row, null);

        ImageView imageView = (ImageView) rowview.findViewById(R.id.pic);

        TextView textView = (TextView) rowview.findViewById(R.id.label);

        Animal animal = animals.get(i);
        imageView.setImageResource(animal.getPicId());
        textView.setText(animal.getType());
        return rowview;
    }
}
