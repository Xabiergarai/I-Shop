package tienda;

import java.util.HashMap;
import java.util.Map;

public class ListaProducto {

    private Map<Integer, Producto> productos;

    public static void main(String[] args) {
        ListaProducto listaProducto = new ListaProducto();

        Map<Integer, Producto> lista= listaProducto.getProductos();
        lista.put(
                12342145,
                new Producto(
                        "Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador",""
                )
        );
        lista.get(12342145);
    }

    public ListaProducto(){
        this.productos = new HashMap<Integer, Producto>();
    }

    public Map<Integer, Producto> getProductos() {
        return productos;
    }

    public void setProductos(Map<Integer, Producto> productos) {
        this.productos = productos;
    }
}
