public class EjecutarProgramaDelSO {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime(); // De esta forma, la clase Runtime y el metodo estatico getRuntime obtenemos la instancia de tiempo de ejcucion, nos permite ejecutar aplicaciones con el metod .exec

        Process proceso; // Cuando se ejecuta un programa como el editor de texto, lo que runtime retornara será un objeto del tipo process

        try {

            if(System.getProperty("os.name").startsWith("Linux")) { // Evaluamos el sistema operativo, y si es linux, que lo ejecute
                proceso = rt.exec("gedit"); // dentro de proceso guardamos lo que retorne la ejecucion, que es algo de tipo process, por eso creamos proceso de la clase Process
                // Con exec ejecutamos el programa que se le pase como argumento, y tambien requiere de manejo de errores, nos lo pide asi que toca ponerlo
                // con exec tambien podemos ejecutar comandos en la terminal
            } else {
                proceso = rt.exec("notepad");
            }
            proceso.waitFor(); // Este metodo lo que hace es esperar hasta que cerremos o finalice el programa o el proceso que hayamos abierto para continuar con el resto de codigo
            // este metodo tambien equiere de un manejo de excepciones

        } catch (Exception e) {

            System.err.println("El comando es desconocido" + e.getMessage());
            System.exit(1);

        }
        System.out.println("Se ha cerrado el editor");

    }

}
