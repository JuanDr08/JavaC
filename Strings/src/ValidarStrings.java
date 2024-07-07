public class ValidarStrings {

    public static void main(String[] args) {

        String curso = null;

        boolean esNull = curso == null; // Evaluamos si es nulo
        System.out.println("esNull = " + esNull);

        System.out.println(curso.toUpperCase());// Aunque sea nulo, nos va a permitir usar metodos, ya que es de la clase string, sin embargo, nos lanzara error al ejecutar el programa

        boolean esVacio = curso.length() == 0; // Nos devuelve un entero con la cantidad de caracteres que contiene la cadena, si da 0 quiere decir que esta vacio

        boolean esVacio2 = curso.isEmpty(); // basicamente realiza la misma comparacion que el anterior, solo que este metodo es específico para ver si tiene contenido o no

        boolean esBlanco = curso.isBlank(); // Este metodo realiza multiples validaciones, primero verifica si es nulo, segundo válida que sea distinto de empty "" y por último verifica que su contenido sea distinto a un espacio en blanco " "

    }

}
