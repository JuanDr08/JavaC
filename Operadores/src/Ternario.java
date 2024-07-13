public class Ternario {

    public static void main(String[] args) {

        // Es como una version abreviada del if/else.
        // Se llama ternario porque esta formado por 3 partes
        // la primera evalua una expresión booleana,
        // La segunda es el valor que asigna o devuelve si la expresión es true
        // La tercera es el valor que asigna o devuelve si la expresion es false

        // variable = condicion ? si es true : si es false  --> este operador devuelve valores dependiendo de lo que se cumpla y lo asiga a la variable en la que se encuentre
        
        String variable = 7 == 7 ? "Si es verdader" : "Si es falso"; // No hace falta que siempre sea un string, puede ser cualquier otro tipo, lo importante esque tanto en el true o false
        // ambos valores deben de ser del mismo tipo que el de la variable que los va a contener
        System.out.println("variable = " + variable);

        // El operador ternario UNICAMENTE devuelve un valor, lo asigna, mas no ejecuta codigo, por lo que no podremos hacer breaks o cosas que se ejecuten y no se asignen

    }

}
