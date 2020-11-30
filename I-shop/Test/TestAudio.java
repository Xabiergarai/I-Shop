import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAudio {

	
	@Test
	public void testGetEntrada() {
		Audio x = new Audio("USB","100w","Si");
		assertEquals("USB", x.getEntrada());
		
	@Test
	public void testGetPotencia() {
		Audio x = new Audio("USB","100w","Si");
		assertEquals("100w", x.getPotencia());
			
			
	@Test
	public void testGetBluetooth() {
		Audio x = new Audio("USB","100w","Si");
		assertEquals("Si", x.getBluetooth());
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IlegalArgumentException.class);
		newProductoAudio(null,"100w","Si");
		newProductoAudio("USB",null,"Si");
		newProductoAudio("USB","100w",null);
		
		newProductoAudio("","100w","Si");
		newProductoAudio("USB","","Si");
		newProductoAudio("USB","100w","");
	
		
	}
	
	public void testEquals() {
		ProductoAudio sameProductoAudio = new ProductoAudio(newProductoAudio("USB","100w","Si"));
		assertTrue(x.equals(sameProductoAudio));
		
		ProductoAudio diferentProductoAudio = new ProductoAudio(newProductoAudio("USB","100w","Si"));
		assertFalse(x.equals(differentProductoAudio));
		
		diferentProductoAudio = new ProductoAudio(newProductoAudio("USB","100w","Si"));
		assertFalse(x.equals(differentProductoAudio));

	}
	
	public void testAddProductoAudio() throws GroupException {
		a.addProductoAudio(new ProductoAudio("USB","100w","Si"));
		assertEquals(1, x.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddProductoAudioErrors() throws GroupException {
		a.addProductoAudio(new ProductoAudio("USB","100w","Si"));
		assertEquals(1, x.size());
		
	   expected.expect(GroupException.class);
	   a.addProductoAudio(new ProductoAudio("USB","100w","Si"));
	   assertEquals(2, x.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addProductoAudio(null);
	   assertEquals(a, x.size());
	}
	
	public void testRemoveProductoAudio() throws GroupException {
		a.addProductoAudio(new ProductoAudio("USB","100w","Si"));
		assertEquals(1, x.size());
		
		a.removeProductoAudio(new ProductoAudio("USB","100w","Si"));
		assertEquals(0, x.size());
			
		}
	}
	}
}


}

