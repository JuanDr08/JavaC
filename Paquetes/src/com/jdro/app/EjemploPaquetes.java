package com.jdro.app; // package es la palabra reservada que basicamente nos permite definir el paquete al que pertenece esta clase

// Por lo general suele  llevar el mismo nombre que su carpeta o folder que contiene la clase

// Tambien hay que saber que la carpeta ' src ' es la carpeta raiz, por lo que por ejemplo en este caso, com.jdro haria referencia a la carpeta
// ' src ' por ser la raiz, el .app ya seria una sub carpeta que contiene otros archivos

// En resumen, la palabra reservada package nos permite definir el nombre del paquete o directorio al que esta clase pertenece
// Los package nos permiten tener orden en la creacion de nuestras clases y proyectos, permitiendonos tener clases de igual nombre
// pero en distintas direcciones
// Por convencion estas suelen empezar con la extension del dominio seguido del dominio, y cada palabra suele estar separada por ' . '
// Por ejemplo, si fuera un proyecto de google.com, la carpeta raiz y sus sub carpetas empezarian con ' com.google ' todo en minuscula

// A medida que se van creando sub paquetes dentro de paquetes, los nombres de cada sub paquete va heredando el nombre del paquete anterior
// y agregando un nuevo identificador, por ejemplo, si tenemos la raiz de google, y dentro de este tenemos el proyecto de google drive, y
// dentro de este tenemos varios sub paquetes que componen drive la composicion quedaria algo asi:
// com.google --> Raiz
// com.google.drive --> Proyecto de drive dentro de google
// com.google.drive.views --> Posible modulo o paquete que compone algo del proyecto de drive de google
// com.google.drive.domain --> Posible modulo o paquete que compone el dominio del proyecto de drive de google con arquitectura hexagonal

import com.jdro.app.hogar.Persona; // La palabra reservada import, seguido de una ruta que lleva a una clasae nos permite tener acceso
// completo en cualquier parte de esta clase a dicha clase, sin la necesidad de tener que andara a toda hora especificando la ruta de una clase
// como se puede ver en el primer ejemplo de acceder a clases que estan en otros paquetes

import com.jdro.app.hogar.*; // Si dentro del directorio o paquete tuvieramos varias clases que queremos usar, podriamos evitar el tener que
// hacer un import por cada clase que haya dentro de ese paquete, usando el signo asterisco despues de especificar el archivo de donde vamos a importar las clases
// En este caso estamos importando todas las clases que hayan dentro del paquete de ' hogar '
// En resumidas cuentas el ' * ' es como decir ' todo ', por lo que nos trae todo lo que haya en un directorio

public class EjemploPaquetes {

    public static void main(String[] args) {

        // Para poder utilizar clases que se encuentran en otros paquetes tenemos dos formas:
        // La primera es definiendo toda la ruta de la clase completa para poderla llamar

        com.jdro.app.hogar.Persona o = new com.jdro.app.hogar.Persona(); // De esta forma accedemos a la clase persona que esta en otro
        // directorio

        /* Desventajas
        * - Hace que el codigo sea menos legible
        * - Cada que quisieramos crear una nueva clase nos tocaria escribir toda la ruta completa
        * */
        /* Ventajas
        * - Si llegado el caso queremos usar dos clases con el mismo nombre, no podremos importarlas porque comparten el mismo nombre
        * por lo que usar este metodo especifico nos podria ayudar a que no ocurran errores en cuanto al nombre de clases, ya que tiene mayor
        * especificidad por decirlo asi
        * */

        // La segunda forma es utilizando el import en el encabezado del documento

        Persona p = new Persona(); // De esta forma ya estamos utilizando las importaciones de clases que se encuentran en paquetes

        /* Desventajas
        * - Llegado el caso tuvieramos que usar dos importaciones de clases con el mismo nombre, este metodo no nos lo permitiria, ya que para
        * acceder a cada una de las clases tendriamos que estar usando un mismo nombre de clase, y el programa no podria diferenciar entre
        * cual es cual, por lo que convendria mas usar la especificidad del metodo 1
        * */
        /* Ventajas
        * - Legibilidad de codigo
        * - Nos ahorra el tener que estar colocando en cada clase que usemos su ruta completa
        * - Importamos una vez y ya podemos seguir usandola en todo el archivo donde se importo
        * */

        Gato g = new Gato(); // Clase importada con el asterisco en los packages

        // ClaseDefault cd = new ClaseDefault();  Esta clase no nos deja instanciarla, por la sencilla razon de que es una clase default y estamos parados
        // sobre una clase en un package distinto al que contiene la clase que queremos instanciar, por lo que no podremos acceder a ella desde aca, pero si accedemos
        // desde por ejemplo la clase Persona si nos lo permitirá

        AtributosDefault ad = new AtributosDefault();

        ad.atributoDefault = "hola"; // Como se puede ver, nos marca error al tratar de acceder al atributo default desde una clase que es externa al package de la clase que contiene el atributo
        // pero si se es usado dentro de una clase que este dentro del mismo package si nos lo permitiria hacer, como se puede observar en ClaseDefautl
        ad.atributoPublico = "hola"; // Pero a uno definido como publico si nos deja

    }

}
