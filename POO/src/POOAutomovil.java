public class POOAutomovil {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Toyota", "Corolla"); // Instanciamos la clase Automovil que hemos creado, y en esta manera tambien llamamos automaticament

        // Al haber cambiado los atributos a privados dentro de la clase Automovil nos toco modificar la forma en la que accediamos a estos atributos desde esta clase, ahora nos toca usar los metodos
        // que fueron creados para modificar dichos atributos

        // Al haber creado un constructor en la clase Automovil ya no hara falto definir algunos atributos de la manera en que lo haciamos, sino que los definimos en la instanciacion de la clase, osea,
        // en los parentesis cuando recien se declara

        // auto.setFabricante("Toyota"); // auto.fabricante = "Toyota" Accedemos a uno de los metodos de la clase y le asignamos un valor
        // auto.setModelo("Corolla");
        auto.setColor("Rojo");
        auto.setCilindrada(1.6);

        auto.detalle(); // Accedemos a uno de los metodos de la clase
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

    }

}
