package com.example.listaoptimizada_multimedia;

public class Coches {
    private String modelo;

    private String potencia;
    private String imagen;

    public Coches(String modelo, String potencia, String imagen){
        this.modelo = modelo;
        this.potencia = potencia;
        this.imagen = imagen;


    }
    public String getModelo(){ return modelo; }
    public String getPotencia(){ return potencia; }

}
