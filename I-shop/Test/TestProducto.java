package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.*;

import Tienda.Producto;

class TestProducto {
	
	@Test
	public void testGetNombreProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("Macbook Pro",p.getNombre());	
		
	}
	
	@Test
	public void testGetCodigoProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("E01",p.getCodigo());	
		
	}
	
	@Test
	public void testGetAtributosProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("Atributos",p.getAtributos());	
		
	}
	
	@Test
	public void testGetPrecioProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("999.99",p.getNombre());	
		
	}
	
	@Test
	public void testGetDescripcionProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",p.getDescripcionPorducto());	
		
	}
	
	@Test
	public void testGetCategoriaProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("Ordenador",p.getCategoriaProducto());	
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
