package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class psychic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychic);
        ArrayList<String> pyschic = new ArrayList<String>();
        pyschic.add("Psychic-types are strong against : Fighting, poison");
        pyschic.add("Psychic-types are weak against : Psychic, Steel");
        pyschic.add("#063, Abra");
        pyschic.add("#064, Kadabra");
        pyschic.add("#065, Alakazam");
        pyschic.add("#079, Slowpoke");
        pyschic.add("#080, Slowbro");
        pyschic.add("#096, Drowzee");
        pyschic.add("#097, Hypno");
        pyschic.add("#102, Exeggcute");
        pyschic.add("#103, Exeggutor");
        pyschic.add("#122, Mr. Mime");
        pyschic.add("#124, Jynx");
        pyschic.add("#150, Mewtwo");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pyschic);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
