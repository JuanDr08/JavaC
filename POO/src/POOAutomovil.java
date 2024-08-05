public class POOAutomovil {

    public static void main(String[] args) {

        Automovil auto = new Automovil(); // Instanciamos la clase Automovil que hemos creado

        auto.fabricante = "Toyota"; // Accedemos a uno de los metodos de la clase y le asignamos un valor
        auto.modelo = "Corolla";
        auto.color = "Rojo";
        auto.cilindrada = 1.6;

        auto.detalle(); // Accedemos a uno de los metodos de la clase
        System.out.println(auto.detalleRetorno()); // como este metodo retorna datos, si queremos ver lo que retorna entonces deberemos imprimirlo}
        System.out.println(auto.acelerar(3000)); // A este metodo le definimos que recibia un parametro de tipo int, por lo que deberemos pasarle un argumento
        // con el valor que queremos que trabaje dicho parametro, es decir, en este caso, el parametro nombrado como rpm tendra un valor de 3000
        System.out.println(auto.frenar());

        System.out.println(auto.acelerarFrenar(4000));

    }

}
