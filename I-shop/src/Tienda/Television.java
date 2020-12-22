package Tienda;

public class Television extends Producto {
	
	private String tipo;
	private String formaPantalla;
	private double pulgadas;
	private boolean smartTV;
	
	
	public Television(String nombre, String codigo, String marca, double precio, String descripcion, String categoria,
			String rutaFoto, String tipo, String formaPantalla, double pulgadas, boolean smartTV) {
		super(nombre, marca, precio, descripcion, categoria, rutaFoto);
		this.tipo = tipo;
		this.formaPantalla = formaPantalla;
		this.pulgadas = pulgadas;
		this.smartTV = smartTV;
	}
	
	public Television() {
		super();
		this.tipo = " ";
		this.formaPantalla = " ";
		this.pulgadas = 0.0;
		this.smartTV = false;
	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFormaPantalla() {
		return formaPantalla;
	}

	public void setFormaPantalla(String formaPantalla) {
		this.formaPantalla = formaPantalla;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}

	
	@Override
	public String toString() {
		return "Television [tipo=" + tipo + ", formaPantalla=" + formaPantalla + ", pulgadas=" + pulgadas + ", smartTV="
				+ smartTV + "]";
	}
}