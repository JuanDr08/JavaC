import java.util.Scanner;

public class TanqueGasolina {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la medida actual del tanque --> ");
        Double actual = s.nextDouble();

        String resultado = actual >= 1 && actual < 20 ? "Insuficiente" : "";
        resultado = actual >= 20 && actual < 35 ? "Suficiente" : resultado;
        resultado = actual >= 35 && actual < 40 ? "Medio Estanque" : resultado;
        resultado = actual >= 40 && actual < 60 ? "Estanque 3/4" : resultado;
        resultado = actual >= 60 && actual < 70 ? "Estanque casi lleno" : resultado;
        resultado = actual == 70 ? "Estanque lleno" : resultado;

        System.out.println("resultado = " + resultado);

    }

}
