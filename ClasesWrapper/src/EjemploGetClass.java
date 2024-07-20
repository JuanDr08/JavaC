import java.lang.reflect.Method;

public class EjemploGetClass {

    public static void main(String[] args) {

        String texto = "Hola que tal!";

        texto.getClass(); // Basicamente, como bien sabemos todos los tipos de objetos heredan de la clase Object, por lo tanto comparten metodos en comun, uno de los cuales es el metodo
        // getClass, el cual en resumidas cuentas nos permite observar el esquema de la clase que estamos usando, nos muestra toda la metadata interna de la clase, como su composicion interna


        Class strClass = texto.getClass(); // el metodo retorna una instancia del tipo class, por lo tanto nos toca almacenarlo en una variable de tipo Class
        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName()); // mediante el ' . ' podremos acceder a todos sus metodos que nos muestran su data interna
        System.out.println("strClass = " + strClass.getPackageName()); // Devuelve el nombre del package
        System.out.println("strClass = " + strClass.getPackage()); // Devuelve un objeto de la clase package

        for (Method m : strClass.getMethods()) {
            System.out.println("m.getName() = " + m.getName());
        }
        // Basicamente el metodo getClass nos devuelve o nos permite acceder a informacion del objeto, su estructura interna

    }

}
