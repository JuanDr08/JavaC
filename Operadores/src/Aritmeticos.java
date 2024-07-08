import javax.swing.*;

public class Aritmeticos {

    public static void main(String[] args) {

        // Permiten realizar operaciones matematicas, suma, resta, multiplicación, division y tambien el resto (%)

        // SUMA

        int i = 5, j = 4, suma = i + j; // Otra forma de definir variables, cuando son del mismo tipo podemos separarlas con , y sin necesidad de volver a declarar el tipo

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j); // Tener cuidado a la hora de sumar enteros y concatenaciones, ya que si no las sabemos manejar podemos terminar concatenando den vez de sumando

        System.out.println("i + j = " + (i + j)); // Podemos tambien cambiar la prioridad de los operadores, encerrando en parentesis la suma de enteros, y que luego concatene

        // RESTA
        
        int resta = i - j;

        System.out.println("resta = " + resta);
        // System.out.println("i - j = " + i - j); El símbolo de resta no es reconocido por los strings como para realizar alguna concatenacion o algo, por lo que nos dará error si tratamos de restar en una concatenacion con operadores
        System.out.println("i - j = " + (i - j)); // Por lo que nos toca usar los parentesis para indicar que primero haga la operacion

        // MULTIPLICACION

        int multi = i * j;

        System.out.println("multiplicacion = " + multi);

        // DIVISION

        int div = i / j;
        System.out.println("div = " + div); // Dado que el tipo de la division es int y no tipo flotante, el resultado será aproximado al entero más cercano, por lo que nos tocaría cambiar el tipo a un float o doble

        float div2 = i / j; // A pesar de que la variable que los contiene es de tipo flotante, los literales no lo son, son enteros, por lo que el resultado que nos devolveria sería 1.0
        System.out.println("div2 = " + div2);

        div2 = (float) i / j; // Por lo que nos tocaria hacer un cast a las literales para convertirlas tambien en tipos flotantes y nos de finalmente el resultado exacto, basta con declararlo una vez
        System.out.println("div2 = " + div2);

        // RESTO

        int resto = i % j;
        System.out.println("resto = " + resto);

        // EJEMPLO DE NUMEROS PRIMOS

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0 ) {
            System.out.println("Numero par = " + numero);
        } else {
            System.out.println("Numero impar = " + numero);
        }

    }

}
