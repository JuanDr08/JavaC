public class CicloWhile {

    public static void main(String[] args) {

        // Es muy parecido a un for, ya que consta de la declaracion de la variable, le evaluacion de una expresion y la incrementacion de dicha variable

        int i = 0;
        while (i<=5) { // La idea de un while es ejecutar un bloque de codigo mientras se cumpla una condicion
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;
        while (prueba) { // De esta manera podemos hacer un bucle infinito, ya que prueba siempre seria true

            // Dentro de el bloque ya podriamos especificar algun caso en el que prueba pase a ser false y el bucle termine
        }

        prueba = false;
        do {
            System.out.println("Se ejecuta al menos una vez aunque la condicion de inicio sea falsas desde el principio");
        } while (prueba); // El bucle do while, es un bucle precondicion, es decir, primero realiza una iteracion del bloque y despues evalua la expresion para ver si vuelve a iterar

    }

}
