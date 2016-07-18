package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ground extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground);
        ArrayList<String> ground = new ArrayList<String>();
        ground.add("Ground-types are strong against : Fire, Electric, Poison, Rock, Steel");
        ground.add("Ground-types are weak against : Grass, Flying, Bug");
        ground.add("#026, Sandshrew");
        ground.add("#027, Sandslash");
        ground.add("#050, Diglett");
        ground.add("#051, Dugtrio");
        ground.add("#074, Geodude");
        ground.add("#075, Graveler");
        ground.add("#076, Golem");
        ground.add("#085, Onix");
        ground.add("#103, Cubone");
        ground.add("#104, Marowak");
        ground.add("#111, Ryhorn");
        ground.add("#112, Rhydon");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ground);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
