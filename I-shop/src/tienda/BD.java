package tienda;

import java.sql.*;

public class BD {
	
	/**
	 * Inicializa una BD SQLITE y devuelve un conexion con ella
	 * @param nombreBD Nombre del fichero de la base de datos 
	 * @return Conexion con la base de datos indicada. Si hay agun error devuelve null
	 */
	
	public static Connection initBD( String nombreBD ) {
		try {
		    Class.forName("org.sqlite.JDBC");
		    Connection con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD );
		    System.out.println("OK");
		    return con;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error");
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

			return statement;
		} catch (SQLException e) {
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
		} catch (SQLException e) {
		}
	}
	public static void crearLaBD() {
		Connection con = initBD("proyecto.db");
		cerrarBD(con,usarCrearTablasBD(con));
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return existe;
	}
	
	/**
	 * 
	 * @param email Correo insertado por el usuario
	 * @param con Contrase�a insertada por el usuario
	 * @return 0 - Si el usuario no est� registrado
	 *         1 - Si el email es correcto pero la contrase�a no
	 *         2 - Si el email es correcto y la contrase�a tambi�n 
	 */
	public static int comprobarUsuario(String email, String con) {
		int resul = 0;
		String s = "SELECT * FROM Usuario WHERE email = '"+email+"'";
		
		Connection c = initBD("proyecto.db");
		try {
			Statement st = c.createStatement();
			//Una select SIEMPRE devuelve un ResultSet
			ResultSet rs = st.executeQuery(s);
			if(rs.next()) { //Si hemos encontrado el usuario cuyo email coincide con el recibido por par�metro
				String contrasenia = rs.getString("con");
				if(contrasenia.equals(con))
					resul = 2;
				else
					resul = 1;
			}
			cerrarBD(c, st);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}