package dataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import tienda.Audio;
import tienda.Ordenador;
import tienda.Producto;
import tienda.Smartphone;
import tienda.Television;
import tienda.Usuario;

public class BD {
	
	
	private static final Logger LOG = Logger.getLogger(BD.class.getName());
	
	
	/**
	 * Inicializa una BD SQLITE y devuelve un conexion con ella
	 * @param nombreBD Nombre del fichero de la base de datos 
	 * @return Conexion con la base de datos indicada. Si hay agun error devuelve null
	 */
	
	public static Connection initBD( String nombreBD ) {
		try {
		    Class.forName("org.sqlite.JDBC");
		    Connection con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD );
		    LOG.log(Level.INFO,"Conexion exitosa");
		    return con;
		} catch (ClassNotFoundException | SQLException e) {
			LOG.log(Level.WARNING,e.getMessage());
			return null;
		}
	}
	
	/** Crea las tablas de la base de datos. Si ya existen, las deja tal cual. Devuelve un statement para trabajar con esa base de datos
	 * @param con Conexion ya creada y abierta a la base de datos
	 * @return sentencia de trabajo si se crea correctamente, null si hay cualquier error
	 */
	
	public static Statement usarCrearTablasBD( Connection con ) {
		
		//statement.executeUpdate : Cuando queramos hacer create, insert, delete, update, drop
		//statement.executeQuery : Cuando queramos hacer select
		
		try {
			Statement statement = con.createStatement();
			statement.executeUpdate("create table if not exists Usuario "+
						   "(nombre varchar, "+
						   " email varchar, "+
						   " con varchar)");
			LOG.log(Level.INFO,"Tablas creadas correctamente");
			return statement;
			
		} catch (SQLException e) {
			LOG.log(Level.WARNING,e.getMessage());
			return null;
		}
	}
	
	/** Cierra la base de datos abierta
	 * @param con Conexion abierta de la BD
	 * @param st Sentencia abierta de la BD
	 */
	public static void cerrarBD( Connection con, Statement st ) {
		try {
			if (st!=null) st.close();
			if (con!=null) con.close();
		LOG.log(Level.INFO,"Se ha cerrado correctamente");
		} catch (SQLException e) {
		LOG.log(Level.WARNING,e.getMessage());
		}
	}
	public static void crearLaBD() {
		Connection con = initBD("proyecto.db");
		cerrarBD(con,usarCrearTablasBD(con));
		//LOG.log(Level.INFO,"BD creada correctamente");
	}
	public static boolean existeUsuario(String email) {
		//statement.executeUpdate : Cuando queramos hacer create, insert, delete, update, drop
		//statement.executeQuery : Cuando queramos hacer select
		
		
		boolean existe = false;
		
		String sql = "SELECT * FROM Usuario WHERE email ='"+email+"'";
		Connection con = initBD("proyecto.db");
		Statement st;
		try {
			st = con.createStatement(); //Creo el objeto sentencia
			ResultSet rs = st.executeQuery(sql); //Ejecutamos la consulta
			if(rs.next()) { //rs.next() -> Devuelve true si rs tiene datos, false en caso contrario
				existe = true;
			
			}
			cerrarBD(con, st);
			LOG.log(Level.INFO,"Query ejecutado correctamente");
		} catch (SQLException e) {
			LOG.log(Level.WARNING,e.getMessage());
		}
		return existe;
	}
	
	/**
	 * 
	 * @param email Correo insertado por el usuario
	 * @param con Contrasena insertada por el usuario
	 * @return 0 - Si el usuario no esta registrado
	 *         1 - Si el email es correcto pero la contrasenya no
	 *         2 - Si el email es correcto y la contrasenya tambien 
	 */
	public static int comprobarUsuario(String email, String con) {
		int resul = 0;
		String s = "SELECT * FROM Usuario WHERE email = '"+email+"'";
		
		Connection c = initBD("proyecto.db");
		try {
			Statement st = c.createStatement();
			//Una select SIEMPRE devuelve un ResultSet
			ResultSet rs = st.executeQuery(s);
			if(rs.next()) { //Si hemos encontrado el usuario cuyo email coincide con el recibido por parametro
				String contrasenia = rs.getString("con");
				if(contrasenia.equals(con))
					resul = 2;
				else
					resul = 1;
			}
			cerrarBD(c, st);
			LOG.log(Level.INFO,"Query ejecutada correctamente");
		} catch (SQLException e) {
		  LOG.log(Level.WARNING,e.getMessage());
		}
		
		return resul;
		
	}
	
	public static void insertarUsuario(String nombre, String email, String con) {
		
		String s = "INSERT INTO Usuario VALUES('"+nombre+"','"+email+"','"+con+"')";
		Connection c = BD.initBD("proyecto.db");
		try {
			Statement st = c.createStatement();
			st.executeUpdate(s);
			cerrarBD(c, st);
			LOG.log(Level.INFO,"Statement correctamente");
		} catch (SQLException e) {
			LOG.log(Level.WARNING,e.getMessage());
		}
		
	}
	
	public static ArrayList <Ordenador> listarOrdenadores() throws DBException{
	ArrayList <Ordenador> ordenadores = new ArrayList<>();
	Connection con = initBD("proyecto.db");
		
	
		try (Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT nombre,marca,precio,descripcion,ram,pulgadas,portatil,rutafoto FROM ordenador");

			while(rs.next()) {
				Ordenador ordenador = new Ordenador();
				ordenador.setNombre(rs.getString("nombre"));
				ordenador.setMarca(rs.getString("marca"));
				ordenador.setPrecio(rs.getDouble("precio"));
				ordenador.setDescripcion(rs.getString("descripcion"));
				ordenador.setRutaFoto(rs.getString("rutaFoto"));
				ordenador.setRam(rs.getString("ram"));
				ordenador.setPulgadas(rs.getFloat("pulgadas"));
				if (rs.getInt("portatil")== 1) {
					ordenador.setPortatil(true);
				}else {
					ordenador.setPortatil(false);
				}
				ordenadores.add(ordenador);
			}
			
		} catch (SQLException e) {
			throw new DBException("Error obteniendo todos los ordenadores'", e);
		}
	
	return ordenadores;
		
	}
	public static ArrayList <Television> listarTelevisiones() throws DBException{
		ArrayList <Television> televisiones = new ArrayList<>();
		Connection con = initBD("proyecto.db");
			
		
			try (Statement stmt = con.createStatement()) {
				ResultSet rs = stmt.executeQuery("SELECT nombre,marca,precio,descripcion,tipo,pulgadas,formapantalla,rutafoto,smarttv FROM television");

				while(rs.next()) {
					Television television = new Television();
					television.setNombre(rs.getString("nombre"));
					television.setMarca(rs.getString("marca"));
					television.setPrecio(rs.getDouble("precio"));
					television.setDescripcion(rs.getString("descripcion"));
					television.setRutaFoto(rs.getString("rutaFoto"));
					television.setTipo(rs.getString("tipo"));
					television.setFormaPantalla(rs.getString("formapantalla"));
					television.setPulgadas(rs.getDouble("pulgadas"));
					if (rs.getInt("smartTV")== 1) {
						television.setSmartTV(true);
					}else {
						television.setSmartTV(false);
					}
					televisiones.add(television);
				}
				
			} catch (SQLException e) {
				throw new DBException("Error obteniendo todos los televisiones", e);
			}
		
		return televisiones;
			
		}
	public static ArrayList <Audio> listarAudios() throws DBException{
		ArrayList <Audio> audios = new ArrayList<>();
		Connection con = initBD("proyecto.db");
			
		
			try (Statement stmt = con.createStatement()) {
				ResultSet rs = stmt.executeQuery("SELECT nombre,marca,precio,descripcion,entrada,potencia,bluetooth,rutafoto FROM audio");

				while(rs.next()) {
					Audio audio = new Audio();
					audio.setNombre(rs.getString("nombre"));
					audio.setMarca(rs.getString("marca"));
					audio.setPrecio(rs.getDouble("precio"));
					audio.setDescripcion(rs.getString("descripcion"));
					audio.setRutaFoto(rs.getString("rutaFoto"));
					audio.setEntrada(rs.getString("entrada"));
					audio.setPotencia(rs.getInt("potencia"));
					if (rs.getInt("bluetooth")== 1) {
						audio.setBluetooth(true);
					}else {
						audio.setBluetooth(false);
					}
					audios.add(audio);
					
				}
				
			} catch (SQLException e) {
				throw new DBException("Error obteniendo todos los productos de audio", e);
			}
		
		return audios;
			
		}
	public static ArrayList <Smartphone> listarSmartPhones() throws DBException{
		ArrayList <Smartphone> smartphones = new ArrayList<>();
		Connection con = initBD("proyecto.db");
			
		
			try (Statement stmt = con.createStatement()) {
				ResultSet rs = stmt.executeQuery("SELECT nombre,marca,precio,descripcion,sistemaoperativo,pulgadas,nfc,rutafoto FROM smartphone");

				while(rs.next()) {
					Smartphone smartphone = new Smartphone();
					smartphone.setNombre(rs.getString("nombre"));
					smartphone.setMarca(rs.getString("marca"));
					smartphone.setPrecio(rs.getDouble("precio"));
					smartphone.setDescripcion(rs.getString("descripcion"));
					smartphone.setRutaFoto(rs.getString("rutaFoto"));
					smartphone.setSistemaOperativo(rs.getString("sistemaoperativo"));
					smartphone.setPulgadas(rs.getDouble("pulgadas"));
					if (rs.getInt("nfc")== 1) {
						smartphone.setNfc(true);
					}else {
						smartphone.setNfc(false);
					}
					smartphones.add(smartphone);
				}
				
			} catch (SQLException e) {
				throw new DBException("Error obteniendo todos los productos de audio", e);
			}
		
		return smartphones;
			
		}
	
	public static ArrayList <String> listarProductos() throws DBException{
		ArrayList <String> productos = new ArrayList<>();
		Connection con = initBD("proyecto.db");
			
		
			try (Statement stmt = con.createStatement()) {
				ResultSet rs = stmt.executeQuery("SELECT nombre FROM television");

				while(rs.next()) {
					String product = rs.getString("nombre");
					productos.add(product);
				}
				
			} catch (SQLException e) {
				throw new DBException("Error obteniendo todos los televisiones", e);
			}
			
			try (Statement stmt = con.createStatement()) {
				ResultSet rs = stmt.executeQuery("SELECT nombre FROM ordenador");

				while(rs.next()) {
					String product = rs.getString("nombre");
					productos.add(product);
				}
				
			} catch (SQLException e) {
				throw new DBException("Error obteniendo todos los televisiones", e);
			}
			
			try (Statement stmt = con.createStatement()) {
				ResultSet rs = stmt.executeQuery("SELECT nombre FROM smartphone");

				while(rs.next()) {
					String product = rs.getString("nombre");
					productos.add(product);
				}
				
			} catch (SQLException e) {
				throw new DBException("Error obteniendo todos los televisiones", e);
			}
			
			try (Statement stmt = con.createStatement()) {
				ResultSet rs = stmt.executeQuery("SELECT nombre FROM audio");

				while(rs.next()) {
					String product = rs.getString("nombre");
					productos.add(product);
				}
				
			} catch (SQLException e) {
				throw new DBException("Error obteniendo todos los televisiones", e);
			}
		
		return productos;
			
		}
	
	public static void borrarProducto(String p) throws SQLException {
		Connection con = initBD("proyecto.db");
		
			PreparedStatement ps = con.prepareStatement("DELETE FROM ordenador WHERE nombre = ?");
			ps.setString(1, p);
			ps.execute();

			ps = con.prepareStatement("DELETE FROM television WHERE nombre = ?");
			ps.setString(1, p);
			ps.execute();
			
			ps = con.prepareStatement("DELETE FROM audio WHERE nombre = ?");
			ps.setString(1, p);
			ps.execute();

			ps = con.prepareStatement("DELETE FROM smartphone WHERE nombre = ?");
			ps.setString(1, p);
			ps.execute();

	}
	
	public static ArrayList <Usuario> listarUsuarios() throws DBException{
		ArrayList <Usuario> usuarios = new ArrayList<>();
		Connection con = initBD("proyecto.db");
		

		try (Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT nombre,email,con FROM usuario");

			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setNombre(rs.getString("nombre"));
				usuario.setEmail(rs.getString("email"));
				usuario.setContrasenya(rs.getString("con"));
				usuarios.add(usuario);
			}
			
		} catch (SQLException e) {
			throw new DBException("Error obteniendo los usuarios", e);
		}
	
	return usuarios;
		
	}
	
	
	public static void borrarUsuario(Usuario u) throws SQLException {
		Connection con = initBD("proyecto.db");
		
			PreparedStatement ps = con.prepareStatement("DELETE FROM usuario WHERE email = ?");
			ps.setString(1, u.getEmail());
			ps.execute();

	}
	
	public static void insertarOrdenador(String nombre, String marca, String precio, String desc) {

        String s = "INSERT INTO Ordeandor (nombre, marca, precio) VALUES('"+nombre+"','"+marca+"','"+precio+"')";
        Connection c = BD.initBD("proyecto.db");
        try {
            Statement st = c.createStatement();
            st.executeUpdate(s);
            cerrarBD(c, st);
            LOG.log(Level.INFO,"Statement correctamente");
        } catch (SQLException e) {
            LOG.log(Level.WARNING,e.getMessage());
        }

    }
	public static void insertarSmartphone(String nombre, String marca, String precio, String desc) {
	
	    String s = "INSERT INTO Smartphone (nombre, marca, precio) VALUES('"+nombre+"','"+marca+"','"+precio+"')";
	    Connection c = BD.initBD("proyecto.db");
	    try {
	        Statement st = c.createStatement();
	        st.executeUpdate(s);
	        cerrarBD(c, st);
	        LOG.log(Level.INFO,"Statement correctamente");
	    } catch (SQLException e) {
	        LOG.log(Level.WARNING,e.getMessage());
	    }
	
	}

	public static void insertarAudio(String nombre, String marca, String precio, String desc) {
	
	    String s = "INSERT INTO Audio (nombre, marca, precio) VALUES('"+nombre+"','"+marca+"','"+precio+"')";
	    Connection c = BD.initBD("proyecto.db");
	    try {
	        Statement st = c.createStatement();
	        st.executeUpdate(s);
	        cerrarBD(c, st);
	        LOG.log(Level.INFO,"Statement correctamente");
	    } catch (SQLException e) {
	        LOG.log(Level.WARNING,e.getMessage());
	    }
	
	}

	public static void insertarTelevisor(String nombre, String marca, String precio, String desc) {
	
	    String s = "INSERT INTO Television (nombre, marca, precio) VALUES('"+nombre+"','"+marca+"','"+precio+"')";
	    Connection c = BD.initBD("proyecto.db");
	    try {
	        Statement st = c.createStatement();
	        st.executeUpdate(s);
	        cerrarBD(c, st);
	        LOG.log(Level.INFO,"Statement correctamente");
	    } catch (SQLException e) {
	        LOG.log(Level.WARNING,e.getMessage());
	    }
	
	}

}