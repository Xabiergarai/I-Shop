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
}

	