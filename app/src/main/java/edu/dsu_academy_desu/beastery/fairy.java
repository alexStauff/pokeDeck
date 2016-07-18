package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class fairy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fairy);
        ArrayList<String> fairy = new ArrayList<String>();
        fairy.add("Faries are strong against : Dragon, Fighting");
        fairy.add("Faires are weak against : Fire, Poison, Steel");
        fairy.add("");
        fairy.add("#035, Clefairy");
        fairy.add("#036, Clefable");
        fairy.add("#039, JigglyPuff");
        fairy.add("#040, Wigglypuff");
        fairy.add("#122, Mr. Mime");
        fairy.add("#147, Fratini");
        fairy.add("#148. Dragonair");
        fairy.add("#149, Dragonite");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fairy);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
