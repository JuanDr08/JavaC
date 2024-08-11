package com.jdro.app.hogar;

class ClaseDefautl { // Cuando no le declaramos un modificador a una clase, esta por defecto toma un modificador llamado default
    // cuando la clase tiene el modificador default, basicamente y en resumidas cuentas nos va a restringir el acceso a esta clase unicamente
    // al nivel del package, es decir, solo podremos usar esta clase dentro de clases del mismo package, clases que esten por fuera del package no podran usarla

    public static void main(String[] args) {
        AtributosDefault ad = new AtributosDefault();
        ad.atributoDefault = "Llamando el default desde mismo nivel de package"; // Como podemos ver, no nos marca error al acceder al atributo default desde una clase que esta al mismo nivel
        // de la clase que contiene el atributo, es decir, en el mismo package
    }

}
