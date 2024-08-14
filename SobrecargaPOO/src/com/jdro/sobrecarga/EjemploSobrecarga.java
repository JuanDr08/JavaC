package com.jdro.sobrecarga;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();


        // Aca podremos apreciar mejor el funcionamiento de la sobrecarga, en donde dependiendo del tipo de dato que le pasemos, se usara
        // uno u otro metodo sobrecargado, pero todos son un mismo metodo llamado ' sumar ', solo que cambia su ejecucion o tipo de datos aceptados
        // y se usa el que corresponde
        System.out.println("sumar int: " + cal.sumar(10, 5)); // se usa el que recibe dos int
        System.out.println("sumar float: " + cal.sumar(10.0f, 5f)); // se usa el que recibe dos float
        System.out.println("sumar float int: " + cal.sumar(10f, 5)); // se usa el que recibe float - int
        System.out.println("sumar int float: " + cal.sumar(10, 5.0f)); // se usa el que recibe int - float
        System.out.println("sumar double: " + cal.sumar(10, 5D)); // se usa el que recibe double
        System.out.println("sumar Strings: " + cal.sumar("10", "5")); // se usa el que recibe string
        System.out.println("sumar 3 enteros: " + cal.sumar(10, 5, 3)); // se usa el que recibe 3 parametros
        // Como se pudo apreciar, todos son el metodo sumar, solo que este puede recibir varias posibilidades de parametros y esto gracias a la sobre
        // carga, y puede que en algunos como el de strings realice un proceso un poco diferente internamente

        // si tratamos de usar el metodo sumar, con datos que por ejemplo no definimos un metodo para ese tipo de datos, lo que hará java automaticamente
        // es buscar sus tipos compatibles, es decir, buscar lo mas cercano al tipo de dato que le estamos pasando y usar dicho metodo encontrado
        System.out.println("sumar long" + cal.sumar(10L, 5L)); // En el caso de Long, el tipo de dato mas cercano compatible es float, por lo que en este
        // ejemplo, el metodo sobrecargado que elegira java para usasr es el de float, aunque le estemos pasando long

        System.out.println("sumar int: " + cal.sumar(10, '@')); // Los caracteres unicode, no son solo caracteres, ya que estos en la tabla unicode
        // tienen representaciones decimales, osea numeros, por lo que en este caso java lo que hará con este caracter es tomar su valor decimal y usarlo como parametro
        // el valor decimal de la @ es --> 64, por lo que tomara el metodo sobrecargado de doble int y sumara 10 + 64
        System.out.println("sumar int: " + cal.sumar(10F, '@')); // lo mismo que el anterior solo que tomara el de float - int
    }

}
