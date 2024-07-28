public class CreacionMetodoOrdenamiento {

    public static void sortBurbuja(Object[] arr) { // Se define un metodo estatico para poder acceder a el desde main
        // lo curioso aca es que como sabemos, en java nos toca siempre definir el tipo de dato que se recibira o que almacenara algo,
        // entonces, como es posible que a este metodo le pasemos arreglos de diferentes tipos (Strings, Integers, etc...), no podemos
        // definir el metodo con un tipo de dato especifico, ya que nos generaria error al pasarle un arreglo de otro tipo, por lo
        // que para este caso definimos que el tipo de dato que se espera recibir será un tipo Objeto, el tipo mas generico y el tipo
        // padre del cual descienden todos los demas objetos, por lo que ahora no habria problema al recibir arreglos de otros tipos de datos
        int longitud = arr.length;
        // Revisar la clase 101 para mayor comprension de este algoritmo
        for (int i = 0; i < longitud - 1; i++) {
            for (int j = 0; j < longitud - 1 - i; j++) {
                if( ( (Comparable) arr[j+1]).compareTo(arr[j]) < 0) { // Como la clase padre Object no cuenta con la interfaz comparable
                    // nos toca hacer un cast, para hacer que el valor de arr se vuelva de tipo comparable y nos permita utilizar el metodo
                    // compareTo

                    Object aux = arr[j]; // Como ahora estamos trabajando con un arreglo de objetos, sin saber de que tipo entonces nos toca
                    // almacenar los datos en un mismo tipo objeto
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }

    }

    public static void main(String[] args) {

        // Esta clase es creada simplemente para aplicar el metodo burbuja como un metodo externo al main, esto con el fin de hacer
        // dicho metodo reutilizable y que sin importar el arreglo que le pasemos, lo pueda ordenar, ademas se usará algo interesante
        // para que no hayan problemas con el tipo de arreglo que le pasemos

        String[] productos = { "Kingston", "Samsung", // Definimos un arreglo de strings
                "Asus", "Chromecast", "Bicicleta" };

        sortBurbuja(productos); // Se envia un arreglo de Strings, y como el metodo recibe Object entonces no habran interferencias

        for (int i = 0; i < productos.length; i++) System.out.println("productos = " + productos[i]);

        Integer[] numeros = {10, 7, 35, -1}; // Definimos un arreglo de enteros de referencia

        sortBurbuja(numeros); // Se envia un arreglo de Integers, y como el metodo recibe Object entonces no hay problema, ya que es el padre

        for (int i = 0; i < numeros.length; i++) System.out.println("numeros = " + numeros[i]);

    }

}
