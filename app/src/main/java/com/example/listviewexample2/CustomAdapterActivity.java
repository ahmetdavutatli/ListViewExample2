package com.example.listviewexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("Ant", R.drawable.ant));
        animals.add(new Animal("Bear", R.drawable.bear));
        animals.add(new Animal("Cat", R.drawable.cat));
        animals.add(new Animal("Dog", R.drawable.dog));
        animals.add(new Animal("Elephant", R.drawable.elephant));

        final ListView listview = (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listview.setAdapter(adapter);
    }
}