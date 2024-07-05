public class PrimitivosNumericos {

    static float varDefecto; // para que sea accesible para el metodo main toca declararla como estatica
    // Tiene visibilidad default, ni publica, ni privada ni protegida

    public static void main(String[] args) {

        byte numeroByte = 127; // representan un solo bite el cual se puede almacenar en 8 bits, es el entero mas pequeño de java
        // Sobre 127 deja de ser un byte, ya que ese es el maximo valor que soporta el byte

        // La clase byte nos otorga algunos metodos que nos dan informacion sobre el tipo byte, como la cantidad de bytes que almacena
        // el tamaño en bites, el valor maximo y el valor minimo que puedo almacenar
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767; // tiene un soporte mayor, son 2 bytes y 16 bits
        // Sobre 32767 deja de ser short, ya que ese es su maximo

        // Tambien la clase Short nos otorga herramientas para ver las propiedades de un short, como tamaños y eso
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647; // Hay una diferencia y es que el primitivo se declara como int y la clase Integer, a diferencia del resto
        // representa un entero de 4 bytes y almacena hasta 32 bits
        //Sobre 2147483647 deja de ser int, ya que es el tope

        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L; // Si le asignamos como valor el maximo de los ints podremos observar que tambien marcara error, lo que pasa es que el valor asignado que
        // corresponde a la literal por defecto siempre es del tipo integer, por lo que la literal tiene el mismo rango que los ints
        // Tenemos que indicar que la literal no es de tipo entero, sino long, esto se hace agregando al final del número una ' L ', puede ser mayus o minus, con eso
        // Convertimos la literal en tipo Long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " +Long.SIZE);
        System.out.println("Valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long " + Long.MIN_VALUE);

        var numeroVar = 127; // por defecto, en var cuando le asignamos un entero lo tomara como int, asi sea que le estemos asignando los valores maximos de otros tipos de enteros
        // a excepcion de que vayamos a usar Long o Float, Double


        // ============================================================================
        //                     Primitivos de punto flotante
        // ============================================================================

        // Se les conoce como punto flotante ya que la memoria de los equipos siempre llegara a un punto donde es limitada, no podra almacenar numeros reales con precision infinita
        // con muchos decimales, sin importar si usamos un sistema de binarios, siempre habrá límites

        // Basicamente se traduce a una notacion cientifica para representar un numero real con el que podremos trabajar y operar sin problema,
        // ya sean reales, decimales, grandes, pequeños etc...

        // Por ejemplo el tipo Float almacena hasta 32 bits y el Doble hasta 64 bits

        float realFloat = 1; // Aunque sea 1, al ser un primitivo de punto flotante nos lo mostrara como 1.0, sin embargo, nosotros no le podremos asignar un punto manualmente,
        // ya que saltara error, esto porque lo tomara como un tipo doble, pero, si vamos a poner el punto manualmente,
        // entonces deberemos agregar una ' f ' sea mayúscula o minuscula al final del número
        float ej1 = 1.0F; // al poner el . manualmente nos toca ponerle la f al final para que reconozca que es flotante y no doble
        float ej2 = 2.12E3F; //2120F; Para usar la exponenciacion usamos la letra ' e ' sea mayus o minus, y todo lo que vaya después de ella será la exponenciacion, que básicamente
        // indica cuanto y hacia donde se movera la coma, por lo tanto, el número al que le aplicamos la E, con el que se ve al inicio del comentario son iguales

        // Si lo hacemos negativo 2.12E-3F la coma se correra hacia la izquierda.
        // Si directamente damos como valor un flotante grande más preciso, el programa lo traducirá automáticamente a notación cientifica, por ejemplo, 0.00000000015f = 1.5e-10f
        // Lo que va a la izquierda del exponente (E) se le conoce como mantiza, y lo de la derecha es el valor. Su valor fijo, es decir a lo que equivale la notación se le conoce como
        // valor de punto fijo
        System.out.println("realFloat = " + ej2);
        System.out.println("float corresponde en byte a = "+ Float.BYTES);
        System.out.println("float corresponde en bites a = "+ Float.SIZE);
        System.out.println("maximo valor para float = "+ Float.MAX_VALUE);
        System.out.println("minimo valor para float = "+ Float.MIN_VALUE);


        double realDouble = 3.4028235E38; // No es necesario marcar la D como en float, ya que con colocar el ' . ' automaticamente la literal se reconoce como doble o decimal
        // No marca error con el maximo del float

        // En la mantiza soporta un número mucho mas grande y el exponente también es mucho mayor, ya que los doble son de 8 bytes y 64 bites
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a = "+ Double.BYTES);
        System.out.println("Double corresponde en bites a = "+ Double.SIZE);
        System.out.println("maximo valor para Double = "+ Double.MAX_VALUE);
        System.out.println("minimo valor para Double = "+ Double.MIN_VALUE);

        var varFlotante = 3.1416; // al llevar el punto, automaticamente pasa al tipo doble, lo reconoce siempre como doble
        // si queremos que sea float bastara con darle la f al final del numero 3.1416F
        // Si le agregamos las letras que referencia a los demas tipos al final del numero, sin importar su longitud, pasará a ser un numero de ese tipo, por ejemplo: D, F, L,

        // El valor por defecto en todos los numeros enteros es 0, sin embargo, este valor por defecto se aplica solamente a atributos o variables de la clase, cuando es local del metodo
        // por ejemplo el metodo main esto no se aplica, por lo que nos toca inicializarla siempre

        // por ejemplo (revisar la variable estatica por fuera de main al inicio del todo)
        System.out.println("varDefecto = " + varDefecto); // esa variable esta declarada como variable de la clase, ya que esta por fuera de main y dentro de la clase, no es local del metodo
        // main, por eso nos esta dando el valor por defecto




    }
}
