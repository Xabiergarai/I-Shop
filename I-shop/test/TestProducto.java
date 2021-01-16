
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.*;
import org.junit.rules.ExpectedException;

import tienda.*;

 class TestProducto {
	
	@Test
	public void testGetNombreProducto() {
		
		Producto p = new Producto();
		assertEquals("Macbook Pro",p.getNombre());	
		
	}
	
	
	@Test
	public void testGetMarcaProducto() {
		
		Producto p = new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		assertEquals("Atributos",p.getMarca());	
		
	}
	
	@Test
	public void testGetPrecioProducto() {
		
		Producto p = new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		assertEquals(999.99 ,p.getPrecio());
		
	}
	
	@Test
	public void testGetDescripcionProducto() {
		
		Producto p = new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		assertEquals("Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",p.getDescripcion());	
		
	}
	
	@Test
	public void testGetCategoriaProducto() {
		
		Producto p = new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		assertEquals("Ordenador",p.getCategoria());	
		
	}
	
	@Test
	public void testGetRutaFotoProducto() {
		
		Producto p = new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		assertEquals("img/pc3.jpg",p.getRutaFoto());
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Producto(null, "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", null,999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",0.0,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,null,"Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",null,"img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",null,"");
	
		new Producto(null, "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", null,999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",0.0,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,null,"Ordenador","img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",null,"img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",null,"img/pc3.jpg");
		new Producto("Macbook Pro", "Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador",null);
		

	}
	
	public void testEquals() {
		ArrayList<Producto> p = new ArrayList<>();
		Producto sameProducto = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		assertTrue(p.equals(sameProducto));
		
		Producto differentProducto = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		assertFalse(p.equals(differentProducto));
		
		differentProducto = new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg");
		assertFalse(p.equals(differentProducto));

	}
	
	public void testAddProducto() throws GroupException {
		ArrayList<Producto> p = new ArrayList<>();
		p.add(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg"));
		assertEquals(1, p.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddProductoErrors() throws GroupException {
		ArrayList<Producto> p = new ArrayList<>();
		p.add(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg"));
		assertEquals(1, p.size());
		 
	   expected.expect(GroupException.class);
	   p.add(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg"));
	   assertEquals(2, p.size());
	   
	   expected.expect(NullPointerException.class);
	   p.add(null);
	   assertEquals(1, p.size());
	}
	
	public void testRemoveProducto() throws GroupException {
		ArrayList<Producto> p = new ArrayList<>();
		p.add(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg"));
		assertEquals(1, p.size());
		
		p.remove(new Producto("Macbook Pro", "E01","Apple",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/pc3.jpg"));
		assertEquals(0, p.size());
			
		}
	}
	




