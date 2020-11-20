package Tienda;

public class Smartphone extends Producto {
	
	private String sistemaOperativo;
	private int pulgadas;
	private boolean nfc;
	
	
	public Smartphone(String nombre, String codigo, String marca, double precio, String descripcion, String categoria,
			String sistemaOperativo, int pulgadas, boolean nfc) {
		super(nombre, codigo, marca, precio, descripcion, categoria);
		this.sistemaOperativo = sistemaOperativo;
		this.pulgadas = pulgadas;
		this.nfc = nfc;
	}
	
	public Smartphone() {
		super();
		this.sistemaOperativo = "";
		this.pulgadas = 0;
		this.nfc = false;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isNfc() {
		return nfc;
	}

	public void setNfc(boolean nfc) {
		this.nfc = nfc;
	}

	@Override
	public String toString() {
		return "Smartphone [sistemaOperativo=" + sistemaOperativo + ", pulgadas=" + pulgadas + ", nfc=" + nfc + "]";
	}
}
