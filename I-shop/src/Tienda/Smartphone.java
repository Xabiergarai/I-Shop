package Tienda;

public class Smartphone extends Producto {
	
	private String sistemaOperativo;
	private double pulgadas;
	private boolean nfc;
	
	
	public Smartphone(String nombre, String codigo, String marca, double precio, String descripcion, String categoria,
			String rutaFoto, String sistemaOperativo, double pulgadas, boolean nfc) {
		super(nombre, marca, precio, descripcion, categoria, rutaFoto);
		this.sistemaOperativo = sistemaOperativo;
		this.pulgadas = pulgadas;
		this.nfc = nfc;
	}
	
	public Smartphone() {
		super();
		this.sistemaOperativo = " ";
		this.pulgadas = 0.0;
		this.nfc = false;
	}

	
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
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