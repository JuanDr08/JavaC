public class Variables {

    // Variables declaradas aca pueden ser usadas dentro de main, pero no se podran re declarar, ya que estan en existencia

    public static void main(String[] args) {
        /* Si definimos variables dentro del contexto main, estás solo existirán dentro de este main, solo podran ser usadas dentro de este
         a su vez, digamos que el método main estuviese envuelto dentro de otro contexto, las variables que esten por fuera de main podrian
         ser usadas por main */



        String saludar = "Hola Mundo desde Java"; // variable de tipo string
        /* String es una clase, pero porque no usa el instanciador ' new '?, en java hay excepciones que nos permiten declarar
        directamente el valor de una variable, las cuales pueden ser String o la clase Integer, java por detras de escena se encarga de crear la instancia */

        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase()); // Como cualquier clase, las Strings tiene metodos, los cuales nos permiten: concatenar, convertir a mayuscula o minuscula, etc...


        int numero = 10; // Int es un tipo de dato primitivo, y los primitivos siempre se escriben en minuscula
        // numero. Si intentamos acceder a sus metodos podremos ver que no tiene ninguno, ya que solamente representa un valor
        Integer num = 10; // Estas clases son conocidas como clases que envuelven al primitivo, le dan funcionalidad extra, en este caso al int, dandole metodos
        // num. Si observamos sus metodos veremos que si tiene
        System.out.println("numero = " + numero);


        // Las variables que ya estan definidas no hace falta volverlas a definir, ya que al especificar su tipo de dato es como si se estuviera creando
        // lo que al crear dos variables con mismo nombre causa conflico, si queremos re asignar su valor bastará con solo llamar el nombre de la variable
        String prueba = "probando";
        prueba = "nuevo valor";


        // A partir del JDK 10 se creo una forma de declaracion dinamica similar a JS, que nos permite declarar variables de una manera flexible
        // este tipo de variables reconocen su tipo de dato de manera automatica segun el valor que se guarda dentro de ella
        var ej1 = 15;
        var ej2 = "string";
        var ej3 = true;
        // Todas reconocen su tipo segun se les es asignado un valor
        // ej3 = 13; Sin embargo sigue habiendo tipado fuerte, ya que una vez asignado su valor no permiten el cambio de su tipo

        String tipo; // Podemos declarar una variable sin asignarle su valor instantaneamente
        // System.out.println(tipo); Sin embargo no podremos por ejemplo imprimirla si no tiene aun valor asociado, necesitaremos darle un valor primero
        tipo = "dando valor"; // Y darle su valor despues de un tiempo

        // int class = 5; No podemos usar palabras reservadas como nombres para nuestras variables

        // Variables siempre en camelCase con la primera minuscula, las clases con CamleCase pero la primera en mayuscula
    }
}
