import java.util.Scanner;

public class MenoMayor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el primer numero --> ");
        Integer num1 = s.nextInt();

        System.out.print("Ingrese el segundo numero --> ");
        Integer num2 = s.nextInt();

        Integer max = num1 > num2 ? num1 : num2;
        Integer min = num2 < num1 ? num2 : num1;

        System.out.println("Numero mayor: " + max + "\nNumero meno: "+ min);

    }

}
