public class OrdenPrimeroUltimoYReasignacion {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10]; // La idea es rellenar este arreglo en donde la primer posicion sea el primer dato del arreglo numeros,
        // la segunda poscion sea el ultimo dato del arreglo numeros, la tercer poscion sea el segundo dato del arreglo numeros
        // la cuarta posicion sea el penultimo dato del arreglo numeros y asi sucesivamente

        for (int i = 0; i < numeros.length; i++) { // For para asignar los datos del arreglo numeros
            numeros[i] = i + 1;
        }

        int aux = 0; // Variable que nos ayudara a acceder a las distintas posiciones del arreglo a
        for (int i = 0; i < a.length / 2; i++) { // se divide en dos para que no vuelva a repetir toda la re asignacion, ya que a la mitad
            // del recorrido ya habra asignado todos los valores
            a[aux++] = numeros[i]; // Aca asignamos los primeros valores
            // aux empieza valiendo 0, por lo que primero asigna a esa posicion y luego incrementa a 1
            // en la siguiente iteracion aux valdra 2
            a[aux++] = numeros[numeros.length - 1 - i]; // Asignamos a la siguiente posicion de a el ultimo valor siguiente de numeros
            // al llegar aca, aux ya equivale a 1, por lo que se le asigna a esa posicion y luego vuelve a incrementar a 2
            // en la siguiente iteracion aux valdrá 3
        }

        for (int i = 0; i < a.length; i++) { // imprimimos el resultado
            System.out.println("i = " + i + " : " + a[i]);
        }

    }

}
