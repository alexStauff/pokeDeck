package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class electric extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric);
        ArrayList<String> electric = new ArrayList<String>();
        electric.add("Electric-types are strong against : Water, Flying");
        electric.add("Electric-types are weak against : Electric, Grass, Ground, Dragons");
        electric.add("");
        electric.add("#025, Pikachu");
        electric.add("#026, Raichu");
        electric.add("#081, Magnemite");
        electric.add("#082, Magneton");
        electric.add("#100, Voltorb");
        electric.add("#101, Electrode");
        electric.add("#125, Electabuzz");
        electric.add("#135, Jolteon");
        electric.add("#145, Zapdos");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, electric);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
