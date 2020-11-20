package Tienda;

public class Ordenador extends Producto {
	
	private String ram;
	private int pulgadas;
	private boolean portatil;
	
	
	public Ordenador(String nombre, String codigo, String marca, double precio, String descripcion, String categoria,
			String ram, int pulgadas, boolean portatil) {
		super(nombre, codigo, marca, precio, descripcion, categoria);
		this.ram = ram;
		this.pulgadas = pulgadas;
		this.portatil = portatil;
	}
	
	public Ordenador() {
		super();
		this.ram = "";
		this.pulgadas = 0;
		this.portatil = false;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isPortatil() {
		return portatil;
	}

	public void setPortatil(boolean portatil) {
		this.portatil = portatil;
	}

	@Override
	public String toString() {
		return "Ordenador [ram=" + ram + ", pulgadas=" + pulgadas + ", portatil=" + portatil + "]";
	}
}
