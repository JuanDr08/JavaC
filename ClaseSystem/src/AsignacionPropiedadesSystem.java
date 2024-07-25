import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignacionPropiedadesSystem {

    public static void main(String[] args) {

        // Podemos crear nuestras propias variables del sistema de dos formas, una de ellas es creando un archivo con extension .properties, dicho archivo funciona como un .env, en donde guardamos conjuntos de clave
        // valor, cada palabra de la clave se separa por un ' . ', y en los valores, si queremos definir un string no hará falta las comillas, simplemente lo escribimos y ya

        // Para agregar las configuraciones del archivo que creamos en las propiedades de la clase System, debemos crear una instancia de una clase 'FileInputStream', la cual se encarga de leer dicho archivo
        // y obtener el contenido pero en formato byte, y se lo pasamos al objeto properties del sistema, basicamente cargamos el archivo
        try {

            FileInputStream archivo = new FileInputStream("src/config.properties"); // Este metodo requiere de un manejo de excepciones, ya que puede que pase que no se encuentre el archivo, por lo que obliga a usarlo

            Properties p = new Properties(System.getProperties()); // Tenemos que crear el objeto properties para definir las variables que tendrá, pero primero que nada le pasamos las propiedades ya existentes del sistema
            // con el metodo System.getProperties() para que las cargue
            p.load(archivo); // Y ahora le pasamos las propiedades del archivo que creamos, le decimos que las cargue, pero este metodo tambien nos pide manejo de errores ya que pueden ocurrir durante la lectura de los bytes
            // Por lo que modificamos el catch y le metemos el 'Exception' que es la clase generica que aplica para cualquier objeto de excepcion

            // El otro metodo que tenemos para definir propiedades personalizadas para el sistema es mediante el metodo setProperty del objeto Properties

            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties"); // El metodo recibe como argumentos el nombre de la propiedad y su respectivo valor
            // con la misma sintaxis que en el metodo del archivo, palabras separadas por ' . ', y esta vez, los valores si van en strings

            // Para poder listar nuestras nuevas propiedades tenemos que actualizar nuestro propertie en las propiedades del sistema

            System.setProperties(p); // De esta manera le pasamos al sistema nuestras propiedades personalizadas y actualizadas, dandole como parametro la variable que las contiene
            System.getProperties().list(System.out); // De esta manera listamos las propiedades del sistema, con este metodo traemos TODAS las propiedades
            System.out.println(System.getProperty("mi.propiedad.personalizada")); // Ahora podemos llamar por separado propiedades especificas, con este metodo podemos traer una propiedad especifica

        } catch (Exception e) {

            System.out.println("No existe el archivo = " + e);
            System.err.println("No existe el archivo = " + e); // Un metodo de la clase system puede ser el .err, el cual tambien nos hace un print a la linea de comandos pero en forma de error, remarcandolo en rojo
            System.exit(1); // Este metodo representa el estatus al ejecutar el codigo, es el que podemos ver al finalizar un programa, que sale como "Process finished with exit code 0"
            // donde el 0 representa que todo ha salido bien, el -1 representa un error común, o el 1, el cual representa una falla del sistema, cuando se lanza una excepcion, generalmente se usa cuando hay una falla
            // que interrumpe el flujo del programa

            System.gc(); // Esta es una forma de forzar el garbage collector, el cual lo que hace es liberar espacio en la memoria eliminando instancias y referencias que no se estan utilizando
            // que puede que se hayan utilizado antes pero actualmente ya no en el programa, el GC es automatico, pero de esta forma lo invocamos y podremos acelerar el proceso
            // es util cuando estamos trabajando con muchas instancias y muchos objetos

        }

    }

}
