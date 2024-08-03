import java.util.Scanner;

public class EJNumeroMasAlto {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] a = new int[7];

        System.out.println("Registre 7 numeros entre el 11 al 99");
        for (int i = 0; i < a.length; i++) a[i] = s.nextInt();

        int maxNum = 0;

        for (int i : a) maxNum = i > maxNum ? i : maxNum;

        System.out.println("maxNum = " + maxNum);

    }

}
