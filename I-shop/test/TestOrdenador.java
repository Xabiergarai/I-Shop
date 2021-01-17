import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import tienda.*;

class TestOrdenador extends GroupException{

	@Test
	public void testGetRam() {
		Ordenador o = new Ordenador("Macbook Pro Intel Core","Intel", 999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals("DDR4 8GB*2 (2666MHz)", o.getRam());
		
	}
	/* @Test
	 public void testGetPulgadas() {
		Ordenador o = new Ordenador("Macbook Pro Intel Core","Intel", 999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals(15.6, o.getPulgadas()); 
		
	} */
			
	@Test
	public void testGetPortatil() {
		Ordenador o = new Ordenador("Macbook Pro Intel Core","Intel", 999.99,"Macbook Pro Intel Core i5/8gb/512GB SSD/13.3 Gris Espacial","Ordenador","img/Portatil.jpg","DDR4 8GB*2 (2666MHz)",15.6,true);
		assertEquals(true, o.isPortatil());
		
	}
}
	