package edu.dsu_academy_desu.beastery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class rock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);
        ArrayList<String> rock = new ArrayList<String>();
        rock.add("Rock-types are strong against : Fire, Ice, Flying, Bug");
        rock.add("Rock-types are weak against : Fighting, Ground, Steel");
        rock.add("#074, Geodude");
        rock.add("#075, Graveler");
        rock.add("#076, Golem");
        rock.add("#111, Ryhorn");
        rock.add("#112, Rhydon");
        rock.add("#138, Omanyte");
        rock.add("#139, Omastar");
        rock.add("#140, Kabuto");
        rock.add("#141, Kabutops");
        rock.add("#142, Aerodactyl");
        rock.add("#149, Dragonite");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rock);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
