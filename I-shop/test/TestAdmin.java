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

