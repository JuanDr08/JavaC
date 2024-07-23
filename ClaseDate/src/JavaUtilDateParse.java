import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateParse {

    public static void main(String[] args) {

        // Basicamente este metodo nos va a permitir pasar de un string a un date con el formato que queramos

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");// Hay que tener muy en cuenta que el formato de fecha que ingresemos aca se tiene que respetar
        // es decir, el string que querramos convertir a date debe de llevar SI O SI el formato que le especifiquemos aca, es la unica condicion
        try {
            // Esta fecha podriamos hacerla que la ingrese el usuario mediante el scanner
            Date fecha = format.parse("2020-01-05"); // Este metodo si o si nos va a requerir ser usado con un manejo de excepciones, esto por
            // si llegado el caso llegamos a ingresar un string que no lleva el formato que se le fue estipulado mas arriba, o peor aun, si se le pasa algo que no es una fecha
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
