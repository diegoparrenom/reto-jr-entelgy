package com.entelgy.challenge;


public abstract class Animal {
    
    private String nombre = null;
    private String edad = null;
    private String raza  = null;
    private int tiempoDeVida = 0;
    public abstract String funcion();

    public Animal(){
    }
    public Animal(String _nombre, String _edad, String _raza, int _tiempoDeVida){
        this.nombre = _nombre;
        this.edad = _edad;
        this.raza = _raza;
        this.tiempoDeVida = _tiempoDeVida;
    }
    public void CargarDatos(String _nombre, String _edad, String _raza, int _tiempoDeVida){
        this.nombre = _nombre;
        this.edad = _edad;
        this.raza = _raza;
        this.tiempoDeVida = _tiempoDeVida;  
    }
    public String getNombre(){

        return nombre;
    }

    public String Describir_(String _tipo, String _realizarSonido){
        return 
       this.nombre + "es un " + _tipo  + "de raza "+ this.raza + "que tiene "+ this.edad + 
       " de edad. Siempre " + _realizarSonido + " cuando está feliz. Su expectativa de vida es de" + 
       this.tiempoDeVida + "años.";
        
    }
}
