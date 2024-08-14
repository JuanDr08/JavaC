package com.jdro.sobrecarga;

public class Calculadora {

    // En sencillas y resumidas cuentas la sobrecarga es un mismo metodo que tiene distintas implementaciones, en donde en cada una de ellas cambia el tipo de parametros que recibe
    // Para hacer sobrecarga es crucial que el metodo simplemente se diferencie en parametros, ya que si implementamos un mismo metodo con la misma cantidad y tipos de parametros nos saltará un error

    public int sumar(int a, int b) { // Metodo sumar, el cual recibe dos enteros primitivos como parametro
        return a + b;
    }

    public float sumar(float a, float b) { // Version del metodo sumar, el cual recibe dos flotantes primitivos como parametro
        return  a + b;
    }

    public float sumar(int a, float b) { // Version del metodo sumar, el cual recibe un flotante y un entero primitivo como parametro
        return a + b;
    }

    public float sumar(float a, int b) { // Version del metodo sumar, el cual recibe un flotante y un entero primitivo como parametro
        return a + b;
    }

    public double sumar(double a, double b){ // Version del metodo sumar, el cual recibe dos double primitivos como parametros
        return a + b;
    }

    public int sumar(String a, String b) { // Version del metodo sumar, el cual recibe dos Strings como parametros
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public int sumar(int a, int b, int c){ // Version del metodo sumar, el cual recibe tres enteros primitivos como parametros
        return a + b + c;
    }

    // Como podemos ver, existen multiples metodos ' sumar ', pero cada uno de ellos trabaja con distintos tipos de datos, todos los parametros son distintos y no se repiten, y en algunos casos, sus
    // procesos internos pueden llegar a varia con respecto al resto

    // A esto tambien se le puede llegar a llamar polimorfismo, ya que son distintas formas en la que un mismo metodo puede llegar a actuar dependiendo de lo que se le pase, ya que si, todos estos metodos
    // trabajan sobre uno mismo llamado ' sumar ' solo que dependiendo de lo que se le pase, este actua de una u otra manera

}
