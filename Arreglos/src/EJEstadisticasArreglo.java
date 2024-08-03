import java.util.Scanner;

public class EJEstadisticasArreglo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] num = new int[7];

        System.out.println("Ingrese 7 numeros, pueden ser positivos, negativos, o ceros:");
        for (int i = 0; i < num.length; i++) num[i] = s.nextInt();

        double promPos = 0, promNeg = 0;
        int contPos = 0;
        double contNeg = 0, contCero = 0;

        for(int i : num) {

            if ( i > 0 ) {
                promPos += i;
                contPos++;
            } else if (i < 0) {
                promNeg += i;
                contNeg++;
            } else contCero++;

        }

        System.out.println("Promedio positivos: " + (promPos / contPos));
        System.out.println("Promedio negativos: " + (promNeg / contNeg));
        System.out.println("Total de ceros: " + contCero);

    }

}
