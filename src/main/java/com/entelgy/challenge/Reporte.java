package com.entelgy.challenge;

import java.io.IOException;
import com.entelgy.challenge.Animal;
import com.entelgy.challenge.Perro;

public class Reporte {
    
    public static void main( String[] args ) throws IOException
    {
       
         Animal Perro = new Perro();
         Perro.CargarDatos("perro1","12","raza1",4);

         Animal Gato = new Gato();
         Perro.CargarDatos("gato1","15","raza6",10);

         Animal Vaca = new Vaca();
         Perro.CargarDatos("vaca1","8","brown",12);

         Perro.Describir();
        
        System.out.println( Perro.Describir());
    }
}
