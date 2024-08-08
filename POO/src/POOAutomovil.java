public class POOAutomovil {

    public static void main(String[] args) {

        // Aunque el atributo estatico esta por defecto naranja, lo podemos cambiar incluso antes de instanciar cualquier clase
        Automovil.colorPatente = "Azul"; // De esta manerá accedemos al atributo compartido de la clase, osea, el metodo estatico y le cambiamos su valor
        Automovil auto = new Automovil("Toyota", "Corolla"); // Instanciamos la clase Automovil que hemos creado, y en esta manera tambien llamamos automaticament

        // Al haber cambiado los atributos a privados dentro de la clase Automovil nos toco modificar la forma en la que accediamos a estos atributos desde esta clase, ahora nos toca usar los metodos
        // que fueron creados para modificar dichos atributos

        // Al haber creado un constructor en la clase Automovil ya no hara falto definir algunos atributos de la manera en que lo haciamos, sino que los definimos en la instanciacion de la clase, osea,
        // en los parentesis cuando recien se declara

        // auto.setFabricante("Toyota"); // auto.fabricante = "Toyota" Accedemos a uno de los metodos de la clase y le asignamos un valor
        // auto.setModelo("Corolla");
        auto.setColor("Rojo");
        auto.setCilindrada(1.6);

        // En este detalle podremos observar el valor del atributo estatico ' colorPatente ' por defecto
        auto.detalle(); // Accedemos a uno de los metodos de la clase
        Automovil.colorPatente = "verde";
        // En este otro podremos observar como ha cambiado el atributo estatico
        System.out.println(auto.detalleRetorno()); // como este metodo retorna datos, si queremos ver lo que retorna entonces deberemos imprimirlo}

        System.out.println(auto.acelerar(3000)); // A este metodo le definimos que recibia un parametro de tipo int, por lo que deberemos pasarle un argumento
        // con el valor que queremos que trabaje dicho parametro, es decir, en este caso, el parametro nombrado como rpm tendra un valor de 3000
        System.out.println(auto.frenar());

        System.out.println(auto.acelerarFrenar(4000));

        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 0.6f)); // El metodo requiere de dos argumentos, cada uno con su respectivo tipo especificado en el metodo dentro
        // de la clase, por lo que le pasamos algunos valores que cumplen con su tipo especificado

        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 60));  // Llamamos al mismo metodo pero al que se le aplica sobrecarga, pasandole como parametro el otro tipo
        // de dato que puede recibir el metodo

        Automovil auto2 = new Automovil(); // creamos un auto usando uno de los constructores sobrecargados

        Automovil enums = new Automovil("Toyota", "Corolla"); // creamos una variable para poner en practica los enums de java
        enums.setColor(Color.BLANCO); // llamamos al metodo setColor y le pasamos una de las constantes del archivo Color, accediendo a sus valores estaticos por medio de la clase, sin instanciar
        // nada, el valor de BLANCO es como su mismo nombre indica blanco

        for (Color p : Color.values()) System.out.println(p); // Recorremos todas las constantes que hay en el enum

    }

}
