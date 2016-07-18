package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ghost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghost);
        ArrayList<String> ghost = new ArrayList<String>();
        ghost.add("Ghosts are strong against : Psychic, Rock");
        ghost.add("Ghosts are weak against : Normal, Dragons");
        ghost.add("");
        ghost.add("#092, Ghastly");
        ghost.add("#093, Haunter");
        ghost.add("#094, Gengar");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ghost);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
