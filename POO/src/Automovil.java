public class Automovil { // Nuestra primera clase, por lo que no le pondremos el metodo main, porque es una clase entidad, la cual representa datos
    // tiene caracteristicas y metodos, representa los datos de la aplicacion, por lo que llevara atributos

    String fabricante; // atributos del objeto, le pertenecen al objeto mismo, se inicializan de manera publica y con valores por defecto o nulos
    String modelo; // atributos del objeto, le pertenecen al objeto mismo, se inicializan de manera publica y con valores por defecto o nulos
    String color = "gris"; // atributos del objeto, le pertenecen al objeto mismo, se inicializan de manera publica y con un valor por defecto " gris "
    double cilindrada; // atributos del objeto, le pertenecen al objeto mismo, se inicializan de manera publica y con valores por defecto o nulos

    // - Para la creacion de los metodos tenemos que seguir una estructura para definirlos,
    // - primero va su modificador de acceso, el cual por el momento
    //   usaremos el public, el cual define que el metodo podra ser accedido desde cualquier parte
    // - seguido de este deberemos definir el tipo de retorno, el cual puede devolver un dato o no devolver nada, para decir que no se devuelve nada
    //   usamos la palabra reservada " void ", la cual indica que el metodo no devolvera nada y es mas para ejecutar un proceso
    // - Seguido va el nombre del metodo con parentesis, dentro de estos parentesis van los parametros o argumentos del metodo, los cuales definen
    //   los datos que este metodo recibira
    public void detalle() {// metodos de la clase, le pertenecen al objeto mismo, se inicializan de manera publica

        // Para el ejmplo esta bien que imprima todos los atributos, pero por lo general es mejor practica que los metodos retornen cosas, para poder
        // tener mayor flexibilidad al manejar los resultados, mas abajo hay un ejemplo de como seria con retorno de datos

        System.out.println(this.fabricante); // La palabra this sirve para acceder a los atributos de la clase misma, es decir, con this, estamos
        // haciendo referencia a la clase misma, pero solo sirve dentro de la clase, es decir, solo lo debemos usarlo para acceder a elementos internos
        // de la clase propia
        System.out.println(this.modelo);
        System.out.println(this.color);
        System.out.println(this.cilindrada);

    }

    public String detalleRetorno() { // Se declara como publico, despues le sigue el tipo de dato que se va a retornar, en este caso string
        // y seguido el nombre del metodo

        StringBuilder sb = new StringBuilder(); // Utilizamos stringbuilder para concatenar strings
        sb.append(this.fabricante);
        sb.append("\n"+ this.modelo);
        sb.append("\n"+ this.color);
        sb.append("\n"+ this.cilindrada);

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

}