import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;

        a = new int[10];

        System.out.println("Ingrese 10 enteros");
        for (int i = 0; i < a.length; i++) a[i] = s.nextInt();

        for (int i = 0; i < a.length; i++) { // este for lo hacemos para saber cuantos pares existen y cuantos impares, con la finalidad
            // de conocer la longitud que deberá tener cada arreglo respectivamente
            if (a[i] % 2 == 0) totalPares++;
            else totalImpares++;
        }

        pares = new int[totalPares]; // Asignamos el resultado del conteo de impares y pares a la creacion de los arreglos con dicha longitud
        impares = new int[totalImpares];

        int p = 0; // Estas variables son declaradas para ir teniendo un control de los indices en los que van cada arreglo de pares e impares
        // ya que no podemos usar la variable i, porque aumenta en cada iteracion y puede llegar a saltarse indices de los arreglos si no
        // se cumple su respectiva condicion, por lo que llenaria de manera incorrecta el arreglo, dejando huecos entre sus indices
        int im = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) pares[p++] = a[i];
            else impares[im++] = a[i];
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) System.out.print(pares[i] + " ");

        System.out.println("\nImpares");
        for (int i = 0; i < impares.length; i++) System.out.print(impares[i] + " ");

    }

}
