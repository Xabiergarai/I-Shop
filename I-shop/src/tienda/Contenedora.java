package tienda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Contenedora {
	/**
	 * Lista con toda la informaci�n de los art�culos
	 */
	public ArrayList<Producto> listaProductos;
	public ArrayList<Producto> carrito;
	
	public Contenedora() {
		listaProductos = new ArrayList<Producto>();
		carrito = new ArrayList<Producto>();
		
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public ArrayList<Producto> getCarrito() {
		return carrito;
	}

	public void setCarrito(ArrayList<Producto> carrito) {
		this.carrito = carrito;
	}
	
	public void vaciarCarrito() {
		for(int i=0;i<carrito.size();i++)
			carrito.remove(i);
	}	
	
	/**
	 * M�todo que guarda el contenido del carrito en un fichero de texto para generar la factura
	 */
	public void guardarCarritoEnFicheroDeTexto(String nombreUsuario) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha = new Date(System.currentTimeMillis()); //fecha actual
		String nomfich = nombreUsuario+ " " +sdf.format(fecha)+".txt";
		PrintWriter pw=null;
		try {
			pw = new PrintWriter(new FileWriter(nomfich,true)); //true = abrir el fichero en modo append(que no te borre lo q ya esta en el fichero)
			for(Producto p : carrito) {
				pw.println(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pw!=null) {
				pw.flush(); //vaciar flujo de salida
				pw.close();
			}
		}
	}
	
	/**
	 * M�todo que a�ade un articulo al carrito
	 */
	public void aniadirProductoAlCarrito(Producto p) {
		carrito.add(p);
	}
	
	/**
	 * M�todo que carga la informaci�n del fichero PELICULAS.DAT en un ArrayList
	 */
	public void cargarFicheroProductos() {
		try {
			FileInputStream fis = new FileInputStream("PRODUCTOS.DAT");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object p = ois.readObject();
			while(p!=null) {
				if(p instanceof Audio) {
					Audio a = (Audio)p;
					listaProductos.add(a);
				} else if(p instanceof Ordenador) {
					Ordenador o = (Ordenador)p;
					listaProductos.add(o);
				} else if(p instanceof Smartphone) {
					Smartphone s = (Smartphone)p;
					listaProductos.add(s);
				} else if(p instanceof Television) {
					Television t = (Television)p;
					listaProductos.add(t);
				}
				p = ois.readObject(); //lea siguiente objeto
			}
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * M�todo que actualiza el contenido del fichero con la informaci�n del ArrayList
	 */
	public void guardarListaProductosEnFichero() {

		try {
			FileOutputStream fos = new FileOutputStream("PRODUCTOS.DAT");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(Producto p: listaProductos)
				oos.writeObject(p);
			oos.writeObject(null);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}	
}