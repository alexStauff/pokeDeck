package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class water extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        ArrayList<String> water = new ArrayList<String>();
        water.add("Water-types are strong against : Fire, Ground, Rock");
        water.add("Water-types are weak against : Water, Grass, Dragons");
        water.add("#007, Squirtle");
        water.add("@008, Wartortle");
        water.add("#009, Blastoise");
        water.add("#054, Psyduck");
        water.add("#055, Golduck");
        water.add("#060, Poliwag");
        water.add("#061, Poliwhirl");
        water.add("#062, Poliwrath");
        water.add("#072, Tentacool");
        water.add("#073, Tentacruel");
        water.add("#079, Slowpoke");
        water.add("#080, Slowbro");
        water.add("#086, Seel");
        water.add("#087, Dewgong");
        water.add("#090, Shellder");
        water.add("#091, Cloyster");
        water.add("#098, Krabby");
        water.add("#099, Kingler");
        water.add("#116, Horsea");
        water.add("#117, Seadra");
        water.add("#118, Goldeen");
        water.add("#119. Seaking");
        water.add("#120, Staryu");
        water.add("#121, Starmie");
        water.add("#129, Magikarp");
        water.add("#130, Gyarados");
        water.add("#131, Lapras");
        water.add("#134, Vaporeon");
        water.add("#138, Omanyte");
        water.add("#139, Omastar");
        water.add("#140, Kabuto");
        water.add("#141, Kabutops");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, water);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
