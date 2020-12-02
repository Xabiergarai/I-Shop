import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import Tienda.*;

class TestAudio {

	
	@Test
	public void testGetEntrada() {
		Audio x = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB", 100, true);
		assertEquals("USB", x.getEntrada());
		
	}
	@Test
	public void testGetPotencia() {
		Audio x = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		assertEquals(100, x.getPotencia());
			
	}	
	@Test
	public void testGetBluetooth() {
		Audio x = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		assertEquals(true, x.getBluetooth());
	
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Audio(null,"A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		new Audio("Samsung Galaxy Buds",null,"Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",0.0,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,null,"Auriculares","USB",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros",null,"USB",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares",null,100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",0,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,false);
		
		new Audio("","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		new Audio("Samsung Galaxy Buds","","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",0.0,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"","Auriculares","USB",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","","USB",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","",100,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",0,true);
		new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,false);
		
		
		
	}
	
	public void testEquals() {
		Audio sameProductoAudio = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		assertTrue(x.equals(sameProductoAudio));
		
		Audio differentAudio = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		assertFalse(x.equals(differentAudio));
		
		differentAudio = new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true);
		assertFalse(x.equals(differentAudio));

	}
	
	public void testAddAudio() throws GroupException {
		x.addProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true));
		assertEquals(1, x.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddAudioErrors() throws GroupException {
	   x.addProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true));
		assertEquals(1, x.size());
		
	   expected.expect(GroupException.class);
	   x.addProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true));
	   assertEquals(2, x.size());
	   
	   expected.expect(NullPointerException.class);
	   x.addProductoAudio(null);
	   assertEquals(1, x.size());
	}
	
	public void testRemoveAudio() throws GroupException {
		x.addProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true));
		assertEquals(1, x.size());
		
		x.removeProductoAudio(new Audio("Samsung Galaxy Buds","A001","Samsung",99.99,"Samsung Galaxy Buds+ Auriculares Inalámbricos Negros","Auriculares","USB",100,true));
		assertEquals(1, x.size());
			
		}
	
	}

	



