public class SisemasNumericos {

    public static void main(String[] args) {

        // ---------------
        // SISTEMA BINARIO
        // ---------------
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("Numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal)); // covierte nuestro entero en binario pero lo da en formato string

        int numeroBinario = 0b111110100; // si damos el binario asi como asi entonces lo tomara como un entero normal, para que java entienda que es un binario deberemos agregar al inicio
        // un 0b, con esto el compilador de java asume que es un sistema binario
        System.out.println("numeroBinario = " + numeroBinario);

        // ---------------
        //  SISTEMA OCTAL
        // ---------------

        System.out.println("Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764; // Para indicar que este valor entero corresponde al sistema octal debemos ponerle al inicio el número un 0

        // -------------------
        // SISTEMA HEXADECIMAL
        // -------------------

        System.out.println("Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4; // Para indicar que se trata de un número del sistema hexadecimal debemos poner al inicio un 0x

    }

}
