

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.*;
import org.junit.rules.ExpectedException;

import tienda.*;

 class TestUsuario extends GroupException {
	
	@Test
	public void testGetNomUsuario() {
		Usuario u = new Usuario("XabierG","Contrasenya","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("XabierG", u.getNomUsuario());
		
	}
	public void testgetNombre() {
		Usuario u = new Usuario("XabierG","Contrasenya","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("Xabier", u.getNombre());
	}
	@Test
	public void testGetApellido() {
		Usuario u = new Usuario("XabierG","Contrasenya","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("Garai Pascual", u.getApellidos());
	
	}
	
	@Test
	public void testGetcontrasenya() {
		Usuario u = new Usuario("XabierG","Contrasenya","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("Contrasenya", u.getContrasenya());
		
	}
	
	public void testGetEmail() {
		Usuario u = new Usuario("XabierG","Contrasenya","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("Xabier.garai@opendesuto.es", u.getContrasenya());
	}
 }
	
	/* @Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Usuario(null,"Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		new Usuario("XabierG",null,"Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		new Usuario("XabierG","Contraeña1",null,"Xabier","Garai Pascual");
		new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es",null,"Garai Pascual");
		new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier",null);
		
		new Usuario("","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		new Usuario("XabierG","","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		new Usuario("XabierG","Contraeña1","","Xabier","Garai Pascual");
		new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","","Garai Pascual");
		new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","");
		

			
	}
	
	 public void testEquals() {
		 ArrayList<Usuario> u = new ArrayList<>();
		Usuario sameUsuario = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertTrue(u.equals(sameUsuario));
		
		Usuario differentUsuario = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertFalse(u.equals(differentUsuario));
		
		differentUsuario = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertFalse(u.equals(differentUsuario));

	}
	
	public void testAddUsuario() throws GroupException {
		ArrayList<Usuario> u = new ArrayList<>();
		u.add(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
		assertEquals(1, u.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddUsuarioErrors() throws GroupException {
		ArrayList<Usuario> u = new ArrayList<>();
		u.add(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
		assertEquals(1, u.size());
		
	   expected.expect(GroupException.class);
	   u.add(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
	   assertEquals(2, u.size());
	   
	   expected.expect(NullPointerException.class);
	   u.add(null);
	   assertEquals(1, u.size());
    }
	
	public void testRemoveUsuario() throws GroupException {
		ArrayList<Usuario> u = new ArrayList<>();
		u.add(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
		assertEquals(1, u.size());
		
		u.remove(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
		assertEquals(0, u.size());
			
		}
	
	} */




