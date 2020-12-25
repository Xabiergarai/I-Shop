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
	
	@Test
	public void testGetPulgadas() {
		Smartphone s = new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		assertEquals(6.06, s.getPulgadas());		
	}
	@Test
	public void testGetNfc() {
		Smartphone s = new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		assertEquals(true, s.isNfc());		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Smartphone("","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",0.0,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",0.0,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,false);
		
		new Smartphone(null,"Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR",null,515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",0.0,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,null,"Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished",null,"img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone",null,"ios11",6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg",null,6.06,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",0.0,true);
		new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,false);
			
		
	
	}
	
	public void testEquals() {
		ArrayList<Smartphone> s = new ArrayList<>();
		Smartphone sameSmartphone = new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		assertTrue(s.equals(sameSmartphone));
		
		Smartphone differentSmartphone = new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		assertTrue(s.equals(differentSmartphone));
		
		differentSmartphone = new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true);
		assertTrue(s.equals(differentSmartphone));

	}
	
	public void testAddSmartphone() throws GroupException {
		ArrayList<Smartphone> s = new ArrayList<>();
		s.add(new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true));
		assertEquals(1, s.size());
		
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddSmartphoneErrors() throws GroupException {
		ArrayList<Smartphone> s = new ArrayList<>();
		s.add(new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true));
		assertEquals(1, s.size());
		
	   expected.expect(GroupException.class);
	   s.add(new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true));
	   assertEquals(2, s.size());
	   
	   expected.expect(NullPointerException.class);
	   s.add(null);
	   assertEquals(1, s.size());
	}
	
	public void testRemoveSmartphone() throws GroupException {
		ArrayList<Smartphone> s = new ArrayList<>();
		
		 s.add(new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true));
		 assertEquals(1, s.size());
		 
		 s.add(new Smartphone("iPhone XR","Apple",515.99,"Apple iPhone XR 128GB Negro Libre Refurbished","Smartphone","img/iphonexr-black-pureangles-us-en-screen1.jpg","ios11",6.06,true));
		 assertEquals(0, s.size());
			
		}
	
	}





