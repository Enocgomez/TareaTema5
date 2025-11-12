package com.example.listaoptimizada_multimedia;

public class Coches {
    private String modelo;

    private String potencia;
    public int imagen;

    public Coches(String modelo, String potencia, int imagen){
        this.modelo = modelo;
        this.potencia = potencia;
        this.imagen = imagen;


    }
    public String getModelo(){ return modelo; }
    public String getPotencia(){ return potencia; }
    public int getImagen() { return imagen; }

}
