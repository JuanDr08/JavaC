public class StringLiteralVSClase {

    public static void main(String[] args) {

        String curso = "Programación Java"; // Es uno de los pocos tipos en los que podemos crear la instancia en la literal, es decir asignar directamente el valor
        String curso2 = new String("Programación Java"); // Creamos una instancia de la clase string y se lo asignamos a curso 2

        // Todo objeto en java siempre es distinto a otros objetos, incluso a pesar que tengan el mismo valor
        
        boolean esIgual = curso == curso2; // Nos arroja false, ya que son dos instancias distintas, incluso aun asi tengan el mismo texto
        System.out.println("Diferentes instancias == = " + esIgual);

        // La manera correcta de comparar dos cadenas por su valor y no instancia es usando los metodos internos de la clase string

        esIgual = curso.equals(curso2); // El método equals retornará true, ya que este método compara el VALOR de la string, no el objeto ni referencia ni instancia, solo valor
        System.out.println("Cmparando por contenido = " + esIgual);
        
        // Comparar strings sin importar las mayúsculas o minusculas
        
        curso2 = "programación java";
        esIgual = curso.equalsIgnoreCase(curso2); // comparará ambos sin tomar en cuenta las mayúscuals o minusculas
        System.out.println("Comparacion sin tomar las mayus o minus = " + esIgual);

        // En java hay una particularidad, y esque si comparamos dos strings que fueron creados por medio de la literal, es decir directamente se les da el texto, y el texto es el
        // mismo y las comparamos, nos dará que es true, que ambas son iguales, esto se debe a que java al detectar esto lo que hace es no crear un nuevo objeto para optimizar
        // entonces en vez de crear una nueva instancia para curso3, lo que hace es asignar la referencia del curso que ya existe, entonces al final curso3 es igual a curso y no
        // igual a una nueva instancia de un string
        
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("Reasignación de una instancia existente a una nueva declaración de instancia, lo que da que son iguales = " + esIgual);

        // Basicamente en strings nunca deberemos comparar con los operadores de comparacion, es mejor hacerlo siempre con los metodos de la clase

    }

}
