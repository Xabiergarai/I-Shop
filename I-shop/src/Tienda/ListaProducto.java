package Tienda;

import java.util.HashMap;

public class ListaProducto {

    private HashMap<Integer, Producto> productos;

    public static void main(String[] args) {
        ListaProducto listaProducto = new ListaProducto();

        HashMap<Integer, Producto> lista= listaProducto.getProductos();
        lista.put(
                12342145,
                new Producto(
                        "PC", "sdfklgju76",
                        "", 7699.9
                )
        );
        lista.get(12342145);
    }

    public ListaProducto(){
        this.productos = new HashMap<Integer, Producto>();
    }

    public HashMap<Integer, Producto> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Integer, Producto> productos) {
        this.productos = productos;
    }
}
