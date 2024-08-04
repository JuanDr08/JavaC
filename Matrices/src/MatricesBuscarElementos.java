public class MatricesBuscarElementos {

    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978}, // Fila 1
                {15, 2020, 10, 5}, // Fila 2
                {677, 127, 32767, 1999} // Fila 3
        };

        int elementoBuscar = 1999;
        boolean encontrado = false;

        int i; // Las definimos por fuera para poder conocer las coordenadas en las que encontro el elemento y se salio
        int j = 0;
        // Se define una tag para poder terminar un for especifico
        buscar:
        for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if(matrizDeEnteros[i][j] == elementoBuscar) { // Recordar, estamos trabajando con una matriz de enteros primitivos, por lo que podemos
                    // usar el comparador de doble igualdad, pero si estuvieramos trabajando con referencias como Integers, Strings, etc... deberiamos
                    // estar usando el metodo equals()
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado) System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + ", " + j);
        else System.out.println(elementoBuscar + " no se encontro en la matriz");

    }

}
