import javax.swing.*;

public class NombreMasLargo {

    public static void main(String[] args) {

        String name1 = JOptionPane.showInputDialog("Ingrese el nombre completo de la primer persona");
        String name2 = JOptionPane.showInputDialog("Ingrese el nombre completo de la segunda persona");
        String name3 = JOptionPane.showInputDialog("Ingrese el nombre completo de la tercer persona");

        String largest = name1.length() > name2.length() ? name1 : name2;
        largest = largest.length() > name3.length() ? largest.split(" ")[0] : name3.split(" ")[0];

        System.out.println(largest + " tiene el nombre mas largo");

    }

}
