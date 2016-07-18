package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class fire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ire);
        ArrayList<String> fire = new ArrayList<String>();
        fire.add("Fire-types are strong against :Grass, Ice, Bug, Steel ");
        fire.add("Fire-types are weak against : Fire, Water, Rock, Dragon");
        fire.add("");
        fire.add("@004, Charmander");
        fire.add("#005, Charmeleon");
        fire.add("#006, Charizard");
        fire.add("#037, Vulpix");
        fire.add("#038, Ninetails");
        fire.add("#058, Growlith");
        fire.add("#059, Arcanine");
        fire.add("#077, Ponyta");
        fire.add("#078, Rapidash");
        fire.add("#126, Magmar");
        fire.add("#136, Flareon");
        fire.add("#146, Moltres");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fire);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
