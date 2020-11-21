import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSmartphone {

	@Test
	 public void testGetsistemaOperativo() {
		Smartphone s = new Smartphone("iOS 11","4,7","NFC con modo de lectura");
		assertEquals("iOS 11", s.getsistemaOperativo());

	@Test
    public void testGetPulgadas() {
		Smartphone s = new Smartphone("iOS 11","4,7","NFC con modo de lectura");
		assertEquals("4,7", s.getpulgadas());
			
	@Test
    public void testGetNfc() {
		Smartphone s = new Smartphone("iOS 11","4,7","NFC con modo de lectura");
		assertEquals("NFC con modo de lectura", s.getnfc());
	
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}


/*private String sistemaOperativo;
private int pulgadas;
private boolean nfc;
