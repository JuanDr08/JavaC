import java.util.Scanner;

public class EJHistograma {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[12];

        System.out.println("Ingrese 12 numeros entre 1 al 6");
        for (int i = 0; i < arr.length; i++) {

            int num = s.nextInt();
            if (num >= 1 && num <= 6) arr[i] = num;
            else {
                System.out.println("El numero " + num + " no entra dentro del rango, registre otro que si lo este");
                i--;
            }

        }

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i + 1) System.out.print("* ");
            }
            System.out.println();
        }

    }

}
