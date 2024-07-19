public class WrapperInteger {

    public static void main(String[] args) {

        // Wrapper en ingles significa anidar

        Integer intObjeto = Integer.valueOf("32768");// Una forma de pasar un string o int primitivo para convertirlo a una instancia de Integer, se le conoce como boxing, es explicita
        Integer intObjeto2 = 32768; // Esta es la forma implicita, y se le conoce autoboxing, toma el valor primitivo de la literal y lo convierte a un objeto

        int intPrimitivo = 32768;
        intObjeto = Integer.valueOf(intPrimitivo); // También se puede pasar el primitivo como una variable para convertirlo a un objeto
        intObjeto2 = intPrimitivo; // O podemos pasar la variable como implicita y convertirla automáticamente a su valor de referencia

        int num = intObjeto; // Podemos pasar de Integer a int primitivo también de manera implicita, pasándolo solo como literal
        int num2 = intObjeto.intValue(); // O tenemos la forma explicita, con el metodo intValue el cual retorna el valor del objeto pero en primitivo

        System.out.println("intObjeto = " + intObjeto);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd); // De string al objeto de referencia Integer

        Short shortObjeto = intObjeto.shortValue(); // A pesar de que se nos permite convertir de int a short, hay que tener cuidado puesto que si el int supera el limite del short puede
        // llegar a haber ambiguedad y perdida de datos, lo mismo si intentamos pasar de Integer a Byte, o Long a Integer
        System.out.println("shortObjeto = " + shortObjeto);

        // La mayoria de metodos vistos aca aplican igual para el resto de clases de referencia, como las Byte, Long, Float, Double, etc...

    }

}
