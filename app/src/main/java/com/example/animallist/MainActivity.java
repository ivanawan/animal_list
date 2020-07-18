package com.example.animallist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  private RecyclerView rvHewan;
  private ArrayList<Hewan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHewan = findViewById(R.id.recyclerView);
        rvHewan.setHasFixedSize(true);

        list.addAll(data.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvHewan.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        rvHewan.setAdapter(listAdapter);
    }
}
