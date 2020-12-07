package ventanasPrincipales;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PanelProducto extends JPanel {
	
	private JFrame frame;

	/**
	 * Create the panel.
	 */
	
	
	public PanelProducto(String Seccion, String Ruta, String Nombre, Double Precio) {
		this.setSize(300, 300);
		this.setLayout(new GridLayout(0,1));
		JLabel lblSeccion = new JLabel("Audio");
		lblSeccion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSeccion.setBounds(57, 37, 77, 22);
		add(lblSeccion);
		
		JLabel lblNombre = new JLabel("<html>Logitech G432 Auriculares Gaming 7.1<html>");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(52, 244, 172, 48);
		add(lblNombre);
		
		
		JLabel lblPrecio = new JLabel("45,99 eur");
		lblPrecio.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPrecio.setBounds(52, 322, 112, 16);
		add(lblPrecio);
		
		JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.setBounds(52, 370, 139, 43);
		add(btnAnadirAlCarrito);
		
		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
	
		

		JButton btnFav = new JButton("Fav");
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.setBounds(186, 354, 53, 43);
		add(btnFav);
		
		 btnFav.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaFavoritos.main(null);
					frame.dispose();
				}
			});
		
	
        JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 99, 22);
		add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Categorias");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Audio");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAudio.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ordenador");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOrdenador.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("SmartPhone");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSmartphone.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
	
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Television");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTelevision.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("MENU");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu.main(null);
				frame.dispose();
			}
		});	
		mnNewMenu.add(mntmNewMenuItem_4);
		
	}
	}
	
