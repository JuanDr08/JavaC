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


    // Existe una forma de definir un metodo que pueda recibir una cantidad ilimitada de parametros de un mismo tipo, y es parecido al operador spread de JS
    // Todos estos parametros que se le sean pasados al metodo serán almacenados en un arreglo con el nombre que le hayamos asignado, y para acceder a ellos deberá ser con un for de toda la vida
    public int sumar(int... argumentos){ // Definimos que este metodo sobrecargado de sumar puede recibir la cantidad de parametros que le queramos pasar sin limite y que sean del tipo primitivo int
        // Todos los que se le sean pasados serán guardados en un arreglo llamado argumentos
        int total = 0;
        for (int i = 0; i < argumentos.length; i++) total += i;
        return  total;
    }

    // Tambien podemos definir mas parametros aparte de el del operador spread, el cual es importante que sea el ultimo en ser definido, y ademas podremos tambien aplicar sobrecarga usando este spread
    public float sumar(float a, int... argumentos){ // Definimos el metodo sobrecargado sumar, el cual recibe cuantos parametros querramos pasarle, pero el primero de ellos sera requerido como
        // un float y se almacenará en la variable ' a ', y de ahi en adelante el resto de parametros serán tomados como parte del arreglo al que llamamos ' argumentos '
        float total = a;
        for (int i = 0; i < argumentos.length; i++) total += i;
        return  total;
    }

}
