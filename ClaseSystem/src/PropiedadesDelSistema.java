import java.util.Properties;

public class PropiedadesDelSistema {

    public static void main(String[] args) {

        // Basicamente la clase system en java nos permite acceder a distintas variables de entorno del sistema, como puden ser rutas de directorios
        // versiones del java, el sistema operativo, etc...

        // La clase system solo contiene metodos estaticos, y esta diseñada para que no se pueda instanciar con el operador new y tampoco se puede hacer una clase que extienda de ella, una subclase

        // Para conocer las distintas proopiedades a las que podemos acceder podemos dirigirnos a la siguiente pagina
        // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

        String username = System.getProperty("user.name"); // Basicamente esta propiedad nos permite acceder al nombre del usuario del equipo
        System.out.println("username = " + username);

        String home = System.getProperty("user.home"); // Nos devuelve la ruta del usuario del sistema operativo
        System.out.println("home = " + home);

        String workSpace = System.getProperty("user.dir"); // El directorio actual del proyecto sobre el que estamos trabajando
        System.out.println("workSpace = " + workSpace);

        String java = System.getProperty("java.version"); // Nos devuelve la version que estamos usando de java
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator"); // Esta propiedad detecta automáticamente segun el sistema operativo el caracter de salto de linea
        // que debe usar, ya que en linux, macOS, windows, etc... puede que sea diferente, pero es basicamente como si usaramos el \n
        System.out.println("lineSeparator: " + lineSeparator + " una linea nueva");
        lineSeparator = System.lineSeparator(); // Tambien podemos acceder de esta forma a esa propiedad

        // Si queremos listar todas las configuraciones del sistema completas

        Properties p = System.getProperties(); // Esta propiedad no retorna un string como la anterior sino que devuelve el conjunto completo

        p.list(System.out); // Imprime automaticamente la lista completa de las configuraciones
        // El metodo list recibe como parametro un objeto o instancia del tipo print strim, el cual es el tipo de dato que retorna el System.out para imprimir en la consola

        // Dentro de dicha lista vamos a poder observar todo tipo de variables de entorno, las cuales contienen la informacion de nosotros como usuarios
        // y del sistema operativo, ademas de rutas de archivos, versiones, etc...

    }

}
