import java.util.Arrays;

public class EjemploArreglos {

    public static void main(String[] args) {

        int[] numeros = new int[4]; // Creacion de un arreglo de enteros primitivos de longitud 4, por lo que java reservará 4 espacios en memoria
        // Pero por el momento, el valor en todos los indices es 0, ya que por el momento no le hemos asignado valores a cada uno de los indices

        numeros[0] = 1; // Asignacion de valores a cada uno de los indices del arreglo, Cada dato guardado debe ser compatible con el tipo del arreglo
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        // numeros[4] = 5; Esto nos mandaria error ya que el arreglo se sale fuera de los limites, por lo que le dimos un largo de 4 datos, y le estamos
        // asignando 5, de ninguna forma nos podemos exceder del largo que le asignamos

        int i = numeros[0]; // Creacion de una variable de tipo entero primitiva cuyo valor es el guardado en el indice 0 del arreglo numeros
        // esa es la forma en la que podemos acceder a valores guardados en indices especificos de un arreglo

        // Como ordenar un arreglo de Strings alfabeticamente

        String[] productos = new String[5];
        productos[0] = "Kingston";
        productos[1] = "Samsung";
        productos[2] = "Asus";
        productos[3] = "Chromecast";
        productos[4] = "Bicicleta";

        Arrays.sort(productos); // La clase arrays es una clase helper que viene en el jdk, la cual contiene el metodo sort, que nos permite ordenar un arreglo
        // segun lo que le pasemos, si son numeros los ordena de mayor a menor, si es strings alfabeticamente y asi sucesivamente

        // Arrays es una clase de ayudas, la cual dispone de metodos utiles para trabajar con arreglos

    }

}
