import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAudio {

	
	@Test
	public void testGetEntrada() {
		Audio x = new Audio("USB","100w","Si",);
		assertEquals("USB", x.getEntrada());
		
	@Test
	public void testGetPotencia() {
		Audio x = new Audio("USB","100w","Si",);
		assertEquals("100w", x.getPotencia());
			
			
	@Test
	public void testGetBluetooth() {
		Audio x = new Audio("USB","100w","Si",);
		assertEquals("Si", x.getBluetooth());
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}

