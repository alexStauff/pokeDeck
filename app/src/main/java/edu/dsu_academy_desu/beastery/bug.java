package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class bug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);
        ArrayList<String> bug = new ArrayList<String>();
        bug.add("Bugs are strong against : Pyschic, Grass, Dragons");
        bug.add("Bugs are weak against : Fire, Fighting, Poison, Flying, Steel, Ghost, Fairy, Steel");
        bug.add("");
        bug.add("#010 ,Caterpie");
        bug.add("#011, Metapod");
        bug.add("#012, Butterfree");
        bug.add("#013, Weedle");
        bug.add("#014, Kakuna");
        bug.add("#015, Beednil");
        bug.add("#046, Paras");
        bug.add("#047, Parasect");
        bug.add("#048, Venonat");
        bug.add("#049, Venomoth");
        bug.add("#123, Scyther");
        bug.add("#127, Pinsir");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bug);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
