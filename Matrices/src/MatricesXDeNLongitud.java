import java.util.Scanner;

public class MatricesXDeNLongitud {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la longitud con la que quiere ver la matriz:");
        int n = s.nextInt();

        String[][] matriz = new String[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j || j == n - i - 1){
                    matriz[i][j] = "x";
                }
                else matriz[i][j] = "_";
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
