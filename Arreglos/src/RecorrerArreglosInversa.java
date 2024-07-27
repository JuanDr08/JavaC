import java.util.Arrays;

public class RecorrerArreglosInversa {

    public static void main(String[] args) {

        /* OTRA FORMA DE HABER DECLARADO EL ARREGLO, MEDIANTE DECLARACION, INSTANCIACION Y ASIGNACION EN UNO SOLO, PERO ESTA FORMA ES MAS QUE TODO PARA CUANDO CONOCEMOS LA LONGITUD
        DEL ARREGLO
        * String[] productos = {
        *   "Kingston",
            "Samsung",
            "Asus",
            "Chromecast",
            "Bicicleta"
        * }
        * */

        String[] productos = new String[5];
        productos[0] = "Kingston";
        productos[1] = "Samsung";
        productos[2] = "Asus";
        productos[3] = "Chromecast";
        productos[4] = "Bicicleta";

        Arrays.sort(productos);

        for(int i = 0; i < productos.length; i++) System.out.println("Para el indice " + i + " : " + productos[i]);

        // Forma numero 1 de imprimir o recorrer un arreglo a la inversa, mediante los accesores del indice

        for (int i = 0; i < productos.length; i++) System.out.println("Para i = " + (productos.length - 1 - i) + " valor: " + productos[productos.length - 1 - i]);

        // Forma numero 2 de recorrer arreglos a la inversa, mediante la expresion de recorrido del for

        for (int i = productos.length - 1; i >= 0; i--) System.out.println("para i = " + i + " valor " + productos[i]);

    }

}
