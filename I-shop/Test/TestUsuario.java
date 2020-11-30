package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.*;

import Tienda.Usuario;

class TestUsuario {

	
	@Test
	public void testGetNomUsuario() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual");
		assertEquals("XabierG", u.getNomUsuario());
		
	}
	public void testgetNombre() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual");
		assertEquals("Xabier", u.getNombre());
	}
	@Test
	public void testGetApellido() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual");
		assertEquals("Garai, Pascual", u.getApellidos());
	
	}
	
	@Test
	public void testGetcontrasenya() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual");
		assertEquals("Contraseña1", u.getContrasenya());
		
	}
	
	public void testGetEmail() {
		Usuario u = new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual");
		assertEquals("Xabier.garai@opendesuto.es", u.getContrasenya());
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IlegalArgumentException.class);
		newUsuario(null,"Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai", "Pascual");
		newUsuario("XabierG",null,"Xabier.gaari@opendeusto.es","Xabier","Garai", "Pascual");
		newUsuario("XabierG","Contraeña1",null,"Xabier","Garai", "Pascual");
		newUsuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es",null,"Garai", "Pascual");
		newUsuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier",null, "Pascual");
		newUsuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai", null);
		
		newUsuario("","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai", "Pascual");
		newUsuario("XabierG","","Xabier.gaari@opendeusto.es","Xabier","Garai", "Pascual");
		newUsuario("XabierG","Contraeña1","","Xabier","Garai", "Pascual");
		newUsuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es",n","Garai", "Pascual");
		newUsuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","",Pascual");
		newUsuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai", "");
			
	}
	
	public void testEquals() {
		Usuario sameUsuario = new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual");
		assertTrue(u.equals(sameUsuario));
		
		Usuario diferentUsuario = new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual");
		assertFalse(u.equals(differentUsuario));
		
		diferentUsuario = new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual");
		assertFalse(u.equals(differentUsuario));

	}
	
	public void testAddUsuario() throws GroupException {
		a.addUsuario(new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual"));
		assertEquals(1, u.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddUsuarioErrors() throws GroupException {
		a.addUsuario(new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual"));
		assertEquals(1, u.size());
		
	   expected.expect(GroupException.class);
	   a.addUsuario(new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual"));
	   assertEquals(2, u.size());
	   
	   expected.expect(NullPointerException.class);
	   a.addUsuario(null);
	   assertEquals(a, u.size());
	}
	
	public void testRemoveUsuario() throws GroupException {
		a.addUsuario(new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual"));
		assertEquals(1, u.size());
		
		a.removeUsuario(new Usuario("XabierG","Contraeña1","Xabier.gaari@opendeusto.es","Xabier","Garai, Pascual"));
		assertEquals(0, u.size());
			
		}
	}
	}
}



