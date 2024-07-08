public class Unarios {

    public static void main(String[] args) {

        // El unario positivo con el + y el negativo con el -
        // Invierten el signo del entero, es decir, de positivo a negativo y viceversa
        int i = -5;

        int j = +i; // j = (1)*i => -5
        System.out.println("j = " + j);
        
        int k = -i; // k = (-1) * i => 5
        System.out.println("k = " + k);
        
        i = 6;
        j = +i;
        System.out.println("j = " + j);
        
        k = -i;
        System.out.println("k = " + k);

        // Basicamente se utilizan para invertir el signo del numero, el unario positivo basicamente mantiene el signo, y el unario negativo si es el que los invierte
        /*
            + + => +
            + - => -
            - + => -
            - - => +
        */

    }

}
