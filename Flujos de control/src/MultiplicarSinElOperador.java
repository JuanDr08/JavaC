import java.util.Scanner;

public class MultiplicarSinElOperador {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el primer numero a multiplicar --> ");
        int num1 = s.nextInt();
        System.out.print("Ingrese el segundo numero a multiplicar --> ");
        int num2 = s.nextInt();

        int iterador = num2 < 0 ? -num2 : num2;
        int total = 0;

        for (int i = 0; i < iterador; i++) {
            total += num1;
        }

        if ( (!(num1> -1) && !(num2 > -1 )) || !(num2 > -1) ) total = -total;
        System.out.println("El resultado de la multiplicacion es: " + total);

    }

}
