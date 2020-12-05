package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

public class VentanaAudio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAudio window = new VentanaAudio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaAudio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ishop");
		frame.getContentPane().setLayout(null);
		
		JLabel lblSeccion = new JLabel("Audio");
		lblSeccion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSeccion.setBounds(57, 37, 77, 22);
		frame.getContentPane().add(lblSeccion);
		
		
		JLabel lblImagen1 = new JLabel("New label");
		lblImagen1.setBounds(49, 103, 189, 130);
		frame.getContentPane().add(lblImagen1);
		
		ImageIcon ico1= new ImageIcon("img/1.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_SMOOTH));
        lblImagen1.setIcon(img1);
		
		JLabel lblImagen2 = new JLabel("New label");
		lblImagen2.setBounds(287, 108, 151, 121);
		frame.getContentPane().add(lblImagen2);
		
		ImageIcon ico2= new ImageIcon("img/mars-gaming-msx-altavoces-21-35w.jpg");
        ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_SMOOTH));
        lblImagen2.setIcon(img2);
		
		JLabel lblNombre1 = new JLabel("<html>Logitech G432 Auriculares Gaming 7.1<html>");
		lblNombre1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre1.setBounds(52, 244, 172, 48);
		frame.getContentPane().add(lblNombre1);
		
		JLabel lblNombre2 = new JLabel("<html>Mars Gaming MSX Altavoz<html>");
		lblNombre2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre2.setBounds(287, 234, 151, 52);
		frame.getContentPane().add(lblNombre2);
		
		JLabel lblPrecio1 = new JLabel("45,99 eur");
		lblPrecio1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPrecio1.setBounds(52, 322, 112, 16);
		frame.getContentPane().add(lblPrecio1);
		
		JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.setBounds(52, 370, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito);
		
		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblPrecio2 = new JLabel("15,90 eur");
		lblPrecio2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPrecio2.setBounds(287, 322, 85, 16);
		frame.getContentPane().add(lblPrecio2);
		
		JButton btnAnadirAlCarrito_1 = new JButton("Agregar al carrito");
		btnAnadirAlCarrito_1.setForeground(Color.WHITE);
		btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_1.setBounds(287, 370, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_1);
		
		btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblImagen3 = new JLabel("New label");
		lblImagen3.setBounds(49, 457, 157, 148);
		frame.getContentPane().add(lblImagen3);
		
		ImageIcon ico3= new ImageIcon("img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg");
        ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblImagen3.getWidth(), lblImagen3.getHeight(), Image.SCALE_SMOOTH));
        lblImagen3.setIcon(img3);
		
		JLabel lblNombre3 = new JLabel("<html>Galaxy Buds Live Auriculares Inalambricos Negro<html>");
		lblNombre3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre3.setBounds(57, 625, 172, 43);
		frame.getContentPane().add(lblNombre3);
		
		JLabel lblPrecio3 = new JLabel("134,99 eur");
		lblPrecio3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio3.setBounds(57, 713, 105, 16);
		frame.getContentPane().add(lblPrecio3);
		
		JButton btnAnadirAlCarrito_2 = new JButton("Agregar al carrito");
		btnAnadirAlCarrito_2.setForeground(Color.WHITE);
		btnAnadirAlCarrito_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_2.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_2.setBounds(46, 753, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_2);
		
		btnAnadirAlCarrito_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JButton btnAnadirAlCarrito_3 = new JButton("Agregar al carrito");
		btnAnadirAlCarrito_3.setForeground(Color.WHITE);
		btnAnadirAlCarrito_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_3.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_3.setBounds(281, 753, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_3);
		
		btnAnadirAlCarrito_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblImagen4 = new JLabel("New label");
		lblImagen4.setBounds(287, 462, 172, 139);
		frame.getContentPane().add(lblImagen4);
		
		ImageIcon ico4 = new ImageIcon("img/altavoz.jpg");
        ImageIcon img4 = new ImageIcon(ico4.getImage().getScaledInstance(lblImagen4.getWidth(), lblImagen4.getHeight(), Image.SCALE_SMOOTH));
        lblImagen4.setIcon(img4);
		
		JLabel lblNombre4 = new JLabel("<html>Logitech Speaker System Z313 Altavoces 2.1<html>");
		lblNombre4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre4.setBounds(287, 622, 189, 48);
		frame.getContentPane().add(lblNombre4);
		
		JLabel lblPrecio4 = new JLabel("49,99 eur");
		lblPrecio4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio4.setBounds(287, 713, 105, 16);
		frame.getContentPane().add(lblPrecio4);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(559, 66, 15, 874);
		frame.getContentPane().add(scrollBar);
		
		JButton btnFav = new JButton("Fav");
		btnFav.setBounds(192, 369, 53, 44);
		frame.getContentPane().add(btnFav);
		
		btnFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
		
		
		
		JButton btnFav3 = new JButton("Fav");
		btnFav3.setBounds(427, 370, 53, 43);
		frame.getContentPane().add(btnFav3);
		
		btnFav3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
		
		JButton btnFav4 = new JButton("Fav");
		btnFav4.setBounds(421, 753, 53, 43);
		frame.getContentPane().add(btnFav4);
		
		btnFav4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
		
		JButton btnFav2 = new JButton("Fav");
		btnFav2.setBounds(186, 753, 53, 43);
		frame.getContentPane().add(btnFav2);
	
		
		btnFav2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 99, 22);
		frame.getContentPane().add(menuBar);
		
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
	
	
		

	}
}
