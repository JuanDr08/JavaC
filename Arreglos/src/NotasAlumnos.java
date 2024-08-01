import java.util.Scanner;

public class NotasAlumnos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double[] matematicas, historia, lenguaje;
        matematicas = new double[7];
        historia = new double[7];
        lenguaje = new double[7];
        double sumMat = 0, sumHis = 0, sumLen = 0;

        System.out.println("Ingrese 7 notas de estudiantes para matematicas");
        for (int i = 0; i < matematicas.length; i++) matematicas[i] = s.nextDouble();

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < historia.length; i++) historia[i] = s.nextDouble();

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < lenguaje.length; i++) lenguaje[i] = s.nextDouble();

        for (int i = 0; i < 7; i++) {
            sumMat += matematicas[i];
            sumHis += historia[i];
            sumLen += lenguaje[i];
        }

        double promMat = sumMat/matematicas.length;
        double promHis = sumHis/historia.length;
        double promLen = sumLen/lenguaje.length;
        System.out.println("Promedio de la clase matematicas: " + promMat);
        System.out.println("Promedio de la clase historia: " + promHis);
        System.out.println("Promedio de la clase lenguaje: " + promLen);

        System.out.println("Promedio total del curso: " + ((promMat + promHis + promLen) / 3));

        System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
        int id = s.nextInt();
        double promAlum = (historia[id] + lenguaje[id] + matematicas[id]) / 3;
        System.out.println("Promedio alumno: " + promAlum + " con id " + id);

    }

}
