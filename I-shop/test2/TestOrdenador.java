import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import Tienda.*;

class TestOrdenador {

	@Test
	public void testGetRam() {
		Ordenador o = new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals("DDR4 8GB*2 (2666MHz)", o.getRam());
		
	}
	@Test
	public void testGetPulgadas() {
		Ordenador o = new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals("15.6 FHD (1920*1080)", o.getPulgadas());
		
	}
			
	@Test
	public void testGetPortatil() {
		Ordenador o = new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals(true, o.getPortatil());
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Ordenador(null, "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", null,"Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01",null,999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",0.0,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,null,"Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",null,"DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador",null,15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",0.0,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,false);

		new Ordenador("", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",0.0,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","",15.6,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",0.0,true);
		new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,false);
	
	}
	
	public void testEquals() {
		Ordenador sameOrdenador = new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertTrue(o.equals(sameOrdenador));
		
		Ordenador differentOrdenador = new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertFalse(o.equals(differentOrdenador));
		
		differentOrdenador = new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertFalse(o.equals(differentOrdenador));

	}
	
	public void testAddOrdenador() throws GroupException {
		a.addOrdenador(new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true));
		assertEquals(1, o.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddOrdenadorErrors() throws GroupException {
		a.addOrdenador(new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true));
		assertEquals(1, o.size());
		
	   expected.expect(GroupException.class);
	   a.addOrdenador(new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true));
	   assertEquals(2, o.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addOrdenador(null);
	   assertEquals(a, o.size());
	}
	
	public void testRemoveOrdenador() throws GroupException {
		a.addOrdenador(new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true));
		assertEquals(1, o.size());
		
		a.removeOrdenador(new Ordenador("Macbook Pro", "E01","Atributos",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","DDR4 8GB*2 (2666MHz)",15.6,true));
		assertEquals(0, o.size());
			
		}
	
	}



