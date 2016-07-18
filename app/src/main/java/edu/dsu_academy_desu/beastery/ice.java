package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice);
        ArrayList<String> ice = new ArrayList<String>();
        ice.add("Ice-types are strong against : Grass, Ground, Flying, Dragons");
        ice.add("Ice-types are weak against : Fire, Water, Ice, Steel");
        ice.add("");
        ice.add("#124, Jynx");
        ice.add("#131, Lapras");
        ice.add("#144, Articuno");
        ice.add("#147, Fratini");
        ice.add("#148. Dragonair");
        ice.add("#149, Dragonite");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ice);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
