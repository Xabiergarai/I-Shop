import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSmartphone {

	@Test
	 public void testGetsistemaOperativo() {
		Smartphone s = new Smartphone("iOS 11","4,7","NFC con modo de lectura");
		assertEquals("iOS 11", s.getsistemaOperativo());

	@Test
    public void testGetPulgadas() {
		Smartphone s = new Smartphone("iOS 11","4,7","NFC con modo de lectura");
		assertEquals("4,7", s.getpulgadas());
			
	@Test
    public void testGetNfc() {
		Smartphone s = new Smartphone("iOS 11","4,7","NFC con modo de lectura");
		assertEquals("NFC con modo de lectura", s.getnfc());
	
	
	
	@Test
	void test() {
		fail("Not yet implemented");
		
	}
	
	public void testInvalidArguments() {
		expected.expect(IlegalArgumentException.class);
		newAdmin(null,"Admin02","Admin03","Admin04");
		newAdmin("Admin01",null,"Admin03","Admin04");
		newAdmin("Admin01","Admin02",null,"Admin04");
		newAdmin(Admin01,"Admin02","Admin03",null);
		
		newAdmin("","Admin02","Admin03","Admin04");
		newAdmin("Admin01","","Admin03","Admin04");
		newAdmin("Admin01","Admin02","","Admin04");
		newAdmin("Admin01","Admin02","Admin03","");
	}
	
	public void testEquals() {
		Admin sameAdmin = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertTrue(s.equals(sameAdmin));
		
		Admin diferentAdmin = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertFalse(s.equals(differentAdmin));
		
		diferentAdmin = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertFalse(s.equals(differentAdmin));

	}
	
	public void testAddAdmin() throws GroupException {
		a.addAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
		assertEquals(1, s.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddAdminErrors() throws GroupException {
		a.addAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
		assertEquals(1, s.size());
		
	   expected.expect(GroupException.class);
	   a.addAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
	   assertEquals(2, s.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addAdmin(null);
	   assertEquals(a, s.size());
	}
	
	public void testRemoveAdmin() throws GroupException {
		a.addAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
		assertEquals(1, s.size());
		
		a.removeAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
		assertEquals(0, s.size());
			
		}
	}
	}
}




