package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class flying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flying);
        ArrayList<String> flying = new ArrayList<String>();
        flying.add("Flying-types are strong against : Grass, Fighting, Bugs");
        flying.add("Flying-types are weak against : Electric, Rock,  Steel");
        flying.add("");
        flying.add("#016, Pidgey");
        flying.add("#017, Pidgeotto");
        flying.add("#018, Pidgeot");
        flying.add("#021, Spearow");
        flying.add("#022, Fearow");
        flying.add("#041, Zubat");
        flying.add("#042, Golbat");
        flying.add("#083, Farfetch'd");
        flying.add("#084, Doduo");
        flying.add("#085, Dodrio");
        flying.add("#123, Scyther");
        flying.add("#142, Aerodactyl");
        flying.add("#144, Articuno");
        flying.add("#145, Zapdos");
        flying.add("#146, Moltres");



        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, flying);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
