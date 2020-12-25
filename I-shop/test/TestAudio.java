import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import tienda.*;

class TestAudio extends GroupException {

	
	@Test
	public void testGetEntrada() {
		Audio x = new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		assertEquals("USB", x.getEntrada());
		
	}
	@Test
	public void testGetPotencia() {
		Audio x = new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		assertEquals(100, x.getPotencia());
			
	}	
	@Test
	public void testGetBluetooth() {
		Audio x = new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		assertEquals(true, x.isBluetooth());
	
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Audio("","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","Samsung",0.0,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","Samsung",99.99,"","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","","USB", 100, true);
		new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","", 100, true);
		new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, true);
		new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 0, false);
		
		
	}
	
	public void testEquals() {
		ArrayList<Audio> x = new ArrayList<>();
		Audio sameProductoAudio = new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false);
		assertTrue(x.equals(sameProductoAudio));
		
		Audio differentAudio = new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false);
		assertFalse(x.equals(differentAudio));
		
		differentAudio = new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false);
		assertFalse(x.equals(differentAudio));

	}
	
	public void testAddAudio() throws GroupException {
		ArrayList<Audio> x = new ArrayList<>();
		x.add(new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
		assertEquals(1, x.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddAudioErrors() throws GroupException {
		ArrayList<Audio> x = new ArrayList<>();
	   x.add(new Audio("Samsung Galaxy Buds","A001",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
		assertEquals(1, x.size());
		
	   expected.expect(GroupException.class);
	   x.add(new Audio("Samsung Galaxy Buds","A001",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
	   assertEquals(2, x.size());
	   
	   expected.expect(NullPointerException.class);
	   x.add(null);
	   assertEquals(1, x.size());
	}
	
	public void testRemoveAudio() throws GroupException {
		ArrayList<Audio> x = new ArrayList<>();
		x.add(new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
		assertEquals(1, x.size());
		
		x.remove(new Audio("Samsung Galaxy Buds","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg","USB", 100, false));
		assertEquals(1, x.size());
			
		}
	
	}

	



