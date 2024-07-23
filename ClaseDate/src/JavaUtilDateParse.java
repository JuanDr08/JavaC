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

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);
            //Metodos utilizados para comparar fechas
            if (fecha.after(fecha2)) System.out.println("Fecha del usuario es despues que la fecha2");
            else if(fecha.before(fecha2)) System.out.println("Fecha es anterior que fecha2");
            else if(fecha.equals(fecha2)) System.out.println("fecha es igual a fecha 2");

            // Segundo metodo
            if (fecha.compareTo(fecha2) > 0) System.out.println("Fecha es despues que fecha2");// Si este resultado es mayor que cero quiere decir que fecha es mayor que fecha2
            else if(fecha.compareTo(fecha2) < 0) System.out.println("Fecha es anterior que fecha2"); // si da un numero menor a 0 quiere decir que fecha es menor
            else if(fecha.compareTo(fecha2) == 0) System.out.println("Ambas fechas son iguales"); // si da el numero cero quiere decir que son iguales

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
