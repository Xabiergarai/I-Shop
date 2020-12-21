import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import Tienda.*;
class TestSmartphone {

	@Test
	 public void testGetsistemaOperativo() {
		Smartphone s = new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		assertEquals("iOS 11", s.getSistemaOperativo());
		
	}

	@Test
    public void testGetPulgadas() {
		Smartphone s = new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		assertEquals(4,7, s.getPulgadas());
		
	}
			
	@Test
    public void testGetNfc() {
		Smartphone s = new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		assertEquals(true, s.isNfc());
		
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented");
		
	}
	
	public void testInvalidArguments() {
		expected.expect(IllegalArgumentException.class);
		new Smartphone("","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",0.0,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",0.0,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,false);
		
		new Smartphone(null,"I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12",null,"Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012",null,907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",0.0,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,null,"Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre",null,"img/smartphone.png","iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone",null,"iOS 11",4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png",null,4.7,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",0.0,true);
		new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,false);
		
		
	}
	
	public void testEquals() {
		Smartphone sameSmartphone = new Smartphone();
		assertTrue(s.equals(sameSmartphone));
		
		Smartphone differentSmartphone = new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		assertFalse(s.equals(differentSmartphone));
		
		differentSmartphone = new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		assertFalse(s.equals(differentSmartphone));

	}
	
	public void testAddSmartphone() throws GroupException {
		s.addSmartphone(new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		assertEquals(1, s.size());
	}
	
	public ExpectedException expected = ExpectedException.none();
	
	public void testAddSmartphoneErrors() throws GroupException {
		s.addSmartphone(new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true);
		assertEquals(1, s.size());
		
	   expected.expect(GroupException.class);
	   s.addSmartphone(new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true));
	   assertEquals(2, s.size());
	   
	   expected.expect(NullPointerException.class);
	   s.addSmartphone(null);
	   assertEquals(1, s.size());
	}
	
	public void testRemoveSmartphone() throws GroupException {
		s.addSmartphone(new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true));
		assertEquals(1, s.size());
		
		s.removeSmartphone(new Smartphone("Iphone12","I012","Apple",907.99,"Apple iPhone 12 64GB Negro Libre","Smarthpone","img/smartphone.png","iOS 11",4.7,true));
		assertEquals(0, s.size());
			
		}
}




