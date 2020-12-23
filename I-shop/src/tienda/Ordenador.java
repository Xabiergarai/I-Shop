package tienda;

public class Ordenador extends Producto {
	
	private String ram;
	private double pulgadas;
	private boolean portatil;
	
	
	public Ordenador(String nombre, String codigo, String marca, double precio, String descripcion, String categoria,
			String rutaFoto, String ram, double pulgadas, boolean portatil) {
		super(nombre, marca, precio, descripcion, categoria, rutaFoto);
		this.ram = ram;
		this.pulgadas = pulgadas;
		this.portatil = portatil;
	}
	
	public Ordenador() {
		super();
		this.ram = " ";
		this.pulgadas = 0.0;
		this.portatil = false;
	}

	
	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
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