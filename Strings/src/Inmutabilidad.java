public class Inmutabilidad {

    public static void main(String[] args) {

        /* Como bien sabemos los strings en java son inmutables, es decir, desde el primer momento en el que sé instancia un string este jamás cambiara su valor inicial
        sino que al aplicar metodos u operaciones lo que hacen es devolver una nueva instancia con el resultado de la nueva cadena, por lo que no afecta al principal */

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";
        
        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado3 = resultado.replace("a", "A"); // este metodo buscará todos los caracteres indicados en el primer parametro
        // y los reemplaza por el que esta en el segundo
        System.out.println("resultado = " + resultado); /* Se observa como resultado sigue siendo el mismo string del inicio que se asignó, no cambia por más modificaciones
        que se le hagan */
        System.out.println("resultado3 = " + resultado3); // resultado3 queda con el valor retornado de la operacion que se le hizo a resultado

    }

}
