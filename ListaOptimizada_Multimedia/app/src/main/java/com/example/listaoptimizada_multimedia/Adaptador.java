package com.example.listaoptimizada_multimedia;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.HolderCoches> {
    public static class HolderCoches extends RecyclerView.ViewHolder{
        TextView tModelo, tPotencia;
        ImageView iCoche;
        HolderCoches(View itemView){
            super(itemView);
            tModelo = itemView.findViewById(R.id.tModelo);
            tPotencia = itemView.findViewById(R.id.tPotencia);
            iCoche = itemView.findViewById(R.id.iCoche);
        }
    };
    private ArrayList<Coches> coches;
    private Context contexto;

    public Adaptador(Context contexto, ArrayList<Coches> coches){
        this.contexto = contexto;
        this.coches = coches;
    }
    @Override
    public HolderCoches onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.coches_datos,parent,false);
        return new HolderCoches(v);
    }
    @Override
    public void onBindViewHolder(HolderCoches elementoactual,int position){
        Coches coche = coches.get(position);
        elementoactual.tModelo.setText(coche.getModelo());
        elementoactual.tPotencia.setText(coche.getPotencia());
        elementoactual.iCoche.setImageResource(coche.getImagen());
    }
    @Override
    public int getItemCount(){
        return coches.size();
    }




}
