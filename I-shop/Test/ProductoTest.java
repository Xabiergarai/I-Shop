package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.*;

import Tienda.Producto;

class ProductoTest {
	
	@Test
	public void testGetNombreProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99);
		assertEquals("Macbook Pro",p.getNombre());	
		
	}
	
	@Test
	public void testGetCodigoProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99);
		assertEquals("E01",p.getCodigo());	
		
	}
	
	@Test
	public void testGetAtributosProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99);
		assertEquals("Atributos",p.getAtributos());	
		
	}
	
	@Test
	public void testGetPrecioProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Atributos",999.99);
		assertEquals("999.99",p.getNombre());	
		
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
