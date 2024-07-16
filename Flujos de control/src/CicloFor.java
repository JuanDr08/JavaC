public class CicloFor {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // La inicializacion de la variable se ejecuta una sola vez en todo el ciclo de vida del for, al inicio del ciclo
            // Mientras que i sea menor a 10, osea hasta 9, se ejecutara 9 veces el codigo interno
            // Al final de cada iteracion se incrementa i
            // La variable i solo tiene alcanze dentro del bucle for, por lo que no puede ser usada por fuera de este, a menos que la declaremos por fuera del for, ahi si la podriamos usar
            System.out.println("i = " + i);

        }

        int i = 0; // Como el alcanze de la variable i en el for es solo internamente entonces podremos volver a declarar una variable con el mismo nombre por fuera de este y no habran problemas

        for ( ; ; ){ // Puede ser usado de esta forma pero eso seria ilogico y lo mejor es usar su estructura por defecto

            if( i > 5 ) break;

            System.out.println("i = " + i);

            i++;

        }

        for (int j = 10; j >= 0; j--) { // Tambien podremos hacer un for que se recorra al reves
            System.out.println("j = " + j);
        }

        for (int j = 0, k = 10; j < k; j++, k--) { // Tambien se pueden hacer esta combinaciones extrañas usando multiples variables
            System.out.println(j + " - " + k);
        }

        for (int j = 0; j <= 10; j++) {

            if ( j % 2 == 0 ) continue; // El continue es un operador similar al break, solo que en vez de terminar el bucle completo, el continue termina la iteracion actual y pasa a la siguiente de una vez
            // Sin importar si hay mas codigo por delante
            System.out.println("j = " + j);

        }

    }

}
