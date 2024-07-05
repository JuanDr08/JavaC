import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la factura o su descripcion --> ");
        String name = scanner.nextLine();

        System.out.print("Ingrese el precio del primer producto --> ");
        double prdt1 = scanner.nextDouble();
        System.out.print("Ingrese el precio del segundo producto --> ");
        double prdt2 = scanner.nextDouble();

        double bruto = prdt1 + prdt2;
        double impuesto = bruto * 0.19;

        String mensaje = "La factura " + name + " tiene un total bruto de " + bruto + ", con un impuesto de " + impuesto + " y el monto después de impuesto es de " + (bruto + impuesto);
        System.out.println(mensaje);

    }

}
