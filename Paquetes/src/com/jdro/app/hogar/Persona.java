package com.jdro.app.hogar; // Paquete que se encuentra dentro de otro paquete

public class Persona {

    ClaseDefautl cd = new ClaseDefautl(); // Ejemplo de que dentro del mismo package podemos usar una clase default, pero por fuera no nos lo permite
    // ClaseDefautl es una clase que fue declarada sin modificador de acceso por lo que se le otorga el default y la restringe solo al alcance del package, por eso
    // la podemos usar en esta clase Persona pero en EjemploPaquetes no

    public static String saludar(){ // Metodo para ejemplificar los imports estaticos, explicado en la clase EjemploPaquetes
        return "Hola a todos";
    }

    public static String atributoStatico; // Atributo para ejemplificar los imports estaticos, explicado en la clase EjemploPaquetes

}
