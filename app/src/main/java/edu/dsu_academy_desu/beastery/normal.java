package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class normal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        ArrayList<String> normal = new ArrayList<String>();
        normal.add("Normal-types are strong against : Nothing");
        normal.add("Normal-types are weak against : Rock, Ghost, Steel");
        normal.add("");
        normal.add("#016, Pidgey");
        normal.add("#017, Pidgeotto");
        normal.add("#018, Pidgeot");
        normal.add("#019, Rattata");
        normal.add("#020, Raticate");
        normal.add("#021, Spearow");
        normal.add("#022, Fearow");
        normal.add("#039, JigglyPuff");
        normal.add("#040, Wigglypuff");
        normal.add("#052, Meowth");
        normal.add("#053, Persian");
        normal.add("#083, Farfetch'd");
        normal.add("#084, Doduo");
        normal.add("#085, Dodrio");
        normal.add("#108, Lickitung");
        normal.add("#113, Chansey");
        normal.add("#115, Kangaskhan");
        normal.add("#128, Tauros");
        normal.add("#132, Ditto");
        normal.add("#133. Eevee");
        normal.add("#137, Porygon");
        normal.add("#143, Snorlax");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, normal);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
