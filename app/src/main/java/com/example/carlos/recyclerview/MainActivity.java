package com.example.carlos.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rw;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series = new ArrayList<>();
        rw = findViewById(R.id.recycler);
        rw.setHasFixedSize(true);
        lManager = new LinearLayoutManager(this);
        rw.setLayoutManager(lManager);

        prepareSeries();
        adapter = new SeriesAdapter(series);
        rw.setAdapter(adapter);
    }

    private void prepareSeries() {
        String TAG = "Mensaje";
        series = new ArrayList<>();
        series.add(new Serie("Friends","300",R.drawable.friends,"Friends es una serie de televisión estadounidense creada y producida por Marta Kauffman y David Crane. Se emitió por primera vez el 22 de septiembre de 1994 por la cadena NBC y terminó el 6 de mayo de 2004."));
        series.add(new Serie("Breaking Bad","75",R.drawable.breaking_bad,"Breaking Bad es una serie de televisión dramática estadounidense creada y producida por Vince Gilligan."));
        series.add(new Serie("American Horror History","13",R.drawable.horror_story,"American Horror Story es una serie de televisión de drama y horror creada y producida por Ryan Murphy y Brad Falchuk. "));

    }
}
