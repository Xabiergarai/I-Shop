
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.*;
import org.junit.rules.ExpectedException;

import Tienda.*;

class TestProducto {
	
	@Test
	public void testGetNombreProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("Macbook Pro",p.getNombre());	
		
	}
	
	@Test
	public void testGetCodigoProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("E01",p.getCodigo());	
		
	}
	
	@Test
	public void testGetMarcaProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("Atributos",p.getMarca());	
		
	}
	
	@Test
	public void testGetPrecioProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("999.99",p.getNombre());	
		
	}
	
	@Test
	public void testGetDescripcionProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",p.getDescripcion());	
		
	}
	
	@Test
	public void testGetCategoriaProducto() {
		
		Producto p = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertEquals("Ordenador",p.getCategoria());	
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Producto(null, "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		new Producto("Macbook Pro", null,"Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		new Producto("Macbook Pro", "E01",null,999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		new Producto("Macbook Pro", "E01","Apple",0.0,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		new Producto("Macbook Pro", "E01","Apple",999.99,null,"Ordenador");
		new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",null);
		
		new Producto("", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		new Producto("Macbook Pro","","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		new Producto("Macbook Pro", "E01","",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		new Producto("Macbook Pro", "E01","Apple",0.0,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		new Producto("Macbook Pro", "E01","Apple",999.99,"","Ordenador");
		new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","");

		
	
	public void testEquals() {
		Producto sameProducto = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertTrue(p.equals(sameProducto));
		
		Producto differentProducto = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertFalse(p.equals(differentProducto));
		
		differentProducto = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertFalse(p.equals(differentProducto));

	}
	
	public void testAddProducto() throws GroupException {
		a.addProducto(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
		assertEquals(1, p.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddProductoErrors() throws GroupException {
		p.addProducto(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
		assertEquals(1, p.size());
		 
	   expected.expect(GroupException.class);
	   p.addProducto(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
	   assertEquals(2, p.size());
	   
	   expected.expect(NullPointerException.class);
	   p.addProducto(null);
	   assertEquals(1, p.size());
	}
	
	public void testRemoveProducto() throws GroupException {
		p.addProducto(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
		assertEquals(1, p.size());
		
		p.removeProducto(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
		assertEquals(0, p.size());
			
		}
	}
	}



