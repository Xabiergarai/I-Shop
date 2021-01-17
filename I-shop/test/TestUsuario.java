

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
	