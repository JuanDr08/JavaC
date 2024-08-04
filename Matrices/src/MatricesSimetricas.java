public class MatricesSimetricas {

    public static void main(String[] args) {

        // Una matriz tiene una diagonal principal la cual es la diagonal del medio, y cuando la matriz es simetrica, los valores de la diagonal
        // superior son identicos, como un espejo a la diagonal inferior, es decir, si damos vuelta filas por columnas y obtenemos
        // exactamente la misma matriz con mismos valores entonces es simetrica

        // Esta matriz es simetrica, ya que si vemos desde la diagonal del medio, la que lleva muchos unos, y vemos la parte inferior
        // es exactamente igual a la superior, el numero 2 esta en opuestos, el 3 tambien, el 4 tambien, los 0 tambien, asi se ve una matriz simetrica
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };
        boolean simetrica = true;

        int i=0,j;

        // El funcionamiento de esto es un poco complejo de entender a simple visa, lo mejor seria observarlo detenidamente mediante la depuracion
        // o ir a esta clase: https://www.udemy.com/course/master-completo-java-de-cero-a-experto/learn/lecture/21063022#overview
        // para analizar la explicacion del profe
        while (i < matriz.length && simetrica) {
            j = 0;
            while (j < i && simetrica) {
                if(matriz[i][j] != matriz[j][i]) simetrica = false;
                j++;
            }
            i++;
        }

        if (simetrica) System.out.println("La matriz es simetrica");
        else System.out.println("La matriz no es simetrica");

    }

}
