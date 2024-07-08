public class Logicos {

    public static void main(String[] args) {

        // El operador AND evalua que todas las condiciones se deban cumplir para ser true
        // El operador OR evalua que al menos una sola de las condiciones se cumpla

        //El operador AND tiene mayor precedencia que el OR por lo que este se buscara resolver primero antes que el OR
        // Por lo que se puede resolver de dos formas, de izquierda a derecha, o que el AND lleve precedencia y se ejecute por ahi
        // es recomendable que usemos parentesis en esos casos para tener un mayor control de lo que vamos haciendo

        int i = 3;
        int j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k > l && m == true; // Operador AND que evalua que ambas expresiones se cumplan, si la primera es falsa directamente no va a evaluar la segunda
        System.out.println("b1 = " + b1);

        boolean b2 = i == j ||  k > l; // Operador OR que evalua que al menos uno se evalue, si la primera se cumple entonces no evaluara la segunda

        boolean b3 = i == j && k > l || m == false; // Primero se evalual de izquierda a derecha, por lo que encuentra dos expresiones siendo unidas por AND, si es true entonces la siguiente
        // union de expresiones que es OR se cumpliria, si es false entonces el OR miraria con su expresion de la derecha

        b3 = i == j && (k > l || m == false); // Podemos cambiar la prioridad de evaluacion con los parentesis, haciendo que se evalue primero el bloque de la derecha y despues el otro lado
        // lo cual puede llegar a cambiar el resultado

    }

}
