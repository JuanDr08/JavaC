public class Automovil { // Nuestra primera clase, por lo que no le pondremos el metodo main, porque es una clase entidad, la cual representa datos
    // tiene caracteristicas y metodos, representa los datos de la aplicacion, por lo que llevara atributos

    // El principio de ocultacion o visibilidad establece que todas o la mayoria de las propiedades o atributos dentro de una clase deben ser privadas, y que la unica forma de acceder a ellos
    // sea para modificarlos o leer su valor sea mediante metodos, esto para que ninguna otra clase externa que la llame tenga la posibilidad de acceder directamente a sus atributos, sino que
    // le toque a traves de metodos
    // Para esto simplemente utilizamos el modificador private al principio de toda declaracion de variable
    // Como antes teniamos estas propiedades publicas y en el archivo POOAutomovil accediamos directamente, nos toca crear metodos que nos permitan trabajar con estos atributos, y en ese
    // archivo ir a modificar la forma en la que accedemos a estos atributos

    private String fabricante; // atributos del objeto, le pertenecen al objeto mismo, se inicializan de manera publica y con valores por defecto o nulos
    private String modelo; // atributos del objeto, le pertenecen al objeto mismo, se inicializan de manera publica y con valores por defecto o nulos
    private String color = "gris"; // atributos del objeto, le pertenecen al objeto mismo, se inicializan de manera publica y con un valor por defecto " gris "
    private int capacidadTanque = 40;
    private double cilindrada; // atributos del objeto, le pertenecen al objeto mismo, se inicializan de manera publica y con valores por defecto o nulos

    // Los atributos o modificadores estaticos son de la clase, a diferencia del resto que son del objeto, basicamente indican los atributos o modificadores que son " compartidos " por asi
    // decirlo, ya que podemos acceder a ellos sin instanciar la clase, simplemente llamando el nombre de la clase y llamando al metodo, no requiere de haber creado una instancia con el new
    // previamente, solo con algo asi: Automovil.colorPatente
    static String colorPatente = "Naranja"; // Atributo con el modificador estatico

    // Si hicieramos que el atributo estatico fuera tambien privado, este metodo ya no podria ser accedido de manera directa desde fuera, sino que al igual que con los demas metodos nos
    // tocaria crear metodos getters y setters para trabajar con los estaticos, pero es importante tener en cuenta lo siguiente, y es que dichos metodos deben ser tambien estaticos,
    // para poder modificar el atributo estatico los metodos tambien deben ser estaticos

    // Si quisieramos crear un metodo cualquiera de tipo estatic, debemos saber que NO PODREMOS TRABAJAR CON ATRIBUTOS COMUNES, solamente podremos trabajar con mas atributos estaticos
    // esto debido a que los atributos comunes le pertenecen a las instancias, los estaticos no, le pertenecen a la clase en general, por lo que no podremos usar cosas cono el ' this ',
    // dentro de un metodo estatico, solo dispondremos de mas metodos estaticos y de lo que se pase por argumento

    // Por defecto los constructores suelen venir siempre publicos, un constructor es como un metodo especial que basicamente lo que hace es inicializar los atributos nada mas se instancia la clase,
    // realizar un proceso recien se inicia la clase, o directamente inicializar la case, ya sea sin atributos iniciados o con atributos iniciados, para esto, el constructor pide parametros, los cuales
    // son los que nosotros necesitemos para crear el objeto, dichos parametros se los pasamos durante la instanciacion de la clase
    public Automovil(String fabricante, String modelo) { // Para crear el constructor debe llevar el mismo nombre que el de la clase, este pide dos parametros de tipo string ambos

        // Cuando se instacia la clase el constructor lee los parametros que se le pasaron y los asigna a los atributos instantaneamente
        this.fabricante = fabricante; // agarra el parametro ' fabricante ' y lo asigna al atributo fabricante
        this.modelo = modelo; // agarra el parametro ' modelo ' y lo asigna al atributo modelo

    }

    // Para el constructor tambien aplica la sobrecarga, es decir, que se pueden crear varios constructores con diferentes argumentos, que reciban cosas distintas, puede ser uno para recibir un tipo de dato
    // e iniciarlo o puede haber uno para cuando no se le pasa ningun dato y que unicamente inicie el objeto
    public Automovil(){ // Solo inicia la clase, pero no realiza ningun proceso

    }

    public Automovil (String fabricante, String modelo, String color, float cilindrada){

        // Para ahorrar codigo podemos llamar a otros constructores que ejecutan una secuencia de codigo que necesitemos repetir, por ejemplo en este caso necesitamos instanciar 4 atributos, 2 de los cuales
        // ya los hace otro constructor mas arriba, pero para ahorrar codigo podemos hacerlo de la siguiente manera
        this(fabricante, modelo); // De esta manera llamamos a un constructor que este dentro de la clase, esto no genera una nueva instancia sino que se reutiliza a si mismo, le pasamos los parametros
        // que necesita para ejecutarse y con esto ya habremos declarado las dos cosas en una sola linea, y esto llamando y utilizando a un constructor que ya existia

        // y ya podremos seguir declarando el resto de propiedades
        this.color = color;
        this.cilindrada = cilindrada;

    }

    // - Para la creacion de los metodos tenemos que seguir una estructura para definirlos,
    // - primero va su modificador de acceso, el cual por el momento
    //   usaremos el public, el cual define que el metodo podra ser accedido desde cualquier parte
    // - seguido de este deberemos definir el tipo de retorno, el cual puede devolver un dato o no devolver nada, para decir que no se devuelve nada
    //   usamos la palabra reservada " void ", la cual indica que el metodo no devolvera nada y es mas para ejecutar un proceso
    // - Seguido va el nombre del metodo con parentesis, dentro de estos parentesis van los parametros o argumentos del metodo, los cuales definen
    //   los datos que este metodo recibira

    public String getFabricante() { // Creamos el metodo para leer el valor de los atributos
        return this.fabricante;
    }

    public void setFabricante(String fabricante) { // Creamos el metodo para modificar el valor de los atributos privados
        // es void porque no necesitamos retornar algo, sino que solo ejecutaremos un proceso
        this.fabricante = fabricante;
    }

    public String getModelo() { // Creamos el metodo para leer el valor de los atributos
        return this.modelo;
    }

    public void setModelo(String modelo) { // Creamos el metodo para modificar el valor de los atributos privados
        // es void porque no necesitamos retornar algo, sino que solo ejecutaremos un proceso
        this.modelo = modelo;
    }

    public String getColor() { // Creamos el metodo para leer el valor de los atributos
        return this.color;
    }

    public void setColor(String color) { // Creamos el metodo para modificar el valor de los atributos privados
        // es void porque no necesitamos retornar algo, sino que solo ejecutaremos un proceso
        this.color = color;
    }

    public int getCapacidadTanque() { // Creamos el metodo para leer el valor de los atributos
        return this.capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) { // Creamos el metodo para modificar el valor de los atributos privados
        // es void porque no necesitamos retornar algo, sino que solo ejecutaremos un proceso
        this.capacidadTanque = capacidadTanque;
    }

    public double getCilindrada() { // Creamos el metodo para leer el valor de los atributos
        return this.cilindrada;
    }

    public void setCilindrada(double cilindrada) { // Creamos el metodo para modificar el valor de los atributos privados
        // es void porque no necesitamos retornar algo, sino que solo ejecutaremos un proceso
        this.cilindrada = cilindrada;
    }

    public void detalle() {// metodos de la clase, le pertenecen al objeto mismo, se inicializan de manera publica

        // Para el ejmplo esta bien que imprima todos los atributos, pero por lo general es mejor practica que los metodos retornen cosas, para poder
        // tener mayor flexibilidad al manejar los resultados, mas abajo hay un ejemplo de como seria con retorno de datos

        System.out.println(this.fabricante); // La palabra this sirve para acceder a los atributos de la clase misma, es decir, con this, estamos
        // haciendo referencia a la clase misma, pero solo sirve dentro de la clase, es decir, solo lo debemos usarlo para acceder a elementos internos
        // de la clase propia
        System.out.println(this.modelo);
        System.out.println(this.color);
        System.out.println(this.cilindrada);
        System.out.println(Automovil.colorPatente);

    }

    public String detalleRetorno() { // Se declara como publico, despues le sigue el tipo de dato que se va a retornar, en este caso string
        // y seguido el nombre del metodo

        StringBuilder sb = new StringBuilder(); // Utilizamos stringbuilder para concatenar strings
        sb.append(this.fabricante);
        sb.append("\n" + this.modelo); // Aunque los atributos estan estipulados como privados, al ser propios de la clase, nos permite el acceso libre a ellos, pero por fuera si es restringido
        sb.append("\n" + this.color);
        sb.append("\n" + this.cilindrada);
        sb.append("\n" + Automovil.colorPatente); // A diferencia del resto de atributos, los atributos estaticos no pueden ser accedidos con el this, ya que no son atributos del objeto, sino
        // que son de la clase, por lo que tenemos dos formas de acceder a ellos, 1: con solo el nombre del atributo ' colorPatente ' pero esta solo sirve cuando estmos dentro de la clase
        // 2: llamando a la clase y posteriormente a su atributo estatico ' Automovil.colorPatente ' donde en este ultimo podemos evidenciar a que se refiere con que es atributo de la clase

        return sb.toString(); // return es la palabra reservada que nos permite definir que es lo que se devolverá al finalizar o cuando un metodo se completa
        // debe ser del mismo tipo de dato que se definio en el tipo de retorno en el encabezado de este metodo

    }

    public String acelerar(int rpm) { // Se define un metodo publico, que retorna un string y recibe un argumento de tipo int al que se le asigna el nombre de rpm
        return "el auto" + fabricante + " acelera a " + rpm + "rpm"; // se devuelve una concatenacion de string y accedemos al parametro rpm que le mandamos para mostrarlo
    }

    public String frenar() { // metodo publico que retorna un string y no recibe ningun parametro
        return "el auto" + fabricante + " frena";
    }

    public String acelerarFrenar(int rpm) { // metodo publico que retorna un string y recibe un argumento de tipo int al que se le asigna el nombre de rpm
        String acelerar = this.acelerar(rpm); // Dentro de metodos podemos llamar a otros metodos, usando preferiblemente la palabra this, para hacer referencia a esta clase
        // como el metodo acelerar requiere de un parametro, deberemos pasarle un valor del tipo del que fue definido dicho parametro, osea int, por lo que
        // le pasaremos el argumento que recibe este metodo llamado acelerarFrenar
        String frenar = this.frenar();
        return acelerar + "\n" + frenar; // retornamos una concatenacion de ambos resultados
    }

    // En este ejemplo de sobrecarga de metodos estamos aplicando el principio de encapsulamiento, el cual dice que todos los detalles de como funciona esta clase no son visibles para las demas clases que llaman
    // a los metodos, es decir, una clase que instancie esta misma clase Automovil y quiera usar los metodos calcularConsumo, unicamente sabrá que existe un metodo calcularConsumo, mas sin embargo nunca sabrá
    // el como funciona este metodo por debajo, ni que existen dos metodos con sobrecarga y que uno recibe otro tipo de parametros y asi, en este archivo si son visibles, pero desde otras partes y desde otras
    // clases que los llamen no podran saber que hace el metodo por debajo, solo lo ejecutan

    // Este principio suele ser confundido con el de visibilidad, el cual si estipula la privatizacion de las variables de la clase, con los metodos private, public, etc...

    public float calcularConsumo(int km, float porcentajeBencina) { // Metodo publico, que devuelve un flotante, y recibe dos parametros, uno de tipo entero y otro de tipo flotante
        return km / (this.capacidadTanque * porcentajeBencina); // retorna un flotante
    }

    public float calcularConsumo(int km, int porcentajeBencina) { // Declaramos un mismo metodo con mismo nombre, lo unico que cambia es el tipo de parametros que recibe y el proceso que ejecuta
        // Esto es conocido como la sobrecarga del metodo, en donde existe un mismo metodo con mismo nombre pero que recibe parametros distintos y ejecuta procesos similares pero de distinta manera
        return km / (this.capacidadTanque * (porcentajeBencina / 100f));
    }


    /* En el orden de escritura de una clase es preferible seguir el siguiente
    * - Declaracion de atributos
    * - Creacion de constructores
    * - Metodos Setters & Getters
    * - Metodos tradicionales
    * - Sobre-escritura de metodos
    * */

    // La sobre escritura de metodos es basicamente sobre escribir metodos que vienen de clases padres, por ejemplo, todo objeto creado hereda de la clase Object, y esta viene con algunos metodos
    // por defecto, como el metodo equals() o el metodo toString(), los cuales son metodos que podemos sobre escribir de la siguiente manera

    @Override // Decorador cuya unicafuncion es indicarle a la JVM que este metodo será sobre escrito, aunque no hace falta indicarlo es mejor dejarlo por convencion
    public boolean equals(Object obj) {
        return super.equals(obj); // dentro del metodo podemos hacer la operacion que sea que queramos y que retorne eso, y al momento de llamar al metodo especifico de esta clase, lo que se
        // ejecutara será este nuevo metodo sobre escrit, con nuestras funciones personalizadas
    }
}
