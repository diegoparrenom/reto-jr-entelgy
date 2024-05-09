package com.entelgy.challenge;

public class Gato extends Animal{

    private String tipo="gato";

    public Gato(){
    }
    
    @Override
    public String funcion(){
        return "ladra";
    }

    public String Describir(){
        return this.Describir_(this.tipo, this.funcion());
    }

    
}