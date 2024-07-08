public class Asignacion {

    public static void main(String[] args) {

        // Basicamente el que se usa para asignar un valor a una variable

        int i = 5; // ' = ' ese es el operador de asignacion
        System.out.println("i = " + i);

        int j = i + 4;

        // Pero tambien tenemos los combinados o compuestos, que realizan una operacion y se asignan al resultado automaticamente

        i += 2; // estamos sumandole 2 a i y de paso el resultado se lo asignamos a i
        System.out.println("i = " + i);

        j -= 4; // j = j - 4 Ahora solo realizamos lo mismo pero restando y asignando
        System.out.println("j = " + j);

        j *= 3; // j = j * 3 Ahora con multiplicacion
        System.out.println("j = " + j);

        String sqlString = "SELECT * FROM clientes as c";
        sqlString += " Where c.nombre = 'Andres'"; // el operador de suma y asignacion puede ser utilizado para concatenar strings tambien
        // ya que le concatena un nuevo string al antiguo y lo guarda nuevamente
        System.out.println("sqlString = " + sqlString);

    }

}
