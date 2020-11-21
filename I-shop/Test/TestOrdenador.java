import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOrdenador {

	@Test
	public void testGetRam() {
		Ordenador o = new Ordenador("DDR4 8GB*2 (2666MHz)","15.6","Si",);
		assertEquals("DDR4 8GB*2 (2666MHz)", o.getram());
		
	
	@Test
	public void testGetPulgadas() {
		Ordenador o = new Ordenador("DDR4 8GB*2 (2666MHz)","15.6 FHD (1920*1080)","Si",);
		assertEquals("15.6 FHD (1920*1080)", o.getpulgadas());
			
	@Test
	public void testGetPortatil() {
		Ordenador o = new Ordenador("DDR4 8GB*2 (2666MHz)","15.6 FHD (1920*1080)","Si",);
		assertEquals("Si", o.getportatil());
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
