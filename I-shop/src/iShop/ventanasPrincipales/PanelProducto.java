package iShop.ventanasPrincipales;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelProducto extends JPanel {

	/**
	 * Create the panel.
	 */
	
	
	public PanelProducto(String Seccion, String Ruta, String Nombre, Double Precio) {
		
		
		JLabel lblSeccion = new JLabel("Audio");
		lblSeccion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSeccion.setBounds(57, 37, 77, 22);
		/*frame.getContentPane().add(lblSeccion);*/
		
		JLabel lblImagen4 = new JLabel("New label");
		lblImagen4.setBounds(287, 462, 172, 139);
		/*frame.getContentPane().add(lblImagen4);*/
		
		ImageIcon ico4 = new ImageIcon("img/altavoz.jpg");
        ImageIcon img4 = new ImageIcon(ico4.getImage().getScaledInstance(lblImagen4.getWidth(), lblImagen4.getHeight(), Image.SCALE_SMOOTH));
        lblImagen4.setIcon(img4);
		
		JLabel lblNombre = new JLabel("<html>Logitech G432 Auriculares Gaming 7.1<html>");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(52, 244, 172, 48);
		/*frame.getContentPane().add(lblRuta);*/
		
		
		JLabel lblPrecio = new JLabel("45,99 eur");
		lblPrecio.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPrecio.setBounds(52, 322, 112, 16);
		/*frame.getContentPane().add(lblPrecio);*/
		
		JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.setBounds(52, 370, 139, 43);
		/*frame.getContentPane().add(btnAnadirAlCarrito)*/
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(85, 100, 129, 151);
		/*frame.getContentPane().add(lblNewLabel_1);*/
		
		ImageIcon ico1= new ImageIcon("img/iphonexr-black-pureangles-us-en-screen1.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_1.setIcon(img1);
		

	}
	
	

}
