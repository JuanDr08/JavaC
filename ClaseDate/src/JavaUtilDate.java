import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date(); // Clase dentro del paquete java util para trabajar con las fechas dentro de java

        System.out.println("fecha = " + fecha); // Para obtener la fecha actual basta con llamar la variable creada

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy"); // Esta clase nos permite customizar el formato de las fechas, la d minuscula indica el dia
        // la M indica el mes (si ponemos MMMM nos dice el nombre del mes) y la ' y ' el cual indica el año
        String fechaStr = df.format(fecha); // Format es un metodo de la clase SimpleDateFormat el cual puede recibir un objeto del tipo date, este metodo retorna un string con la nueva fecha
        // formateada
        System.out.println("fechaStr = " + fechaStr);

        // Podemos buscar simpledateformat java en google y entrar a la documentacion, ahi se nos muestra todos los formatos y a lo que corresponde cada letra
        // para poder personalizar nuestra fecha a gusto

        fecha = new Date();
        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime(); // El metodo get time nos trae el tiempo transcurrido desde enero de 1970 hasta la actualidad en milisegundos
        // Siempre trabajando con la hora actual del sistema
        System.out.println("Teimpo transcurrido en el for = " + tiempoFinal);
    }

}
