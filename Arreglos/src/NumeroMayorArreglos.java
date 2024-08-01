import java.util.Scanner;

public class NumeroMayorArreglos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Ingrese 5 enteros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int max = 0;

        for (int i = 0; i < a.length; i++) {
            max = a[i] > max ? a[i] : max;
        }

        System.out.println("max = " + max);

    }

}
