import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();// Esta clase calendar basicamente nos permite asignar una fecha en especifico, ya sea en pasado o futuro y no unicamente la fecha actual
        // Esta clase es especial ya que no es como las otras que podriamos crear la instancia con el operador new, porque esta es una clase abstracta, lo que quiere decir
        // que no permite crear la instancia concreta con el operador new, por lo que la instancia la maneja la propia clase por debajo invocando el metodo estatico get instance
        // con ese metodo invocamos y creamos la instancia de calendar, por debajo ese metodo estatico realiza el new, crea por nosotros el calendario

        calendario.set(2020, 0, 25); // Este metodo nos permite indicar una fecha en especifico por ejemplo año/mes/dia
        // Los meses funcionan como un indice de un array, empiezan desde 0, siendo 0 enero y 11 diciembre
        Date fecha = calendario.getTime(); // Este metodo getTime de calendario retorna un date de java util
        System.out.println("calendario = " + fecha);

        // Calendar.SEPTEMBER; Tambien podemos acceder a las fechas de los meses mediante constantes internas de la clase calendar

        // Tambien podemos asignar por partes el calendario, usando el mismo metodo set, pero dandole como parametro la parte de la fecha y su valor
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY); // Podemos llamar los meses como constantes dentro de la clase calendar
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        calendario.set(Calendar.HOUR_OF_DAY, 21); // hour_of_day es la hora militar del calendario, y hour es la hora normal
        // calendario.set(Calendar.HOUR, 7); // Formato tradicional de 12 horas
        // calendario.set(Calendar.AM_PM, Calendar.PM); // Con esto especificamos el am o pm y en el segundo parametro le especificamos que será pm
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha2 = calendario.getTime(); // Devuele un objeto de la clase date
        System.out.println("fecha sin formato = " + fecha2);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS"); // Podemos usar SimpleDateFormat para darle orden a nuestra nueva fecha
        // Para agregar que nos muestre si es pm o am debemos agregar al final o donde queramos del formato la letra ' a '
        // Si queremos que el formato nos lo muestre no en horario militar sino en tradicional de a 12 horas entonces deberemos cambiar las 'HH' por 'hh'
        String fechaConFormato = formato.format(fecha2); // Le pasamos la fecha que teniamos generada por partes con calendar para que le de formato con simpleDateFormat
        System.out.println("fechaConFormato = " + fechaConFormato);

    }

}
