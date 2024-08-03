import java.util.Scanner;

public class EJOrdenUltimoPrimero {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] a = new int[10];
        int[] arr = new int[10];

        System.out.println("Registre 10 numeros:");
        for (int i = 0; i < a.length; i++) a[i] = s.nextInt();

        int aux = 0;
        for (int i = 0; i < a.length / 2; i++) {

            arr[aux++] = a[a.length - 1 - i];
            arr[aux++] = a[i];

        }

        for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);

    }

}
