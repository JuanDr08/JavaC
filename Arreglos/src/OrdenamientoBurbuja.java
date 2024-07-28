public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        String[] productos = { "Kingston", "Samsung",
                "Asus", "Chromecast", "Bicicleta" };

        for (int i = 0; i < productos.length; i++) { // Metodo de ordenamiento burbuja, es util pero poco eficiente ya que consume mucho recurso
            for (int j = 0; j < productos.length; j++) {

                if(productos[i].compareTo(productos[j]) < 0) { // Recordar que el metodo compareTo en Strings compara a nivel lexico grafico
                    // Osea segun la tabla UNICODE va evaluando que string debe estar en un nivel mas alto y cual mas bajo, basicamente
                    // Compara en orden alfabetico, si da un numero menor a 0 quiere decir que es de un nivel mas bajo va antes,
                    // si da mas de 0 quiere decir que es de un nivel mas alto osea va despues

                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;

                }

            }
        }

        // Metodo burbuja mejorado
        // Revisar el video de: https://www.udemy.com/course/master-completo-java-de-cero-a-experto/learn/lecture/20770852#overview
        // en el minuto 5 para mas explicacion o desde el inicio para ver toda la explicacion

        for (int i = 0; i < productos.length - 1; i++) { // Metodo de ordenamiento burbuja optimizado
            for (int j = 0; j < productos.length - 1 - i; j++) {
                if(productos[i].compareTo(productos[j]) < 0) { // si da negativo quiere decir que la cadena que llama al metodo compareTo
                    // debe ir antes, si da positivo quiere decir que la cadena que llama el metodo debe ir despues
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
            }
        }

    }

}
