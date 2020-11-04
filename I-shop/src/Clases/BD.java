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
}
