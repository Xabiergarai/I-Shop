import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import tienda.*;

   class TestTelevision extends GroupException {
	
	@Test
	 public void testGetTipo() {
		Television t = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertEquals("LED UltraHD 4K", t.getTipo());
	}

	@Test
	 public void testGetFormaPantalla() {
		Television t = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertEquals("Plano", t.getFormaPantalla());
		
	}

	/* @Test
	public void testGetPulgadas() {
		Television t = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertEquals(50.0, t.getPulgadas());
		
	}*/

	@Test
	public void testGetSmartTV() {
		Television t = new Television("Xiaomi Mi TV","Xiaomi",331.55,"TV Xiaomi Mi TV 4S 43 4K UHD HDR Smart TV","Television","img/tv1.jpg","LED UltraHD 4K","Plano",50,true);
		assertEquals(true, t.isSmartTV());
					
	}	
   }

	