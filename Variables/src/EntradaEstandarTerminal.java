import javax.swing.*;
import java.util.Scanner;

public class EntradaEstandarTerminal {

    public static void main(String[] args) {


        // Para la lectura de la entrada estandar de datos por parte del usuario en la terminal usaremos una clase interna que viene incluida dentro del JDK llamada Scanner
        Scanner scanner = new Scanner(System.in); // Creamos una instancia de la clase scanner, un objeto, recibe un parametro el cual son los datos que se ingresan,
        // para ello le indicamos que los tome del sistema de entrada

        System.out.print("Ingrese un numero entero: "); // le tenemos que pedir al usuario que nos ingrese el dato
        // String numeroStr = scanner.nextLine(); // le indicamos al scanner que obtenga la línea del terminal que usuario ingrese, y lo devuelve en tipo string, cuando se ingresa el dato se guarda en esta variable

        // Sin embargo, Scanner nos ofrece un método que lee enteros en vez de strings, para ahorrarnos la conversion de string a int
        int numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr); Con esta clase nos ahorramos la conversion a int, pero con cuidado, ya que nos puede saltar error si se ingresa algo que no sea un número
        System.out.println("numeroDecimal = " + numeroDecimal);


        String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);


        String mensajeOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);


        String mensajeHex = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;

        System.out.println(mensaje);



    }

}
