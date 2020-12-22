import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import Tienda.*;

/* class TestAudio {

	
	@Test
	public void testGetEntrada() {
		Audio x = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		assertEquals("USB", x.getEntrada());
		
	}
	@Test
	public void testGetPotencia() {
		Audio x = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		assertEquals(100, x.getPotencia());
			
	}	
	@Test
	public void testGetBluetooth() {
		Audio x = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		assertEquals(true, x.isBluetooth());
	
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Audio("","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",0.0,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 0 , true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false);
		
		new Audio(null,"A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds", null,"Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001",null,99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",0.0,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99, null,"Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros",null,"img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares",null,"USB", 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg",null, 100, true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 0 , true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false);
		
	
		
		
		
	}
	
	public void testEquals() {
		Audio sameProductoAudio = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false);
		assertTrue(x.equals(sameProductoAudio));
		
		Audio differentAudio = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false);
		assertFalse(x.equals(differentAudio));
		
		differentAudio = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false);
		assertFalse(x.equals(differentAudio));

	}
	
	public void testAddAudio() throws GroupException {
		x.addProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
		assertEquals(1, x.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddAudioErrors() throws GroupException {
	   x.addProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
		assertEquals(1, x.size());
		
	   expected.expect(GroupException.class);
	   x.addProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
	   assertEquals(2, x.size());
	   
	   expected.expect(NullPointerException.class);
	   x.addProductoAudio(null);
	   assertEquals(1, x.size());
	}
	
	public void testRemoveAudio() throws GroupException {
		x.addProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
		assertEquals(1, x.size());
		
		x.removeProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
		assertEquals(1, x.size());
			
		}
	
	}*/

	



