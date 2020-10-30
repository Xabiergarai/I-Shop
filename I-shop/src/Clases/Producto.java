package Clases;

public class Producto {
	
	private String nombre;
	private String codigo;
	private String atributos;
	private double precio;
	
	
	public Producto(String nombre, String codigo, String atributos, double precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.atributos = atributos;
		this.precio = precio;
	}
	
	
	public Producto() {
		super();
		this.nombre = " ";
		this.codigo = " ";
		this.atributos = " ";
		this.precio = 0.0;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getAtributos() {
		return atributos;
	}


	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", atributos=" + atributos + ", precio=" + precio
				+ "]";
	}
	
	
	
	
	
	

}
