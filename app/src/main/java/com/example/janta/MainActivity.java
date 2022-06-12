package com.example.janta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView searchView = (SearchView) findViewById(R.id.search_view);

        ArrayList<numbers> data = new ArrayList<numbers>();
        data.add(new numbers(R.drawable.ic_launcher_background, "NATIONAL EMERGENCY NUMBER"));
        data.add(new numbers(R.drawable.police, "POLICE: 100"));
        data.add(new numbers(R.drawable.fire_brigade, "FIRE: 101"));
        data.add(new numbers(R.drawable.ambulance, "AMBULANCE: 102"));
        data.add(new numbers(R.drawable.ic_launcher_background, "Medical Helpline: 108"));
        data.add(new numbers(R.drawable.ndrf, "Disaster Management Service: 108"));
        data.add(new numbers(R.drawable.women, "Women Helpline"));
        data.add(new numbers(R.drawable.ic_launcher_background, "Women Helpline-(Domestic Abuse)"));
        data.add(new numbers(R.drawable.ic_launcher_background, "Air Ambulance"));
        data.add(new numbers(R.drawable.ic_launcher_background, "Aids Helpline"));
        data.add(new numbers(R.drawable.ic_launcher_background, "Anti Poison"));
        data.add(new numbers(R.drawable.ic_launcher_background, "Disaster Management(N.D.M.A)"));
        data.add(new numbers(R.drawable.ic_launcher_background, "EARTHQUAKE/FLOOD/DISASTER(N.D.R.F HeadQuaters)"));
        data.add(new numbers(R.drawable.ic_launcher_background, "Children in Difficult Situation"));

        GridView gridView = (GridView) findViewById(R.id.recyclerView);
        DataAdapter adapter = new DataAdapter(MainActivity.this, data);
        gridView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if (data.contains(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(MainActivity.this, "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }

        });
    }
}