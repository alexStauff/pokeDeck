package edu.dsu_academy_desu.beastery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bug(View view)
    {
        Intent intent = new Intent(this,bug.class);
        startActivity(intent);
    }
    public void dragon(View view)
    {
        Intent intent = new Intent(this,dragon.class);
        startActivity(intent);
    }
    public void electric(View view)
    {
        Intent intent = new Intent(this,electric.class);
        startActivity(intent);
    }
    public void fairy(View view)
    {
        Intent intent = new Intent(this,fairy.class);
        startActivity(intent);
    }
    public void fighting(View view)
    {
        Intent intent = new Intent(this,fighting.class);
        startActivity(intent);
    }
    public void fire(View view)
    {
        Intent intent = new Intent(this,fire.class);
        startActivity(intent);
    }
    public void flying(View view)
    {
        Intent intent = new Intent(this,bug.class);
        startActivity(intent);
    }
    public void ghost(View view)
    {
        Intent intent = new Intent(this,ghost.class);
        startActivity(intent);
    }
    public void grass(View view)
    {
        Intent intent = new Intent(this,grass.class);
        startActivity(intent);
    }
    public void ground(View view)
    {
        Intent intent = new Intent(this,ground.class);
        startActivity(intent);
    }
    public void ice(View view)
    {
        Intent intent = new Intent(this,ice.class);
        startActivity(intent);
    }
    public void normal(View view)
    {
        Intent intent = new Intent(this,normal.class);
        startActivity(intent);
    }
    public void poison(View view)
    {
        Intent intent = new Intent(this,poison.class);
        startActivity(intent);
    }
    public void psychic(View view)
    {
        Intent intent = new Intent(this,psychic.class);
        startActivity(intent);
    }
    public void rock(View view)
    {
        Intent intent = new Intent(this,rock.class);
        startActivity(intent);
    }
    public void steel(View view)
    {
        Intent intent = new Intent(this,steel.class);
        startActivity(intent);
    }
    public void water(View view)
    {
        Intent intent = new Intent(this,water.class);
        startActivity(intent);
    }
}
