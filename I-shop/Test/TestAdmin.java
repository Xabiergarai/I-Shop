import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Tienda.Usuario;

class TestAdmin {
	
	@Test
	public void testGetAdminUsuario() {
		Admin a = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin01", a.getAdminUsuario());
		
	@Test
	public void testGetAdminUsuario() {
		Admin a = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin02", a.getAdminInterfaz());
		
	@Test
	public void testGetAdminUsuario() {
		Admin a = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin03", a.getAdminInterfaz());
		
	@Test
	public void testGetAdminUsuario() {
		Admin a = new Admin("Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin04", a.getAdminRecuperacion);
	

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
