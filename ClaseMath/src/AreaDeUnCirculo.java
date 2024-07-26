import java.util.Scanner;

public class AreaDeUnCirculo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo --> ");
        double r = s.nextDouble();

        double area = Math.PI * (Math.pow(r, 2));

        System.out.println("El area del circulo es: " + area);

    }

}
