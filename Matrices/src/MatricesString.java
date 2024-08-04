public class MatricesString {

    public static void main(String[] args) {

        String[][] nombresDirectos = { {"Pepe", "Pepa"},{"Josefa", "Paco"}, {"Lucas", "Pancha"} };
        // Esta es la forma simple y directa de crear una matriz asignandole instantaneamente sus valores
        // es usada mas que todo para cuando conocemos sus valores y la longitud de sus columnas y sus filas
        // Cada fila se define con {}, y es separada de otras filas mediante ' , ', cada valor que este dentro de una fila va a representar una columna
        // Por ejemplo {1,2,3,4} --> Defini una fila, con 4 columnas y sus valores de cada posicion son los que he indicado, osea, 1 luego el 2 luego el 3 y luego el 4


        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Pancha";

        System.out.println("Recorriendo con for");
        for (int i = 0; i < nombres.length; i++) { // Recorrido de filas
            for (int j = 0; j < nombres[i].length; j++) { // Recorrido de columnas
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Recorriendo  con foreach");
        for (String[] fila : nombres) {
            for (String columna : fila) {
                System.out.print(columna + "\t");
            }
            System.out.println();
        }

    }

}
