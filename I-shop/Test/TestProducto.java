package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	
	public void testinvalidArguments() {
		expected.expect(IlegalArgumentException.class);
		newProducto(null, "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		newProducto("Macbook Pro", null ,"Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		newProducto("Macbook Pro", "E01",null ,999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		newProducto("Macbook Pro", "E01","Atributos", null ,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		newProducto("Macbook Pro", "E01","Atributos",999.99,null,"Ordenador");
		newProducto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial", null);
	}
	    newProducto("", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
	    newProducto("Macbook Pro", "","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
	    newProducto("Macbook Pro", "E01","",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
	    newProducto("Macbook Pro", "E01","Atributos", 0.0 ,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
	    newProducto("Macbook Pro", "E01","Atributos",999.99,"","Ordenador");
	    newProducto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","");
	
	
	public void testEquals() {
		Producto sameProducto = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertTrue(a.equals(sameProducto));
		
		Producto diferentProducto = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertFalse(a.equals(differentProducto));
		
		diferentProducto = new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador");
		assertFalse(a.equals(differentProducto));

	}
	
	public void testAddProducto() throws GroupException {
		a.addProducto(new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
		assertEquals(1, a.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddProductoErrors() throws GroupException {
		a.addProducto(new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
		assertEquals(1,a.size());
		
	   expected.expect(GroupException.class);
	   a.addProducto(new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
	   assertEquals(2,g.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addProducto(null);
	   assertEquals(a,a.size());
	}
	
	public void testRemoveProducto() throws GroupException {
		a.addProducto(new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
		assertEquals(1, a.size());
		
		a.removeProducto(new Producto("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador"));
		assertEquals(0, a.size());
			
		}
	}
	}
}


}
