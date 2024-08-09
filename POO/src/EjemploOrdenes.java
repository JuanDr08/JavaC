import java.util.Calendar;

public class EjemploOrdenes {

    public static void main(String[] args) {

        Calendar fechas = Calendar.getInstance();

        // Creacion de productos
        Producto prdt1 = new Producto("Lays", "Papas de pollo", 3000);
        Producto prdt2 = new Producto("Lays", "Papas de sal", 3000);
        Producto prdt3 = new Producto("Lays", "Papas de tomate", 3500);
        Producto prdt4 = new Producto("Lays", "Gudys", 2500);

        Producto prdt5 = new Producto("Cream Helado", "Chococono", 4500);
        Producto prdt6 = new Producto("Cream Helado", "Artesanal tres leches", 3000);
        Producto prdt7 = new Producto("Cream Helado", "Paletas de agua", 2000);
        Producto prdt8 = new Producto("Cream Helado", "Artesanal de maracuya", 3000);

        Producto prdt9 = new Producto("Festival", "Fresa", 1200);
        Producto prdt10 = new Producto("Festival", "Chocolate", 1200);
        Producto prdt11 = new Producto("Festival", "Vainilla", 1200);
        Producto prdt12 = new Producto("Festival", "Recreo", 1500);

        // Creacion de 3 clientes
        Cliente cliente1 = new Cliente("Pepito", "Perez");
        Cliente cliente2 = new Cliente("Fulanito", "de tal");
        Cliente cliente3 = new Cliente("Rasputia", "Ruperta");

        // Creacion de ordenes
        OrdenCompra orden1 = new OrdenCompra("Reabastecimiento de inventario");
        orden1.setCliente(cliente1);
        fechas.set(2024,Calendar.AUGUST,8);
        orden1.setFecha(fechas.getTime());
        orden1.addProducto(prdt1).addProducto(prdt5).addProducto(prdt9).addProducto(prdt12);

        OrdenCompra orden2 = new OrdenCompra("Para la tiendita de doña ulma");
        orden2.setCliente(cliente2);
        fechas.set(2024,Calendar.JULY,23);
        orden2.setFecha(fechas.getTime());
        orden2.addProducto(prdt3).addProducto(prdt7).addProducto(prdt8).addProducto(prdt4);

        OrdenCompra orden3 = new OrdenCompra("Pedido al por mayor para amazon");
        orden3.setCliente(cliente3);
        fechas.set(2024,Calendar.JUNE,16);
        orden3.setFecha(fechas.getTime());
        orden3.addProducto(prdt2).addProducto(prdt6).addProducto(prdt10).addProducto(prdt11);

        OrdenCompra[] ordenes = {orden1, orden2, orden3};
        int aux = 0;
        for(OrdenCompra orden : ordenes) {
            System.out.println("===================== Orden #" + (++aux) + " =====================");
            System.out.println("\nIdentificador Compra: " + orden.getIdentificador()
                    + "\nCliente: " + orden.getCliente().getNombre().concat(" " + orden.getCliente().getApellido())
                    + "\nDescripcion compra: " + orden.getDescripcion()
                    + "\nFecha de compra: " + orden.getFecha()
                    + "\nTotal: " + orden.granTotal());
            int aux2 = 0;
            for (Producto prdt : orden.getProductos()) {
                System.out.println("------------Producto " + (++aux2) + "------------");
                System.out.println("\nFabricante: " + prdt.getFabricante()
                        + "\nNombre: " + prdt.getNombre()
                        + "\nPrecio: " + prdt.getPrecio());

            }
        }

    }

}
