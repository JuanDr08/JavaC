public class HolaMundo { /* clase, cabecera que es donde se define, modificador publico para permitir llamarlo en cualquier parte, palabra reservada clase para
indicar que es una clase, el nombre y su cuerpo*/

    /*clase principal con un metodo o funcion que es la puerta de entrada a la aplicacion, es el arranque, cualquier
    clase que contenga este metodo principal se ejecuta como aplicacion autonoma*/
    // Todo en Java es una clase y objeto menos los tipos primitivos los cuales representan un valor
    // La JVM se encarga de ejecutar esta clase principal, y por eso tiene que ser un metodo publico
    // la JVM busca este metodo nada mas iniciar, para ejecutar todo
    public static void main(String[] args){ // metodo/funcion, puede ser estatico o propio de la instancia, pueden ser llamados desde cualquier parte de la APP
        // Siempre SI O SI tiene que estar el metodo main declarado de esta manera, si algo falta no nos va a reconocer esto como aplicacion y no podra ser iniciado
        // Esos parametros son datos de entrada que el usuario puede ingresar mediante el terminal
        /*
            Algunos modificadores pueden ser
            - Acceso
                - Private
                - Protected
                - Public
            - Static
            - Void
                - El cual no retorna nada, solo ejecuta el programa o una tarea
        */
        // EL metodo se declara como publico, lo cual es un modificador de acceso que indica que este metodo/clase se puede llamar desde cualquier parte
        // Es estatico
        // Void define el tipo de retorno, void define un metodo que no retorna nada, es vacio, solo ejecuta un proceso o tarea
        // Main es un metodo el cual recibe parametros del tipo arreglo de cadenas
        // Las {} en java limitan el alcance que tiene el metodo metodo, y dentro de ellas estará la tarea que se desa realizar y en el caso de la clase es el cuerpo de la clase o su alcance


        // Para imprimir se usa la clase system
        /* de la clase system se puede invocar el atributo estatico out, es un atributo estatico ya que se llama de manera directa sin tener que instanciar la clase system
        tambien out es del tipo printStream que nos permite imprimir en la consola */
        // PrintLn es imprimir en una linea de la consola, recibe  como parametro lo que sea que queremos imprimirr
        System.out.println("Hola Mundo"); // SIEMPRE TERMINA EN ' ; '
        // Datos de salida, imprimir en la pantalla o terminal
    }
}

// Lo que sucede internamente no es que se ejecutando la clase, el codigo fuente, lo que pasa es que el IDE se encarga de compilar este codigo antes, y lo convierte en un archivo .class
// que contiene el codigo binario, no es 100% binario, es propio de la JVM y lo interpreta la misma, este pseudocodigo se le conoce como byteCode, y esta a un nivel intermedio entre el codigo fuente que
// interpretamos nosotros y tambien entre los binarios, solo lo interpreta la JVM y lo hace atravez del compilador JIT (Just In Time), Cuando la JVM ejecuta el .class es ahi cuando se interpreta
// y se convierte este bytecode a 0 y 1 para que finalmente pueda ser ejecutado en codigo binario interpretado por la maquina
