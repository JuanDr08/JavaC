public class MatricesIdentidad {

    public static void main(String[] args) {

        // Basicamente lo que haremos es cambiar los valores de la diagonal principal por 1, ya que al crear una matriz por defecto, todo queda en 0
        // Entonces cambiareos unicamente los valores de la diagonal, a esto se le conoce como identidad o matriz unitaria

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j){ // cuando estos dos coinciden es porque nos encontramos en un valor de la diagonal
                    matriz[i][j] = 1;
                }

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
