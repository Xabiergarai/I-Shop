package Tienda;

public class Audio extends Producto {
	
	private String entrada;
	private int potencia;
    private boolean bluetooth;
	public Audio(String nombre, String codigo, String marca, double precio, String descripcion, String categoria,
			String rutaFoto, String entrada, int potencia, boolean bluetooth) {
		super(nombre, codigo, marca, precio, descripcion, categoria, rutaFoto);
		this.entrada = entrada;
		this.potencia = potencia;
		this.bluetooth = bluetooth;
	}
	
	
	public Audio() {
		super();
		this.entrada = " ";
		this.potencia = 0;
		this.bluetooth = false;
	}
	
	
	public String getEntrada() {
		return entrada;
	}
	
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public boolean isBluetooth() {
		return bluetooth;
	}
	
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	
	@Override
	public String toString() {
		return "Audio [entrada=" + entrada + ", potencia=" + potencia + ", bluetooth=" + bluetooth + "]";
	}
}