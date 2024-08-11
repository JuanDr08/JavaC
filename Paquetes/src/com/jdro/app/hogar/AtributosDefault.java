package com.jdro.app.hogar;

public class AtributosDefault {

    String atributoDefault; // Al igual que con las clases default, los atributos default, es decir, a los que no se les declara un modificador de acceso
    // se les asigna de manera automatica un default, el cual en resumidas cuentas limita el acceso a estos atributos unicamente si la clase que los llama esta al mismo nivel de paquete
    // es decir, dentro del mismo paquete
    public String atributoPublico; // Ejemplo de un atributo con modificador publico, es decir, que permite que el atributo pueda ser accedido desde cualquier parte del programa

}
