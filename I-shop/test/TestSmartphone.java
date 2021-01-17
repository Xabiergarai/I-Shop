import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import tienda.*;


class TestSmartphone extends GroupException{

	@Test
	public void testGetSistemaOperativ() {
		Smartphone s = new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		assertEquals("ios11", s.getSistemaOperativo());		
	}
	
	/*@Test
	public void testGetPulgadas() {
		Smartphone s = new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		assertEquals(6.06, s.getPulgadas());		
	}*/
	@Test
	public void testGetNfc() {
		Smartphone s = new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		assertEquals(true, s.isNfc());		
	}
}
	