package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class dragon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon);
        ArrayList<String> dragon = new ArrayList<String>();
        dragon.add("Dragons are strong against : Dragons");
        dragon.add("Dragons are weak against : Steel, Fairy");
        dragon.add("");
        dragon.add("#147, Fratini");
        dragon.add("#148. Dragonair");
        dragon.add("#149, Dragonite");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dragon);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
