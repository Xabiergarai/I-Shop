package Clases;

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
		    return con;
		} catch (ClassNotFoundException | SQLException e) {
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
			statement.executeUpdate("create table Usuario "+
						   "(correo string, "+
						   " con string)");

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
	
	public static boolean existeUsuario(String correo) {
		//statement.executeUpdate : Cuando queramos hacer create, insert, delete, update, drop
		//statement.executeQuery : Cuando queramos hacer select
		
		
		boolean existe = false;
		
		String sql = "SELECT * FROM Usuario WHERE correo ='"+correo+"'";
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
	 * @param nick Nick insertado por el usuario
	 * @param con Contraseña insertada por el usuario
	 * @return 0 - Si el usuario no está registrado
	 *         1 - Si el nick es correcto pero la contraseña no
	 *         2 - Si el nick es correcto y la contraseña también 
	 */
	public static int comprobarUsuario(String correo, String con) {
		int resul = 0;
		String s = "SELECT * FROM Usuario WHERE correo = '"+correo+"'";
		
		Connection c = initBD("proyecto.db");
		try {
			Statement st = c.createStatement();
			//Una select SIEMPRE devuelve un ResultSet
			ResultSet rs = st.executeQuery(s);
			if(rs.next()) { //Si hemos encontrado el usuario cuyo correo coincide con el recibido por parámetro
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
	
	public static void insertarUsuario(String correo, String con) {
		
		String s = "INSERT INTO Usuario VALUES('"+correo+"','"+con+"')";
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
