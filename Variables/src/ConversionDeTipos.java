public class ConversionDeTipos {

    public static void main(String[] args) {

        // CONVERSION DE STRINGS A OTROS TIPOS PRIMITIVOS EN SU MAYORIA ENTEROS

        String numStr = "50";
        int numInt = Integer.parseInt(numStr); // De numero a entero
        System.out.println("numInt = " + numInt);

        // Los demás tipos de enteros también tienen la posibilidad de conversion
        Byte.parseByte(numStr);
        Short.parseShort(numStr);
        Long.parseLong(numStr);
        Float.parseFloat(numStr);
        String realStr = "98765.43E-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        // Los logicos tambien tienen conversion
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // CONVERSION DE ENTEROS O PRIMITIVOS A STRINGS

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt); // Siempre en conversiones es usando la misma clase wrapper del primitivo
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt); // otra forma de convertir a string es usando el metodo valueOf de la clase string, salen varios metodos con el mismo nombre, son todos uno solo pero solo que
        // recibe distintos parametros dependiendo del tipo de dato y cantidad a convertir, se le conoce como sobrecarga de metodo
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroStr + 10); // Hay que tener cuidado, ya que valueOf tambien recibe arreglos de caracteres, y si le tratamos de sumar un número a una cadena lo que hara es concatenar
        // el operador ' + ' en números opera, y en strings concatena
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        // Y asi sucesivamente con todos los demás datos primitivos, se podrá con su propia clase wrapper o con la clase string
        // valueOf tiene para convertir floats, double, int, char, etc... toca observar cual queremos antes de seleccionarlo

        // CONVERSION DE PRIMITIVOS A PRIMITIVOS

        // Al momento de convertir entre primitivos enteros hay que tener cuidado, ya que puede existir la perdida de información, ya que algunos almacenan más que otros
        int i = 32769;
        short s = (short) i; // Si intentamos pasar de int a short nos saltará un error, ya que los int almacenan más
        // El cast o casting, es básicamente forzar la conversión, esto se hace colocando antes del dato unos parentesis y dentro de ellos el tipo de dato
        // Si nos sobrepasamos del valor que soporta el tipo de dato este no podrá realizar la conversion de manera correcta y, por lo tanto, habría perdida de información
        System.out.println("s = " + s);
        long l = i; // Pero si observamos con long, no nos saltará error al intentar convertirlo, ya que long es mas grande que int, por lo que puede almacenar sus cantidades y más
        System.out.println("l = " + l);

        // boolean b = (boolean) i; Esta conversion, aunque usemos cast, no podrá ser posible, ya que ambos tipos son totalmente incompatibles

        char b = (char) i;
        System.out.println("b = " + b); // lo convertirá en caracter, pero porque los caracteres aceptan enteros para UNICODE

        float f = (float) i; // Lo convierte exitosamente ya que son tipos compatibles
        System.out.println("f = " + f);

        // El cast básicamente solo se soporta en tipos numericos, incluyendo los reales, y el char, ya que el caracter se puede representar como un entero, ya que esta asociado en la UNICODE a un valor numerico
        
    }
    
}
