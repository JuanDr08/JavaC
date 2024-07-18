import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Cuantos numeros va a registrar? --> ");
        int cantidad = s.nextInt();

        if (cantidad >= 10) {

            int min = 0;
            int numUser;
            for (int i = 0; i < cantidad; i++) {

                System.out.print("Ingrese el " + (i + 1) + " numero --> ");
                if (i == 0) min = s.nextInt();
                else {
                    numUser = s.nextInt();
                    min = numUser < min ? numUser : min;
                }

            }

            if ( min < 10 ) System.out.println("El número menor es menor que 10!" + min);
            else System.out.println("El numero menor es igual o mayor que 10!" + min);

        }

    }

}
