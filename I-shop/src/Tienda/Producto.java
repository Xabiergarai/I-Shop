package Tienda;

public class Producto {
	
	private String nombre;
	private String codigo;
	private String marca;
	private double precio;
	private String descripcion;
	private String categoria;
	
	public Producto(String nombre, String codigo, String marca, double precio,
		   String descripcion, String categoria) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.marca = marca;
		this.precio = precio;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}
	
	public Producto() {
		super();
		this.nombre = "";
		this.codigo = "";
		this.marca = "";
		this.precio = 0.0;
		this.descripcion = "";
		this.categoria = "";
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", marca=" + marca + ", precio=" + precio
				+ ", descripcion=" + descripcion + ", categoria=" + categoria + "]";
	}
	

}
