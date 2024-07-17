public class EtiquetasDeBucle {

    public static void main(String[] args) {

        // Basicamente si llegado el caso llegamos a tener varios bucles anidados y queremos hacer un break o algun continue a uno de los bucles
        // que estan en el nivel mas externo, se nos hará complicado, puesto que al intentar usar break o continue probablemente se lo apliquemos
        // a uno de los bucles mas internos, causando que finalicemos o nos saltemos algo que no queremos
        // Para esto vienen las etiquetas, formas de darle nombre a nuestros bucles, para que al momento de querere hacer breaks o continue
        // a los bucles mas externos simplemente sea necesario decir el nombre del bucle que queremos terminar o continuar y listo, se le aplicara
        // al mas externo o al que hayamos nombrado para terminar

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");

            }

        }
        System.out.println("\n=================================================");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");

            }

        }


    }

}
