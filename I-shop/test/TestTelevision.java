import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import tienda.*;

   class TestTelevision extends GroupException {
	
	@Test
	 public void testGetTipo() {
		Television t = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertEquals("LED UltraHD 4K", t.getTipo());
	}

	@Test
	 public void testGetFormaPantalla() {
		Television t = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertEquals("Plano", t.getFormaPantalla());
		
	}

	@Test
	public void testGetPulgadas() {
		Television t = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertEquals(50, t.getPulgadas());
		
	}

	@Test
	public void testGetSmartTV() {
		Television t = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertEquals(true, t.isSmartTV());
					
	}	

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Television("","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",0.0,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",0,true);
		
		new Television(null,"T001",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV",null,331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",0.0,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,null,"Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV",null,"img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television",null,"LED UltraHD 4K","Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg",null,"Plano",50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K",null,50,true);
		new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",0,true);
	

		
	}
	
	public void testEquals() {
		ArrayList<Television> t = new ArrayList<>();
		Television sameProductoTelevision = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertTrue(t.equals(sameProductoTelevision));
		
		Television differentTelevision = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertFalse(t.equals(differentTelevision));
		
		differentTelevision = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertFalse(t.equals(differentTelevision));

	}
	
	public void testAddProductoTelevision() throws GroupException {
		ArrayList<Television> t = new ArrayList<>();
		t.add(new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true));
		assertEquals(1, t.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddProductoTelevisionErrors() throws GroupException {
		ArrayList<Television> t = new ArrayList<>();
		t.add(new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true));
		assertEquals(1, t.size());
		
	   expected.expect(GroupException.class);
	   t.add(new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true));
	   assertEquals(2, t.size());
	   
	   expected.expect(NullPointerException.class);
	   t.add(null);
	   assertEquals(1, t.size());
	}
	
	public void testRemoveProductoTelevision() throws GroupException {
		ArrayList<Television> t = new ArrayList<>();
		t.add(new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true));
		assertEquals(1, t.size());
		
		t.remove(new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true));
		assertEquals(0, t.size());
			
		}
}


