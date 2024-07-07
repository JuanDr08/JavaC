import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre de 3 amigos o familiares uno por uno --> ");
        
        String p1 = s.nextLine();
        String p2 = s.nextLine();
        String p3 = s.nextLine();

        String charp1 = Character.toString(p1.charAt(1)).toUpperCase();
        
        charp1 = charp1.concat("." + p1.substring(p1.length() - 2));
        
        String charp2 = Character.toString(p2.charAt(1)).toUpperCase();
        
        charp2 = charp2.concat("." + p2.substring(p2.length() - 2));
        
        String charp3 = Character.toString(p3.charAt(1)).toUpperCase();
        
        charp3 = charp3.concat("." + p3.substring(p3.length() - 2));

        String result = charp1.concat("_" + charp2 + "_" + charp3);

        System.out.println("result = " + result);

    }

}
