public class IfElse {

    public static void main(String[] args) {

        float promedio = 6.5F;

        // Los if evaluan expresiones o valores booleanos

        if ( promedio >= 6.5 ) { // Nos permite modificar el flujo de nuestra aplicacion
            System.out.println("Felicitaciones, excelente promedio");
        } else { // El if y el else son bloques excluyentes, es decir, nunca se van a ej1ecutar los dos a la vez, uno o el otro
            System.out.println("Necesitas esforzarte un poco mas");
        }


        if ( promedio >= 6.5 )  // Si el codigo ocupa una sola linea entonces podremos saltarnos el paso de definir las llaves, pero solo si es UNA linea, mas de eso toca con llaves
            System.out.println("Felicitaciones, excelente promedio");
         else
            System.out.println("Necesitas esforzarte un poco mas");
         // Pero es recomendable y buena practica usar las llaves por temas de lectura de codigo y mejor comprension

        // Tambien podemos declarar multiples posibilidades segun sea el dato de la variable, esto usando los else if

        if ( promedio >= 6.5 ) {
            System.out.println("Felicitaciones, excelente promedio");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas un poco mas de esfuerzo");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, estudia mas");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("Tu promedio es: " + promedio);
    }

}
