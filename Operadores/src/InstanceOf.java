public class InstanceOf {

    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String";

        Integer num = 18;

        boolean b1 = texto instanceof String; // Practicamente nos permite verificar si una variable es de algun tipo de dato
        System.out.println("Texto es del tipo string = " + b1);

        // b1 = texto instanceof Integer --> Si trataramos esto nos saltaria error de sintaxis,
        // ya que texto esta declarado como un string y los strings no tienen absolutamente nada que ver con los Integer
        // ni siquiera tienen ancestros en comun, nada que los pueda unir, totalmente diferentes

        b1 = texto instanceof  Object; // Object es la clase padre de todos los objetos en java, todas las demas clases heredan de la clase Object
        System.out.println("Tipo object = " + b1);

        b1 = num instanceof  Integer;
        System.out.println("Num de tipo integer = " + b1);

        // b1 = num instanceof Logn --> No se puede, ya que pues todos son tipos numericos que representan enteros, lo unico que tienen en comun es que todos extenden de la clase number

        b1 = num instanceof  Number; // clase de la que heredan los tipos numericos como long, short, int, long, double, float, etc...
        System.out.println("Num tipo number = " + b1);

        b1 = num instanceof  Object;
        System.out.println("Num tipo objeto = " + b1);

        // b1 = b1 instanceof Boolean; --> Marca error, ya que b1 fue declarado con el boolean de tipo primitivo, este tipo de instanceof solo compara los valores de referencia, no con primitivos
        // por lo que habria que convertir a b1 de boolean a Boolean

    }

}
