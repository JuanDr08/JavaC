import java.util.Date;

public class OrdenCompra {

    public static int actIdentifier;
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto productos[] = new Producto[4];
    private int indiceProducto;

    public OrdenCompra(String descripcion) {

        this.descripcion = descripcion;

    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        this.productos[indiceProducto++] = producto;
    }

    public double granTotal() {
        /*double total = 0;
        for (Producto prdt : this.productos){
            total += prdt;
        }*/
    }

}
