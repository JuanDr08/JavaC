public class Metodos {

    public static void main(String[] args) {
        
        String nombre = "Juan David";
        System.out.println("nombre.length() = " + nombre.length()); // Para ver el largo de la cadena, su cantidad de caracteres, un string es un arreglo de caracteres, una secuencia.
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // Para volver todo el string a mayuscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // Para volver todo el string a minuscula
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Juan David")); // Comparar un string con otro a nivel de valor, no de instancia
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("juan david")); // Compara un string a nivel de valor sin tomar en cuenta sus diferencias de mayuscula y minuscula
        System.out.println("nombre.compareTo(\"Juan David\") = " + nombre.compareTo("Juan David")); // Compara un string a nivel lexico gráfico, es decir segun sus codigos de la tabla Unicode
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // Busca el cacracter que se encuentra en la posicion indicada, es decir en este caso devolveria la J

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // recibe como parametro un número el cual indica la posicion desde donde se hara la sub cadea, de ese numero en adelante se sacará, incluyendo la posicion del num
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // lo mismo, solo que nos permite definir el rango en donde se hara el recorte de la cadena, o sea el desdes y el hasta donde
        // el primer int define el desde donde empezará y el segundo el hasta donde terminará, la posicion de inicio se incluye en el recorte, pero la posicion de finalizacion no se incluye en el recorte

        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace() = " + trabalengua.replace("a", ".")); // Este metodo busca todos los caracteres especificados en el primer parametro y los remplaza por el caracter del segundo caracter
        System.out.println("trabalengua.indexOf = " + trabalengua.indexOf("a")); // Devuelve un entero, y devuelve la posicion en la que se encuentra el caracter o cadena especificada
        // busca la primer incidencia, es decir, devuelve el primero que encuentre, si no existe devuelve -1
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf("a")); // Busca la ultima ocurrencia, ósea el ultimo que encuentre y devuelve su posicion, si no existe devuelve -1
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("lenguas")); // Con este metodo nos devuelve true o false dependiendo de si el caracter o cadena especificada en los parametros esta dentro de la cadena
        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.startsWith("lenguas")); // Verifica si la cadena empieza con algún caracter o cadena especificada, devuelve true o false
        System.out.println("trabalengua.endsWith(\"traba\") = " + trabalengua.endsWith("traba")); // Verifica si la cadena termina con algún caracter o cadena especificada, devuelve true o false
        System.out.println("  trabalenguas ".trim()); // Este metodo quita los espacios en blanco que esten al inicio o al final de una cadena
        
    }
    
}
