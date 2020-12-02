

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.*;
import org.junit.rules.ExpectedException;

import Tienda.*;

class TestUsuario {

	
	@Test
	public void testGetNomUsuario() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("XabierG", u.getNomUsuario());
		
	}
	public void testgetNombre() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("Xabier", u.getNombre());
	}
	@Test
	public void testGetApellido() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("Garai, Pascual", u.getApellidos());
	
	}
	
	@Test
	public void testGetcontrasenya() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("Contraseña1", u.getContrasenya());
		
	}
	
	public void testGetEmail() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertEquals("Xabier.garai@opendesuto.es", u.getContrasenya());
	}
	
	
	@Test
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
		Usuario sameUsuario = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertTrue(u.equals(sameUsuario));
		
		Usuario differentUsuario = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertFalse(u.equals(differentUsuario));
		
		differentUsuario = new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual");
		assertFalse(u.equals(differentUsuario));

	}
	
	public void testAddUsuario() throws GroupException {
		a.addUsuario(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
		assertEquals(1, u.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddUsuarioErrors() throws GroupException {
		a.addUsuario(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
		assertEquals(1, u.size());
		
	   expected.expect(GroupException.class);
	   a.addUsuario(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
	   assertEquals(2, u.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addUsuario(null);
	   assertEquals(1, u.size());
	}
	
	public void testRemoveUsuario() throws GroupException {
		a.addUsuario(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
		assertEquals(1, u.size());
		
		a.removeUsuario(new Usuario("XabierG","Contraeña1","Xabier.garai@opendeusto.es","Xabier","Garai Pascual"));
		assertEquals(0, u.size());
			
		}
	
	}




