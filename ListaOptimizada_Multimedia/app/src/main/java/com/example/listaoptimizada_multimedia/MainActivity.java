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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListaCoches = findViewById(R.id.ListaCoches);

        ArrayList<Coches> coches = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            Coches elemento = new Coches("","","");
            coches.add(elemento);
        }
            ListaCoches.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        ListaCoches.setLayoutManager(llm);
        Adaptador adaptador = new Adaptador(this, coches);
        ListaCoches.setAdapter(adaptador);
        adaptador.refrescar();




    }
}