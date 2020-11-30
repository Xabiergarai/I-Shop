import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Tienda.ProductoOrdenador;

class TestOrdenador {

	@Test
	public void testGetRam() {
		Ordenador o = new Ordenador("DDR4 8GB*2 (2666MHz)","15.6","Si");
		assertEquals("DDR4 8GB*2 (2666MHz)", o.getram());
		
	
	@Test
	public void testGetPulgadas() {
		Ordenador o = new Ordenador("DDR4 8GB*2 (2666MHz)","15.6 FHD (1920*1080)","Si");
		assertEquals("15.6 FHD (1920*1080)", o.getpulgadas());
			
	@Test
	public void testGetPortatil() {
		Ordenador o = new Ordenador("DDR4 8GB*2 (2666MHz)","15.6 FHD (1920*1080)","Si");
		assertEquals("Si", o.getportatil());
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IlegalArgumentException.class);
		newProductoOrdenador(null,"15.6","Si");
		newProductoOrdenador("DDR4 8GB*2 (2666MHz)",null,"Si");
		newProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6",null);
		newProductoOrdenador("","15.6","Si");
		newProductoOrdenador("DDR4 8GB*2 (2666MHz)","","Si");
		newProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","");
			
	}
	
	public void testEquals() {
		ProductoOrdenador sameProductoOrdenador = new ProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","Si");
		assertTrue(o.equals(sameProductoOrdenador));
		
		ProductoOrdenador diferentProductoOrdenador = new ProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","Si");
		assertFalse(o.equals(differentProductoOrdenador));
		
		diferentProductoOrdenador = new ProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","Si");
		assertFalse(o.equals(differentProductoOrdenador));

	}
	
	public void testAddProductoOrdenador() throws GroupException {
		a.addProductoOrdenador(new ProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","Si"));
		assertEquals(1, o.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddProductoOrdenadorErrors() throws GroupException {
		a.addProductoOrdenador(new ProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","Si"));
		assertEquals(1, o.size());
		
	   expected.expect(GroupException.class);
	   a.addProductoOrdenador(new ProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","Si"));
	   assertEquals(2, o.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addProductoOrdenador(null);
	   assertEquals(a, o.size());
	}
	
	public void testRemoveProductoOrdenador() throws GroupException {
		a.addProductoOrdenador(new ProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","Si"));
		assertEquals(1, o.size());
		
		a.removeProductoOrdenador(new ProductoOrdenador("DDR4 8GB*2 (2666MHz)","15.6","Si"));
		assertEquals(0, o.size());
			
		}
	}
	}
}


