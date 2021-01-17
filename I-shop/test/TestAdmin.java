import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import tienda.*;


class TestAdmin extends GroupException {
	@Test
	public void testGetAdminUsuario() {
        Administrador a = new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin01", a.getAdminUsuario());
	}
	@Test
	public void testGetAdminInterfaz() {
		Administrador a = new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin02", a.getAdminInterfaz());
	}	
	@Test
	public void testGetAdminVerificar() {
		Administrador a = new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin03", a.getAdminVerificar());
	}	
	@Test
	public void testGetAdminRecuperacion() {
		Administrador a = new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		assertEquals("Admin04", a.getAdminRecuperacion());
	}
}

	/* @Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Administrador(null,"EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe",null,"Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B",null,"Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com",null,"Rico Perez","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose",null,"Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez",null,"Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01",null,"Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02",null,"Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03",null);
		
		new Administrador("","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","","Admin01","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","","Admin02","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","","Admin03","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","","Admin04");
		new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","");
	
	}
	
	public void testEquals() {
		Administrador a = new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","Admin04");
		Administrador sameAdmin = new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","");
		assertTrue(a.equals(sameAdmin));
		
		Administrador differentAdministrador = new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","");
		assertFalse(a.equals(differentAdministrador));
		
		differentAdministrador = new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03","");
		assertFalse(a.equals(differentAdministrador));

	}
	
	public void testAddAdmin() throws GroupException {
		ArrayList<Administrador> a = new ArrayList<>();
		a.add(new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03",""));
		assertEquals(1, a.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddAdminErrors() throws GroupException {
		ArrayList<Administrador> a = new ArrayList<>();
		a.add(new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03",""));
		assertEquals(1, a.size());
		
	   expected.expect(GroupException.class);
	   a.add(new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03",""));
	   assertEquals(2, a.size());
	   
	   expected.expect(NullPointerException.class);
	   a.add(null);
	   assertEquals(2 ,a.size());
	}
	
	public void testRemoveAdmin() throws GroupException {
		ArrayList<Administrador> a = new ArrayList<>();
		a.add(new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03",""));
		assertEquals(1, a.size());
		
		a.remove(new Administrador("JosePe","EX00B","Admin01@gmail.com","Jose","Rico Perez","Admin01","Admin02","Admin03",""));
		assertEquals(0, a.size());
			
		}
	
	}*/

