package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class poison extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poison);
        ArrayList<String> poison = new ArrayList<String>();
        poison.add("Poison-types are strong against : Grass, Fairies");
        poison.add("Poison-types are weak against : Poison, Ground, Rock, Ghost, Steel");
        poison.add("");
        poison.add("#001, Bulbasaur");
        poison.add("@002, Ivyssaur");
        poison.add("#003, Venasuar");
        poison.add("#013, Weedle");
        poison.add("#014, Kakuna");
        poison.add("#015, Beednil");
        poison.add("#023, Ekans");
        poison.add("#024, Arbok");
        poison.add("#029, Nidoran");
        poison.add("#030, Nidorina");
        poison.add("#031, Nidoqueen");
        poison.add("#029, Nidoran");
        poison.add("#030, Nidorino");
        poison.add("#031, Nidoking");
        poison.add("#041, Zubat");
        poison.add("#042, Golbat");
        poison.add("#043, Oddish");
        poison.add("#044, Gloom");
        poison.add("#045, Vileplume");
        poison.add("#048, Venonat");
        poison.add("#049, Venomoth");
        poison.add("#088, Grimer");
        poison.add("#089, Muk");
        poison.add("#092, Ghastly");
        poison.add("#093, Haunter");
        poison.add("#094, Gengar");
        poison.add("#109, Koffing");
        poison.add("#110. Weezing");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, poison);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
