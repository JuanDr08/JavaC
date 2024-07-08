public class Relacionales {

    public static void main(String[] args) {

        // Nos permiten comparar variables, el operador de igualdad es mas que todo para usar en los tipos primitivos, ya que en los de referencia es mejor usar el metodo equals(), por el tema de
        // la referencia y eso
        // Devuelven resultados booleanos, suelen ser usados en los bloques if-else y tambien loops

        int i = 3;
        int j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j; // Operador de igualdad, el resultado será false, si queremos comparar objetos con este operador, no comparará el valor, sino la referencia, es decir que ambos apunten al
        // mismo espacio de memoria, para los objetos es mejor usar el metodo equals
        System.out.println("b1 = " + b1);

        boolean b2 = !b1; // Operador de negacion, invierte el valor booleano, es decir, si tenemos un ture, entonces este lo volvera false, y si tenemos false, lo volvera true

        boolean b3 = i != j; // Operador de distincion, buscará que ambos valores sean distintos, es decir, que no tengan el mismo valor, si se cumple devuelve true, si son iguales da false

        boolean b4 = m == true; // Podemos comparar con más booleanos

        boolean b5 = m != true;

        boolean b6 = i > j; // Operador mayor que, buscara que el valor de la izquierda sea mas grande que el de la izquierda, si el valor de la izquierda es igual tambien dará false
        // ya que tiene que ser estrictamente mayor

        boolean b7 = i < j; // Operador menor que, lo mismo que mayor que, solo que buscara que el de la izquierda sea estrictamente menor que el de la derecha

        boolean b8 = l >= k; // Operador mayor o igual que, lo mismo que mayor que, solo que este si tomara en cuenta que el valor de la izquierda pueda ser igual

        boolean b9 = l <= k; // Operador menor o igual que, lo mismo, solo que toma en cuenta que ambos puedan ser iguales

    }

}
