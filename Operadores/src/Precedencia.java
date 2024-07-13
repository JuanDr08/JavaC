public class Precedencia {

    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = i + j + k / 3d; // Segun la presedencia primero se aplicara la division de k y 3 y luego las sumas de izquierda a derecha
        // la d indica que el 3 es de tipo doble, y nos permite tener un resultado muy exacto con valores decimales y todo
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d; //Usamos los parentesis para indicar que primero se realicen las sumas y luego divida

        // Revisar la tabla de notion en la seccion de operadores para observar de mejor manera la precendencia

        promedio = --i + j++ + k / 3d * 10; // Con los operadores unarios tienen mas presedencia, por lo tanto el i que es predecremento primero se le resta uno y con el resultado se opera
        // pero con j al ser postincremento primero se va a asignar y despues aumenta, es decir, durante toda la operacion estara trabajando con el valor de antes de la incrementacion
        // y despues de que se termina la operacion se incrementa, por lo tanto no va a afectar el resultado de la operacion, porque lo unico que aumenta es j, no el resultado promedio

    }

}
