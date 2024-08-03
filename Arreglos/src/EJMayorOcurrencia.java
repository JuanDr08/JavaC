import java.util.Scanner;

public class EJMayorOcurrencia {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] nums = new int[10];

        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < nums.length; i++) nums[i] = s.nextInt();

        int actual = 0;
        int mayorConcurrido = 0;
        int contadorMayor = 0;
        int contActual = 0;

        for (int i : nums) {

            if (actual == 0) {
                actual = i;
                contActual++;
            } else if (i == actual) {
                contActual++;
            } else {
                if ( contActual > contadorMayor ) {
                    contadorMayor = contActual;
                    mayorConcurrido = actual;
                }
                actual = i;
                contActual = 1;
            }

        }

        System.out.println("Mayor concurrido es: " + mayorConcurrido + " con un total de repeticiones de: " + contadorMayor);

    }

}
