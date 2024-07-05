public class PrimitivosChar {

    public static void main(String[] args) {

        // solo admiten un unico caracter
        // Está basado en el estandar de codificación UNICODE, podemos revisar las tablas de cada caracter para observar su código
        // En linux podemos observar estas tablas con sus códigos escribiendo Caracteres en la búsqueda de aplicaciones
        char caracter = 'a'; // En string se usan comillas dobles, en caracteres se usan comillas simples

        // Hay tres formas de representar los caracteres de UNICODE
        char unicode = '\u0040'; // Si usáramos var en vez de char igual reconocería como char de tipo UNICODE
        char unicode2 = 64; // Si usáramos var esto no lo reconocería como UNICODE sino como entero
        char unicode3 = '@';
        System.out.println("unicode = " + unicode);

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en byte = " + Character.SIZE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE); // Como valor maximo nos dará que es un caracter
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE); // Como valor minimo nos dará que es un espacio en blanco

        // ========================================================================
        //                         Caracteres especiales
        // ========================================================================

        // Caracter de espacio, se utiliza para separar palabras, se puede concatenar
        char espacio = ' ';

        // Caracter de retroceso, funciona como la tecla de borrar, quita de a un caracter atras
        char retroceso = '\b';

        // Caracter de tabulación, deja un espacio más amplio, como presionar la tecla tab
        char tabulador = '\t';

        // Caracter de salto de línea, es como si usaramos la tecla enter
        char saltoDeLinea = '\n';

        // Caracter de retorno carro, hace una función similar al salto de línea
        char retornoCarro = '\r'; // No lo comprendí, pero igual ni lo voy a usar


    }
}
