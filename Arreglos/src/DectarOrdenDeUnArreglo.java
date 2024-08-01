import java.util.Scanner;

public class DectarOrdenDeUnArreglo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < a.length; i++) a[i] = s.nextInt();

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i+1]) descendente = true;

            if (a[i] < a[i+1]) ascendente = true;

        }

        if (ascendente && descendente) System.out.println("Arreglo desordenado");
        if (!ascendente && !descendente) System.out.println("Arreglo todos son iguales");
        if (ascendente && !descendente) System.out.println("Areglo ordenado de forma descendente");
        if (!ascendente && descendente) System.out.println("Arreglo ordenado de forma ascendente");
    }

}
