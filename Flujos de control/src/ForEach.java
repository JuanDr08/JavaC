public class ForEach {

    public static void main(String[] args) {

        // Es similar al for pero de una forma mas facil de leer
        // Solamente se utiliza para recorrer arreglos o objetos de coleccion que son tipos de iterable
        // Con cada elemento del arreglo podemos hacer algo
        // No necesita declarar variable, ni condicion, ni incrementales
        // Cada elemento se recorre de forma automatica

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num : numeros) { // Es como un for pero solo cambia la estructura interna de este
            // Primero debemos declarar el tipo de dato, luego el nombre de variable que ira tomando el valor de cada dato del arreglo principal
            // a medida que itera sombre este, luego un ' : ' y por ultimo el objeto que queremos iterar.

            // Entonces por cada iteracion ' num ' ira tomando los valores 1, 3, 5, etc...
            System.out.println("num = " + num);

        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo"};
        for ( String nombre : nombres ) { // Importante que la variable interna tenga el mismo tipo de dato que el iterable

            System.out.println("nombre = " + nombre);

        }

    }

}
