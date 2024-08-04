public class MatricesColumnasTamaniosVariables {

    public static void main(String[] args) {

        // Las matrices si o si requieren que se definan la cantidad de filas, pero nos permite flexibilidad en cuanto a las columnas que cada
        // fila puede tener, es decir, podemos definir 3 filas, pero dentro de cada fila, la cantidad de columnas puede variar

        int[][] matriz = new int[3][];// no definimos el tamaño de las columnas por lo que puede variar segun la fila

        // De igual manera nos toca definir el tamaño que tendran las columnas de cada fila, y es aca donde podemos definir distintos tamaños
        matriz[0] = new int[2]; // tamaño de 2
        matriz[1] = new int[3]; // tamaño de 3
        matriz[2] = new int[4]; // tamaño de 4

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
