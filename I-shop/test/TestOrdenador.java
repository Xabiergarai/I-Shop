import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import tienda.*;

class TestOrdenador extends GroupException{

	@Test
	public void testGetRam() {
		Ordenador o = new Ordenador("Macbook Pro Intel Core","Atributos","Intel", 999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals("DDR4 8GB*2 (2666MHz)", o.getRam());
		
	}
	@Test
	public void testGetPulgadas() {
		Ordenador o = new Ordenador("Macbook Pro Intel Core","Atributos","Intel", 999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals("15.6 FHD (1920*1080)", o.getPulgadas());
		
	}
			
	@Test
	public void testGetPortatil() {
		Ordenador o = new Ordenador("Macbook Pro Intel Core","Atributos","Intel", 999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals(true, o.isPortatil());
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Ordenador("", "Intel","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",0.0,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",0.0,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,false);
		
		
		new Ordenador(null, "Intel","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core",null,"Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos",null,99.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",0.0,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,null,"Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial",null,"img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador",null,"DDR4 8GB*2 (2666MHz)",15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg",null,15.6,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",0.0,true);
		new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,false);
		
		
	
	}
	
	public void testEquals() {
		ArrayList<Ordenador> o = new ArrayList<>();
		Ordenador sameOrdenador = new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertTrue(o.equals(sameOrdenador));
		
		Ordenador differentOrdenador = new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertFalse(o.equals(differentOrdenador));
		
		differentOrdenador = new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertFalse(o.equals(differentOrdenador));

	}
	
	public void testAddOrdenador() throws GroupException {
		ArrayList<Ordenador> o = new ArrayList<>();
		o.add(new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true));
		assertEquals(1, o.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddOrdenadorErrors() throws GroupException {
		ArrayList<Ordenador> o = new ArrayList<>();
		o.add(new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true));
		assertEquals(1, o.size());
		
	   expected.expect(GroupException.class);
	   o.add(new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true));
	   assertEquals(2, o.size());
	   
	   expected.expect(NullPointerException.class);
	   o.add(null);
	   assertEquals(1, o.size());
	}
	
	public void testRemoveOrdenador() throws GroupException {
		ArrayList<Ordenador> o = new ArrayList<>();
		o.add(new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true));
		assertEquals(1, o.size());
		
		o.remove(new Ordenador("Macbook Pro Intel Core", "Atributos","Intel",999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true));
		assertEquals(0, o.size());
			
		}
	
	}



