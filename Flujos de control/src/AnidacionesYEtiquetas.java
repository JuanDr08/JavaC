public class AnidacionesYEtiquetas {

    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigaltrigo";
        String palabra = "trigo";

        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i <= frase.length() - palabra.length(); i++) { // Basicamente recorre en este ejemplo hasta la ultima t, pero al llegar a esa
            // de igual manera en el segundo for recorrera los demas caracteres que estan por al frente de la t, si encuntra algo pues bien, sino,
            // pues no hace falta que el loop siga en los ultimos caracteres de la frase, ya que no encuentra la palabra
            // es solo una forma de optimizacion

            int k = i; // Toca declarar una variable que tome el valor actual de i, para posteriormente incrementarlo
            for (int j = 0; j < palabra.length(); j++) {

                if ( frase.charAt(k++) != palabra.charAt(j) ) continue buscar; // Esto debido a que si usaramos i, estariamos comparando cada caracter de j
                // con el mismo caracter de i, y lo que queremos es que se comparen uno a uno, ambos incrementando al mismo tiempo
                // y si le agregabamos el operador de postincremento a i, ocurririan interferencias con el ciclo for padre, ya que le estariamos modificando
                // el incrementable que usa para iterar, por eso asignamos i a una nueva variable y esa la usamos para incrementar junto con j
                // para que vayan comparando el mismo indice

            }
            cantidad++;

        }
        System.out.println("Encontrado " + cantidad + " Veces la palabra '" + palabra + "' en la frase" + letra);

    }

}
