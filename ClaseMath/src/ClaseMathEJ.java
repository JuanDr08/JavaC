public class ClaseMathEJ {

    public static void main(String[] args) {

        // Basicamente esta clase nos permite realizar calculos matematicos

        int absoluto = Math.abs(-3); // Metodo que nos permite calcular el valor absoluto de un numero
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2); // Metodo que devuelve el valor maximo de dos numeros, hay que almacenar el resultado en un tipo de dato
        // igual que el de los datos que le pasamos, en este caso pasamos dos double entonces los guardamos en una variable de tipo double
        System.out.println("max = " + max);

        int max2 = Math.max(1,2); // En este caso le pasamos enteros entonces los almacenamos en variable de tipo int
        System.out.println("max2 = " + max2);

        double min = Math.min(3.5, 1.2); // Igual que el max, solo que este devuelve el valor minimo
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); // Este metodo si o si va a redondear hacia arriba el numero

        double piso = Math.floor(3.5); // Este metodo si o si redondea hacia abajo el numero

        long entero = Math.round(3.5); // Este metodo si realiza el redonde de forma convencional, es decir, si el numero termina en .5 lo redondea hacia arriba, si es menor a .5 lo redondea hacia abajo

        double pi = Math.PI; // Esto es una constante interna de la clase Math, la cual contiene el valor de PI

        // La clase Math es parecida a la clase system, ya que es una clase que no se puede instanciar y sus metodos son solamente metodos estaticos, es decir, podemos acceder sin instanciar primero

        double exp = Math.exp(1); // Metodo que nos permite definir el exponencial, tiene como base la constante ' E ' cuyo valor es 2,71828, esdecir en este caso sera 2,71828 elevado a 1
        System.out.println("exp = " + exp);

        double log = Math.log(10); // Calcula el logaritmo natural del numero que le pasemos como parametro, recibe valores double, y su base es el valor de E, osea, 2,71828
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3); // Recibe dos argumentos, el primero es el numero que será tomado como la base, y el segundo será el valor al cual será elevado, en este caso será 10 elevado a la 3
        System.out.println("potencia = " + potencia);

    }

}
