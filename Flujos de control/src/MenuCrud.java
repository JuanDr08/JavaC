import java.util.Scanner;

public class MenuCrud {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String options = """
                1- Actualizar
                2- Eliminar
                3- Agregar
                4- Listar
                5- Salir
                """;
        infinito:
        do {

            System.out.print(options + "Ingrese la opcion que desea realizar --> ");
            int opt = s.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Usuario actualizado correctamente!");
                    break;
                case 2:
                    System.out.println("Usuario eliminado satisfactoriamente!");
                    break;
                case 3:
                    System.out.println("Usuario agregado satisfactoriamente!");
                    break;
                case 4:
                    System.out.println("Usuarios listados satisfactoriamente!");
                    break;
                case 5:
                    System.out.println("Haz salido satisfactoriamente!");
                    break infinito;
                default:
                    System.out.println("Debes elegir una opcin");
            }
        } while (true);
    }

}
