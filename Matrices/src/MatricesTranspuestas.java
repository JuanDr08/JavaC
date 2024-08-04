public class MatricesTranspuestas {

    public static void main(String[] args) {

        // En el ejemplo de matrices simetricas solamente comprobabamos que fuera transpuesta, es decir, que su lado opuesto fuera igual
        // pero solo era eso, una comprobacion, en este caso haremos una transcripcion, vamos a para los elementos de la matriz, a su lado opuesto

        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int aux;
        for (int i = 1; i < matriz.length; i++) { // No hay razon de que i empiece en 0 ya que en el siguiente for la validacion para que ese empiece
            // no se cumplirá, por lo que la primer fila de la matriz no se recorrera entonces la empezamos de 1 para ahorrar ese gasto de recursos
            for (int j = 0; j < i; j++) { // Aca decimos que mientras j sea menor que i, esto con la finalidad de que la matriz no se recorra en su
                // totalidad, ya que si esto pasa, los elementos que fueron  cambiados volverán a su posicion inicial, entonces solo recorremos la mitad
                // y ademas con esto nos evitamos la comprobacion de la diagonal principal, ya que esta siempre se mantendrá igual
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("Matriz transpuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
