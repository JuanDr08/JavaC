import java.util.Scanner;

public class BuscarEnArreglos {

    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) a[i] = s.nextInt();

        System.out.println("Ingrese el numero que desea buscar");
        int num = s.nextInt();

        int i = 0;
        while(i < a.length && a[i] != num){ // Si encuentra la posicion en la que el num es igual al de la posicion del arreglo entonces para
            i++;
        }

        if(i == a.length) System.out.println("Numero no encontrado");
        else if (a[i] == num) System.out.println("Encontrado en la posicion: " + i);

    }

}
