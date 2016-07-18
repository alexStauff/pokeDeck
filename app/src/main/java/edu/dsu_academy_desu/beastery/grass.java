package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class grass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grass);
        ArrayList<String> grass = new ArrayList<String>();
        grass.add("Grass-types are strong against : Water, Ground, Rock");
        grass.add("Grass-types are weak against : Fire, Grass, Poison, Flying, Bug, Dragons, Steel");
        grass.add("");
        grass.add("#001, Bulbasaur");
        grass.add("@002, Ivyssaur");
        grass.add("#003, Venasuar");
        grass.add("#043, Oddish");
        grass.add("#044, Gloom");
        grass.add("#045, Vileplume");
        grass.add("#046, Paras");
        grass.add("#047, Parasect");
        grass.add("#069, Bellsprout");
        grass.add("#070, Weepinbell");
        grass.add("#071, Victrebell");
        grass.add("#102, Exeggcute");
        grass.add("#103, Exeggutor");
        grass.add("#114, Tangela");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grass);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
