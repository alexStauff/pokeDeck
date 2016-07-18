package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class fighting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fighting);
        ArrayList<String> fighting = new ArrayList<String>();
        fighting.add("Fighting-types are strong against :Normal,Ice, Dragons, Steel, Rock");
        fighting.add("Fighting-types are weak against : Flying, Psychic, poison, Bug, Ghost, Fairy");
        fighting.add("#056, Mankey");
        fighting.add("#057, Primeape");
        fighting.add("#066, Machop");
        fighting.add("#067, Machoke");
        fighting.add("#068, Machamp");
        fighting.add("#106, Hitmonlee");
        fighting.add("#107, HitmonChan");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fighting);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
