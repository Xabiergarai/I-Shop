package tienda;

import java.io.Serializable;

public class Producto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String marca;
	private double precio;
	private String descripcion;
	private String categoria;
	private String rutaFoto;
	
	
	public Producto(String nombre, String marca, double precio, String descripcion, String categoria,
			String rutaFoto) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.rutaFoto = rutaFoto;
	}
	

	public Producto() {
		super();
		this.nombre = "";
		this.marca = "";
		this.precio = 0.0;
		this.descripcion = "";
		this.categoria = "";
		this.rutaFoto = "" ;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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


	public String getRutaFoto() {
		return rutaFoto;
	}


	public void setRutaFoto(String rutaFoto) {
		this.rutaFoto = rutaFoto;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", rutaFoto=" + rutaFoto + "]";
	}

	
	}