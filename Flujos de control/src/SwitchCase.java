public class SwitchCase {

    public static void main(String[] args) {

        // A diferencia de los if/else if/else, las sentencias switch case evaluan los valores de las variables
        // comparando cada caso con dicho valor y ejecutar el bloque en donde coincidan los valores

        // Es como un interruptor

        int num = 1;

        switch (num) {
            case 0: //si el valor de num es 0 entonces se ejeuta este
                System.out.println("El numero es 0");
                break; // Es para decir que apenas termine la ejecucion de este bloque se salga de la verificacion y no ejecute el resto de casos
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
        //  case 'string': Tambien podemos evaluar cadenas para que se ejecuten si algo coincide
            default: // Este caso es por si no llega a coincidir con ninguno de los casos, es como el else de los if
                System.out.println("desconocido");
        }

        String nombre = "juan";

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin");
                break;
            case "juan":
                System.out.println("Hola juan");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }

    }

}
