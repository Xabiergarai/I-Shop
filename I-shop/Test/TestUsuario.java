package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
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

}
