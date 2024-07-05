import javax.swing.JOptionPane;

public class EntradaEstandarVentana {

    public static void main(String[] args) {


        // Para la entrada estandar usaremos swing, que ya viene dentro de la API de JAVA por lo que no hace falta ser instalada
        String numeroStr = JOptionPane.showInputDialog("Conversor de sistemas", "Ingrese un numero entero"); // Esto nos abrirá una ventana que pedirá un dato, y lo devolverá en tipo string
        // como primer parametro recibe un componente padre, no tenemos entonces en null, como segundo parametro recibe un mensaje
        // JOptionPane es un clase con metodos estáticos
        int numeroDecimal = Integer.parseInt(numeroStr);
        // parseInt es un método estatico dentro de la clase Integer que nos permite convertir un string numerico a un entero
        System.out.println("numeroDecimal = " + numeroDecimal);


        String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);


        String mensajeOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);


        String mensajeHex = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHex);
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal; // estamos concatenando de manera compuesta con un operador de asignación, que suma y asigna el resultado
        mensaje += "\n" + mensajeHex;

        JOptionPane.showMessageDialog(null, mensaje); // Muestra una ventana con un mensaje



    }

}
