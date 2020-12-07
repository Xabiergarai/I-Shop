package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class VentanaTelevision {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTelevision window = new VentanaTelevision();
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
	public VentanaTelevision() {
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
		
		JLabel lblImagen1 = new JLabel("New label");
		lblImagen1.setBounds(65, 123, 174, 116);
		frame.getContentPane().add(lblImagen1);
		
		ImageIcon ico4= new ImageIcon("img/tv1.jpg");
        ImageIcon img4= new ImageIcon(ico4.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_SMOOTH));
        lblImagen1.setIcon(img4);
		
		
		JLabel lblNombre1 = new JLabel("Televisor Sony 65\" LED UltraHD 4K");
		lblNombre1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre1.setBounds(50, 271, 231, 16);
		frame.getContentPane().add(lblNombre1);
		
		JLabel lblPrecio1 = new JLabel("784 eur");
		lblPrecio1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio1.setBounds(91, 306, 76, 16);
		frame.getContentPane().add(lblPrecio1);
		
		JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.setBounds(50, 355, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito);
		
		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JButton btnFav = new JButton("Fav");
		btnFav.setBounds(186, 354, 53, 43);
		frame.getContentPane().add(btnFav);
		
		 btnFav.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaFavoritos.main(null);
					frame.dispose();
				}
			});
		
		JLabel lblImagen2 = new JLabel("New label");
		lblImagen2.setBounds(75, 444, 164, 136);
		frame.getContentPane().add(lblImagen2);
		
		ImageIcon ico1= new ImageIcon("img/tv2.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_SMOOTH));
        lblImagen2.setIcon(img1);

		
		JLabel lblNombre2 = new JLabel("Lenco 10\" TFT HD Televisor Portatil ");
		lblNombre2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre2.setBounds(50, 615, 231, 16);
		frame.getContentPane().add(lblNombre2);
		
		JLabel lblPrecio2 = new JLabel("130,99 eur");
		lblPrecio2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio2.setBounds(91, 649, 113, 16);
		frame.getContentPane().add(lblPrecio2);
		
		JButton btnAnadirAlCarrito_1 = new JButton("Agregar al carrito");
		btnAnadirAlCarrito_1.setForeground(Color.WHITE);
		btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_1.setBounds(50, 692, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_1);
		
		btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JButton btnFav_1 = new JButton("Fav");
		btnFav_1.setBounds(186, 691, 53, 43);
		frame.getContentPane().add(btnFav_1);
		
		 btnFav_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaFavoritos.main(null);
					frame.dispose();
				}
			});
		
		JLabel lblImagen3 = new JLabel("New label");
		lblImagen3.setBounds(367, 117, 139, 128);
		frame.getContentPane().add(lblImagen3);
		
		ImageIcon ico3= new ImageIcon("img/tv3.jpg");
        ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblImagen3.getWidth(), lblImagen3.getHeight(), Image.SCALE_SMOOTH));
        lblImagen3.setIcon(img3);
		
		JLabel lblNombre3 = new JLabel("Televisor LG 49\" LED UltraHD 4K");
		lblNombre3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre3.setBounds(338, 271, 231, 16);
		frame.getContentPane().add(lblNombre3);
		
		JLabel lblPrecio3 = new JLabel("428,99 eur");
		lblPrecio3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio3.setBounds(389, 306, 99, 16);
		frame.getContentPane().add(lblPrecio3);
		
		
		
		JButton btnAnadirAlCarrito_2 = new JButton("Agregar al carrito");
		btnAnadirAlCarrito_2.setForeground(Color.WHITE);
		btnAnadirAlCarrito_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_2.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_2.setBounds(349, 354, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_2);
		
		btnAnadirAlCarrito_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JButton btnFav_2 = new JButton("Fav");
		btnFav_2.setBounds(489, 354, 53, 43);
		frame.getContentPane().add(btnFav_2);
		
		 btnFav_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaFavoritos.main(null);
					frame.dispose();
				}
			});
		
		JLabel lblImagen4 = new JLabel("New label");
		lblImagen4.setBounds(338, 444, 179, 133);
		frame.getContentPane().add(lblImagen4);
		
		ImageIcon ico2= new ImageIcon("img/tv4.jpg");
        ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblImagen4.getWidth(), lblImagen4.getHeight(), Image.SCALE_SMOOTH));
        lblImagen4.setIcon(img2);
		
		JLabel lblNombre4 = new JLabel("Sony Bravia 85\" LED UltraHD 4K");
		lblNombre4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre4.setBounds(338, 615, 231, 16);
		frame.getContentPane().add(lblNombre4);
		
		JLabel lblPrecio4 = new JLabel("1999 eur");
		lblPrecio4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio4.setBounds(389, 649, 84, 16);
		frame.getContentPane().add(lblPrecio4);
		
		JButton btnAnadirAlCarrito_3 = new JButton("Agregar al carrito");
		btnAnadirAlCarrito_3.setForeground(Color.WHITE);
		btnAnadirAlCarrito_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_3.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_3.setBounds(338, 692, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_3);
		
		btnAnadirAlCarrito_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JButton btnFav_3= new JButton("Fav");
		btnFav_3.setBounds(477, 691, 53, 43);
		frame.getContentPane().add(btnFav_3);
		
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
			
			JLabel lblNewLabel_1 = new JLabel("Televisiones");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel_1.setBounds(205, 45, 178, 43);
			frame.getContentPane().add(lblNewLabel_1);

		
		}
	}
	
	
	
	



