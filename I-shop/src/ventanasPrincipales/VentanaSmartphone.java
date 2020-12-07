package ventanasPrincipales;

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

public class VentanaSmartphone {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSmartphone window = new VentanaSmartphone();
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
	public VentanaSmartphone() {
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
		
		JLabel lblSeccion = new JLabel("");
		lblSeccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeccion.setBounds(52, 27, 108, 27);
		frame.getContentPane().add(lblSeccion);
		
		JLabel lblImagen1 = new JLabel("New label");
		lblImagen1.setBounds(85, 100, 129, 151);
		frame.getContentPane().add(lblImagen1);
		
		ImageIcon ico1= new ImageIcon("img/iphonexr-black-pureangles-us-en-screen1.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_SMOOTH));
        lblImagen1.setIcon(img1);
		
		JLabel lblNombre1 = new JLabel("<html>Apple iPhone XR 64GB Negro Libre<html>");
		lblNombre1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre1.setBounds(36, 309, 195, 16);
		frame.getContentPane().add(lblNombre1);
		
		JLabel Precio1 = new JLabel("630,99 eur");
		Precio1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Precio1.setBounds(67, 371, 93, 16);
		frame.getContentPane().add(Precio1);
		
		JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.setBounds(67, 428, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito);
		
		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		
		JButton btnAnadirAlCarrito_1 = new JButton("Agregar al carrito");
		btnAnadirAlCarrito_1.setForeground(Color.WHITE);
		btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_1.setBounds(323, 428, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_1);
		
		btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblNombre2 = new JLabel("<html>Samsung Galaxy M31 Negro Libre<html>");
		lblNombre2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre2.setBounds(300, 309, 204, 16);
		frame.getContentPane().add(lblNombre2);
		
		JLabel lblPrecio2 = new JLabel("199 eur");
		lblPrecio2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio2.setBounds(323, 371, 85, 16);
		frame.getContentPane().add(lblPrecio2);
		
		JLabel lblImagen2 = new JLabel("New label");
		lblImagen2.setBounds(333, 100, 129, 151);
		frame.getContentPane().add(lblImagen2);
		
		ImageIcon ico2= new ImageIcon("img/samsung-galaxy-m31-6-64gb-negro-libre-comprar.jpg");
        ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_SMOOTH));
        lblImagen2.setIcon(img2);
        
        JLabel lblImagen3 = new JLabel("New label");
        lblImagen3.setBounds(67, 510, 139, 123);
        frame.getContentPane().add(lblImagen3);
        
        ImageIcon ico3= new ImageIcon("img/movil 4.jpg");
        ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblImagen3.getWidth(), lblImagen3.getHeight(), Image.SCALE_SMOOTH));
        lblImagen3.setIcon(img3);
        
        JLabel lblNombre3 = new JLabel("<html>Samsung Galaxy Tab A 10.1\" 2019 32GB Wifi Plata<html>");
        lblNombre3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNombre3.setBounds(67, 645, 139, 16);
        frame.getContentPane().add(lblNombre3);
        
        JLabel lblPrecio3 = new JLabel("169 eur");
        lblPrecio3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPrecio3.setBounds(67, 694, 93, 16);
        frame.getContentPane().add(lblPrecio3);
        
        JButton btnAnadirAlCarrito_2 = new JButton("Agregar al carrito");
        btnAnadirAlCarrito_2.setForeground(Color.WHITE);
        btnAnadirAlCarrito_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_2.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_2.setBounds(62, 737, 139, 43);
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
        btnAnadirAlCarrito_3.setBounds(318, 737, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito_3);
        
        btnAnadirAlCarrito_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblImagen4 = new JLabel("New label");
        lblImagen4.setBounds(328, 510, 134, 123);
        frame.getContentPane().add(lblImagen4);
        
        ImageIcon ico4= new ImageIcon("img/movil3.jpg");
        ImageIcon img4= new ImageIcon(ico4.getImage().getScaledInstance(lblImagen4.getWidth(), lblImagen4.getHeight(), Image.SCALE_SMOOTH));
        lblImagen4.setIcon(img4);
        
        
        JLabel lblNombre4 = new JLabel("Realme 6 4/64GB Comet Blue Libre");
        lblNombre4.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNombre4.setBounds(323, 645, 194, 16);
        frame.getContentPane().add(lblNombre4);
        
        JLabel lblPrecio4 = new JLabel("169 eur");
        lblPrecio4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPrecio4.setBounds(323, 694, 78, 16);
        frame.getContentPane().add(lblPrecio4);
        
        JButton btnFav = new JButton("Fav");
        btnFav.setBounds(207, 428, 53, 43);
        frame.getContentPane().add(btnFav);
        
        btnFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav3 = new JButton("Fav");
        btnFav3.setBounds(464, 428, 53, 43);
        frame.getContentPane().add(btnFav3);
        
        btnFav3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        
        JButton btnFav2 = new JButton("Fav");
        btnFav2.setBounds(202, 737, 53, 43);
        frame.getContentPane().add(btnFav2);
        
        btnFav2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav4 = new JButton("Fav");
        btnFav4.setBounds(459, 737, 53, 43);
        frame.getContentPane().add(btnFav4);
        
		
        btnFav4.addActionListener(new ActionListener() {
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
	
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Television");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTelevision.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JLabel lblNewLabel_1 = new JLabel("Smartphones");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(202, 35, 178, 43);
		frame.getContentPane().add(lblNewLabel_1);

	
	}
}
