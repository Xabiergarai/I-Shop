import static org.junit.Assert.assertEquals;
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
	
	public void testInvalidArguments() {
		expected.expect(IlegalArgumentException.class);
		newProductoOrdenador(null,"Plano","50","Si");
		newProductoOrdenador("LED UltraHD 4K",null,"50","Si");
		newProductoOrdenador("LED UltraHD 4K","Plano",null,"Si");
		newProductoOrdenador("LED UltraHD 4K","Plano","50",null);
		
		newProductoOrdenador("","Plano","50","Si");
		newProductoOrdenador("LED UltraHD 4K","","50","Si");
		newProductoOrdenador("LED UltraHD 4K","Plano","","Si");
		newProductoOrdenador("LED UltraHD 4K","Plano","50","");
		
	}
	
	public void testEquals() {
		ProductoOrdenador sameProductoOrdenador = new ProductoOrdenador("LED UltraHD 4K","Plano","50","Si");
		assertTrue(o.equals(sameProductoOrdenador));
		
		ProductoOrdenador diferentProductoOrdenador = new ProductoOrdenador("LED UltraHD 4K","Plano","50","Si");
		assertFalse(o.equals(differentProductoOrdenador));
		
		diferentProductoOrdenador = new ProductoOrdenador("LED UltraHD 4K","Plano","50","Si");
		assertFalse(o.equals(differentProductoOrdenador));

	}
	
	public void testAddProductoOrdenador() throws GroupException {
		a.addProductoOrdenador(new ProductoOrdenador("LED UltraHD 4K","Plano","50","Si"));
		assertEquals(1, o.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddProductoOrdenadorErrors() throws GroupException {
		a.addProductoOrdenador(new ProductoOrdenador("LED UltraHD 4K","Plano","50","Si"));
		assertEquals(1, o.size());
		
	   expected.expect(GroupException.class);
	   a.addProductoOrdenador(new ProductoOrdenador("LED UltraHD 4K","Plano","50","Si"));
	   assertEquals(2, o.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addProductoOrdenador(null);
	   assertEquals(a, o.size());
	}
	
	public void testRemoveProductoOrdenador() throws GroupException {
		a.addProductoOrdenador(new ProductoOrdenador("LED UltraHD 4K","Plano","50","Si"));
		assertEquals(1, o.size());
		
		a.removeProductoOrdenador(new ProductoOrdenador("LED UltraHD 4K","Plano","50","Si"));
		assertEquals(0, o.size());
			
		}
	}
	}
}


