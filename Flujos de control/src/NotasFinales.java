import java.util.Scanner;

public class NotasFinales {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double prom5 = 0.0;
        double promMenor4 = 0.0;
        double promTotal = 0.0;
        int cantidad5 = 0;
        int cantidad4 = 0;
        int cantidad1 = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print("Ingrese la nota #" + (i + 1) + " (1-7) --> ");
            double nota = s.nextDouble();

            if(nota == 0.0) {
                System.out.print("Error finalizando el programa");
            } else if (nota >= 5.0) {
                prom5 += nota;
                promTotal += nota;
                cantidad5++;
            } else if (nota <= 4) {
                if (nota == 1.0) cantidad1++;
                promMenor4 += nota;
                promTotal += nota;
                cantidad4++;
            }

        }

        System.out.println("Promedio de notas mayores a 5: " + (prom5 / cantidad5));
        System.out.println("Promedio de notas menores a 4: " + (promMenor4 / cantidad4));
        System.out.println("Cantidad de notas en 1: " + cantidad1);
        System.out.println("Promedio total: " + (promTotal / 20));

    }

}
