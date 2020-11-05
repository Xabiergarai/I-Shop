package Tienda;

public class Usuario {

	private String nomUsuario;
	private String contrasenya;
	private String email;
	private String nombre;
	private String apellidos;

	public Usuario(String nomUsuario, String contrasenya, String email, String nombre, String apellidos) {
		super();
		this.nomUsuario = nomUsuario;
		this.contrasenya = contrasenya;
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public Usuario() {
		super();
		this.nomUsuario = "";
		this.contrasenya = "";
		this.email = "";
		this.nombre = "";
		this.apellidos = "";
	}
	
	
	public String getNomUsuario() {
		return nomUsuario;
	}
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return "Usuario [nomUsuario=" + nomUsuario + ", contrasenya=" + contrasenya + ", email=" + email + ", nombre="
				+ nombre + ", apellidos=" + apellidos + "]";
	}
	
	
	
}
