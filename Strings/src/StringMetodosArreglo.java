public class StringMetodosArreglo {

    public static void main(String[] args) {

        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray()); // Convierte el string en un arreglo de caracteres, arreglo de tipo char, la unica forma de ver los elementos de un arreglo
        // en java es mediante la iteracion del arreglo

        System.out.println("trabalengua.split(\"a\") = " + trabalengua.split("a")); // Lo que hace es dividir la cadena, tomando como punto para partir la cadena el caracter especificado, es decir,
        // en donde encuentre en este caso una " a " va a dividir en dos pedazos, sin incluir la lengua, por ejemplo: tr - b - lengu - s, creando un arreglo con los caracteres restantes

        // Si llegado algún momento deseamos splitear una cadena usando como caracter separante un " . ", es importante saber que el punto asi a secas no va a funcionar, ya que el . es un caracter especial
        // de las expresiones regulares, por lo que para poder indicar que nos referimos al caracter . tenemos que escaparlo, ósea, plazmarlo asi \\.

        String archivo = "alguna_imagen.jpg";
        archivo.split("\\."); // Escapamos el . para indicar que es literalmente el caracter punto y no de expresiones regulares
        // tambien podemos especificar el caracter con [] para indicar que es un caracter normal
        archivo.split("[.]");

    }

}
