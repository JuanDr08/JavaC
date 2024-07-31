public class ArreglosCombinados {

    public static void main(String[] args) {

        int[] a, b, c;

        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++) {

            a[i] = i + 1;
            b[i] = (1+i)*5;

        }

        int aux = 0;
        for (int i = 0; i < 10; i++) {
            // Se utiliza un mecanismo semejante que al ejercicio de OrdenPrimeroUltimoYReasignacion, donde nos apoyamos de una variable auxiliar para acceder a los distintos metodos
            // de el arreglo c
            c[aux++] = a[i];
            c[aux++] = b[i];

        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c = " + c[i]);
        }

    }

}
