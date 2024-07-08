public class Incrementales {

    public static void main(String[] args) {

        // Hay dos categorias, los incrementales y decreméntales, pero entre ellos tenemos los pre-incrementales y post-incrementales

        // Pre-Incremento
        int i = 1;
        int j = ++i; // Aca primero se realiza la incrementacion de i y luego se asigna a j, entonces ambas variables valdria 2, ya que i aumenta a dos y se asigna a j

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-Incremento
        i = 2;
        j = i++; // Primero se va a asignar el valor actual de i y después se incrementa, por lo que i quedaria en 3 y j en 2

        // Pre-Decremento
        i = 3;
        j = --i; // Se decrementa y luego se asigna a j

        // Post-Decremento
        i = 4;
        j = i--; // Primero se asigna " i " a " j " y luego se decrementa

        System.out.println("j = " + (++j)); // Primero se incrementa y despues se imprime
        System.out.println("j = " + (j++)); // Primero se asigna, ósea primero imprime y despues lo incrementa, por lo que el valor final no sería realmente el impreso

    }

}
