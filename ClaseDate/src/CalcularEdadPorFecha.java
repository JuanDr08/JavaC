import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdadPorFecha {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese su fecha de nacimiento con el formato (yyyy-mm-dd) --> ");

        try {

            Date fechaUser = formato.parse(s.next());
            Date fechaActual = new Date();
            long diff = fechaActual.getTime() - fechaUser.getTime();
            long dias = (diff / (1000 * 60 * 60 * 24)) / (int) 365.25;
            System.out.println("Tu edad actualmente es de " + dias + " años");

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
