public class Matrices {

    public static void main(String[] args) {

        // Basicamente una matriz es un arreglo en dos dimensiones, parecido a una tabla con celdas en excel, se definen mediante dos
        // [][], donde el primero hace referencia a las filas y el segundo hace referencia a las columnas

        int[][] nums = new int[2][4];

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 4;

        nums[1][0] = 11;
        nums[1][1] = 12;
        nums[1][2] = 13;
        nums[1][3] = 14;

        System.out.println("Numero de filas " + nums.length); // Asi obtenemos el largo de la matriz, es decir, cuantas filas tiene
        System.out.println("Cantidad de columnas " + nums[0].length); // Asi obtenemos la cantidad de columnas de una matriz, esto se hace accediendo
        // a cualquiera de las filas y tomando su longitud

        System.out.println("Primer elemento de la matriz " + nums[0][0]); // Asi se accede al primer elemento de toda la matriz
        System.out.println("Ultimo elemento de la matriz " + nums[nums.length - 1 ][nums[1].length - 1 ]); // Asi se accede al ultimo elemnto de la matriz
        // el que esta hasta abajo alfondo a la derecha de uno

    }

}
