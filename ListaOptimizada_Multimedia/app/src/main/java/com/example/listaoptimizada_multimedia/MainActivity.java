package com.example.listaoptimizada_multimedia;

import android.os.Bundle;
import android.text.style.TtsSpan;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView ListaCoches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListaCoches = findViewById(R.id.ListaCoches);

        ArrayList<Coches> coches = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            coches.add(new Coches("Audi RS3", "400cv", R.drawable.imagenrs3));
            coches.add(new Coches("BMW M4", "450cv", R.drawable.imagenM4));
            coches.add(new Coches("FORD FOCUS RS", "350cv", R.drawable.imagenFOCUS));
        }
            ListaCoches.setHasFixedSize(true);
        ListaCoches.setLayoutManager(new LinearLayoutManager(this));
        Adaptador adaptador = new Adaptador(this, coches);
        ListaCoches.setAdapter(adaptador);




    }
}