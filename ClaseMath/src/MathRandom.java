import java.util.Random;

public class MathRandom {

    public static void main(String[] args) {

        // El metodo random nos permite generar un numero decimal aleatorio entre el 0 y el 1, pero el 1 no es inclusivo, es decir, no llegara a tomar el 1

        double random = Math.random();
        System.out.println("random = " + random);

        // Si quisieramos ampliar el rango en el que genera el numero aleatorio lo podemos hacer multiplicando el math.random por el numero maximo que queremos que salga, por ejemplo
        // Numero random entre 0 y 10:
        double ampliar = Math.random() * 10; // Generara un numero aleatorio entre el 0 y el 10, sin tomar en cuenta el 10, osea, solo llegaria al 9.9999...

        // Todo esto lo podemos combinar con redondear numeros al piso, al techo o un redondeo normal, para poder ejecutar ciertas acciones dependiendo del numero que caiga

        // Existe otra forma de generar numeros aleatorios, y de hecho, es la que usa internamente el metodo random de la clase Math
        // Esta forma es mas flexible ya que nos permite generar numeros random de tipo double, enteros y long

        Random randomObj = new Random();

        int randomInt = randomObj.nextInt(); // Este metodo nos permite generar un entero aleatorio entre 2³⁷, osea numeros grandes
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(10); // Si al metodo le pasamos un numero, nos generara un numero aleatorio entre 0 y el numero que le pasemos

        randomInt = 10 + randomObj.nextInt(25-10); // Si quisieramos que el rango del 0 aumentara nos tocaria sumar el rango que queremos aumentar al inicio y restarlo dentro de los argumentos pasados
        // tal cual como en el ejemplo, que generara un numero aleatorio entre 10 y 25
        System.out.println("randomInt = " + randomInt);

    }

}
