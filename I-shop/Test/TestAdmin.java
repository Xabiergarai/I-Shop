import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Tienda.Usuario;

class TestAdmin {
	
	@Test
	public void testGetAdmin() {
		Admin a = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin01", a.getAdmin());
		
	@Test
	public void testGetAdmin() {
		Admin a = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin02", a.getAdminInterfaz());
		
	@Test
	public void testGetAdmin() {
		Admin a = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin03", a.getAdminInterfaz());
		
	@Test
	public void testGetAdmin() {
		Admin a = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin04", a.getAdminRecuperacion);
	

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
		assertTrue(a.equals(sameAdmin));
		
		Admin diferentAdmin = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertFalse(a.equals(differentAdmin));
		
		diferentAdmin = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertFalse(a.equals(differentAdmin));

	}
	
	public void testAddAdmin() throws GroupException {
		a.addAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
		assertEquals(1, a.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddAdminErrors() throws GroupException {
		a.addAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
		assertEquals(1,a.size());
		
	   expected.expect(GroupException.class);
	   a.addAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
	   assertEquals(2, a.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addAdmin(null);
	   assertEquals(a,a.size());
	}
	
	public void testRemoveAdmin() throws GroupException {
		a.addAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
		assertEquals(1, a.size());
		
		a.removeAdmin(new Admin("Admin01","Admin02","Admin03","Admin04"));
		assertEquals(0, a.size());
			
		}
	}
	}
}
