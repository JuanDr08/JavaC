import java.util.Scanner;

public class SistemaLoginLogicos {

    public static void main(String[] args) {

        String username = "Juan David";
        String password = "12345";


        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el nombre del usuario --> ");
        String u = s.nextLine();

        System.out.print("Ingrese la contraseña --> ");
        String p = s.nextLine();

        boolean isAuth = false;

        if (u.equals(username)  && p.equals(password) ) { // Recordar utilizar el metodo estatico, ya que si se usan los == se comparan son referencias de las clases, no los valores
            isAuth = true;
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }

        if (isAuth) {
            System.out.println("Bienvenido usuario ".concat(u));
        } else  {
            System.out.println("Requiere autenticacion");
        }

    }

}
