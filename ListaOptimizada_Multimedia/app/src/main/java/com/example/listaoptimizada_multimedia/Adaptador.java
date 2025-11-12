package com.example.listaoptimizada_multimedia;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.HolderCoches> {
    public static class HolderCoches extends RecyclerView.ViewHolder{
        TextView tModelo, tPotencia;
        HolderCoches(View itemView){
            super(itemView);
            tModelo = itemView.findViewById(R.id.tModelo);
            tPotencia = itemView.findViewById(R.id.tPotencia);
        }
    };
    private ArrayList<Coches> coches;
    private Context contexto;

    public Adaptador(Context contexto, ArrayList<Coches> coches){
        this.contexto = contexto;
        this.coches = coches;
    }
    public void add(ArrayList<Coches> datos){
        coches.clear();
        coches.addAll(datos);

    }
    public void refrescar(){notifyDataSetChanged();}
    @Override
    public HolderCoches onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.coches_datos,parent,false);
        HolderCoches pvh = new HolderCoches(v);
        return pvh;
    }
    public void onBindViewHolder(HolderCoches elementoactual,int position){
        elementoactual.tModelo.setText(coches.get(position).getModelo());
        elementoactual.tPotencia.setText(coches.get(position).getPotencia());
    }
    @Override
    public int getItemCount(){return coches.size();}
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

}
