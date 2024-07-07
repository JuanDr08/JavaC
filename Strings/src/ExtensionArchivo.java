public class ExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "alguna_imagen.jpg";
        String extension = archivo.substring(archivo.lastIndexOf(".")+1);
        System.out.println("extension = " + extension);

    }

}
