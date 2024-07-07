public class Concatenacion {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor; // Concatenacion con el operador ' + '
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB= 5;

        System.out.println(detalle + numeroA + numeroB); /* Al tratar de realizar una operacion de numeros y concatenacion puede llegar a pasar el problema de que lo unico que haga
         sea concatenar todos los datos, sin realizar la operacion, esto puede depender de la posicion en donde realicemos la concatenacion, en este caso se realiza al inicio
         por lo que encuentra primero una cadena entonces asumirá que todo se trata de una cadena y concatenara*/

        System.out.println(numeroA + numeroB + detalle);
        /* Si movemos el detalle (que es la cadena) al final entonces lo primero que encontrara son dos numeros tratando de sumarse, por lo que realizara la operacion primero
        luego se encontrara con la cadena y realizara la concatenacion del resultado de la operacion con la cadena*/

        System.out.println(detalle + (numeroA + numeroB)); /* Si usamos los parentesis para encerrar la operacion cambiaremos el orden en el que se ejecutan las cosas, por lo
        que la operacion de los numeros se hará antes de la concatenacion, por lo que en este caso primero va a sumar y luego concatena*/

        // Por lo tanto, siempre hay que tener en cuenta el orden, y tambien la presedencia, que es el orden de ejecucion y el cómo los parentesis tienen mayor prioridad ante este

        String detalle2 = curso.concat(profesor); /* Otra forma de concatenar strings es mediante su metodo de la clase concat() el cual recibe como parametro el otro
         string que se desea concatenar, recordar que los strings son inmutables, por lo que el metodo concat no modificara ninguno de los dos strings sino que devolvera
         un nuevo string, una nueva instancia de string con el valor de la operación */
        System.out.println("detalle2 = " + detalle2);
        
        detalle2 = curso.concat(" con ".concat(profesor)); /* Incluso podemos usar el metodo concat dentro de otro metodo concat, esto con el fin de dar orden a la cadena */
        System.out.println("detalle2 = " + detalle2);
        detalle2 = curso.concat(" con ").concat(profesor); /* O bien podemos concatenar primero una y luego la otra usando dos concats seguidos */
        System.out.println("detalle2 = " + detalle2);

        // Esta forma de concatenar es mejor que usar los operadores +, ya que internamente cada que se usa el + se esta creando una nueva instancia de la clase string builder

    }

}
