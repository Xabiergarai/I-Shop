import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTelevision {
	
	@Test
	 public void testGetTipo() {
		Television t = new Television("LED UltraHD 4K","Plano","50","Si");
		assertEquals("LED UltraHD 4K", t.getTipo());
		

	@Test
	 public void testGetFormaPantalla() {
		Television t = new Television("LED UltraHD 4K","Plano","50","Si");
		assertEquals("Plano", t.getFormaPantalla());
			

	@Test
	public void testGetPulgadas() {
		Television t = new Television("LED UltraHD 4K","Plano","50","Si");
		assertEquals("50", t.getPulgadas());
				

	@Test
	public void testGetSmartTV() {
		Television t = new Television("LED UltraHD 4K","Plano","50","Si");
		assertEquals("Si", t.getSmartTV());
					
			

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
/*private String tipo;
private String formaPantalla;
private int pulgadas;
private boolean smartTV;