package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

public class VentanaOrdenador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOrdenador window = new VentanaOrdenador();
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
	public VentanaOrdenador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(72, 90, 124, 141);
		frame.getContentPane().add(lblNewLabel);
		
		
		ImageIcon ico1= new ImageIcon("img/1539-honor-magicbook-14-amd-ryzen-5-3500u-8gb-256gb-ssd-14.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel.setIcon(img1);
        
        JLabel lblNewLabel_2 = new JLabel("<html>Lenovo IdeaPad 3 15ADA05 AMD\r\n3020e/8GB/256GB SSD/15.6\"<html>" );
        lblNewLabel_2.setBackground(Color.WHITE);
        lblNewLabel_2.setToolTipText("");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(77, 234, 139, 107);
        frame.getContentPane().add(lblNewLabel_2);
        
        JLabel label = new JLabel("379 eur");
        label.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label.setBounds(57, 342, 124, 43);
        frame.getContentPane().add(label);
        
        JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
        btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito.setForeground(Color.WHITE);
        btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito.setBounds(57, 419, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito);
        

		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setBounds(329, 90, 150, 141);
        frame.getContentPane().add(lblNewLabel_3);
        
        ImageIcon ico2= new ImageIcon("img/Portatil.jpg");
        ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_3.setIcon(img2);
        
        JLabel lblNewLabel_2_1 = new JLabel("<html>HP 255 G7 AMD Ryzen 5 3500U/8GB/256 GB SSD/15.6\"<html>");
        lblNewLabel_2_1.setToolTipText("");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_1.setBackground(Color.WHITE);
        lblNewLabel_2_1.setBounds(319, 234, 139, 107);
        frame.getContentPane().add(lblNewLabel_2_1);
        
        JLabel label_1 = new JLabel("559 eur");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label_1.setBounds(319, 342, 124, 43);
        frame.getContentPane().add(label_1);
        
        JButton btnAnadirAlCarrito_1 = new JButton("Agregar al carrito");
        btnAnadirAlCarrito_1.setForeground(Color.WHITE);
        btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_1.setBounds(319, 419, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito_1);
        
        btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblNewLabel_4 = new JLabel("New label");
        lblNewLabel_4.setBounds(72, 526, 154, 93);
        frame.getContentPane().add(lblNewLabel_4);
        
        ImageIcon ico3= new ImageIcon("img/pc3.jpg");
        ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_4.setIcon(img3);
        
        JLabel lblNewLabel_5 = new JLabel("<html>Apple MacBook Pro Intel Core i5/8GB/512GB SSD/13.3\" Gris Espacial<html>");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_5.setBounds(57, 630, 139, 60);
        frame.getContentPane().add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("1499 eur");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_6.setBounds(57, 718, 119, 16);
        frame.getContentPane().add(lblNewLabel_6);
        
        JButton btnAnadirAlCarrito_2 = new JButton("Agregar al carrito");
        btnAnadirAlCarrito_2.setForeground(Color.WHITE);
        btnAnadirAlCarrito_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_2.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_2.setBounds(57, 759, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito_2);
        
        btnAnadirAlCarrito_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JButton btnAnadirAlCarrito_2_1 = new JButton("Agregar al carrito");
        btnAnadirAlCarrito_2_1.setForeground(Color.WHITE);
        btnAnadirAlCarrito_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_2_1.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_2_1.setBounds(329, 759, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito_2_1);
        
        btnAnadirAlCarrito_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblNewLabel_7 = new JLabel("New label");
        lblNewLabel_7.setBounds(329, 526, 154, 93);
        frame.getContentPane().add(lblNewLabel_7);
        
        ImageIcon ico4= new ImageIcon("img/pc4.jpg");
        ImageIcon img4= new ImageIcon(ico4.getImage().getScaledInstance(lblNewLabel_7.getWidth(), lblNewLabel_7.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_7.setIcon(img4);
        
      
        JLabel lblNewLabel_8 = new JLabel("<html>Asus Tuf Gaming A15 AMD Ryzen 7 4800H/16GB/1TB SSD/GTX 1650Ti/15.6\"<html>");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_8.setBounds(329, 631, 124, 77);
        frame.getContentPane().add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("1199 eur");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_9.setBounds(337, 718, 93, 16);
        frame.getContentPane().add(lblNewLabel_9);
        
        JButton btnFav = new JButton("Fav");
        btnFav.setHorizontalTextPosition(SwingConstants.CENTER);
        btnFav.setBounds(198, 419, 53, 43);
        frame.getContentPane().add(btnFav);
        
        btnFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav2 = new JButton("Fav");
        btnFav2.setBounds(459, 419, 53, 43);
        frame.getContentPane().add(btnFav2);
      
        
        btnFav2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav3 = new JButton("Fav");
        btnFav3.setBounds(198, 759, 53, 43);
        frame.getContentPane().add(btnFav3);
        
        btnFav3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav4 = new JButton("Fav");
        btnFav4.setBounds(470, 759, 53, 43);
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Ordenadores");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(194, 34, 178, 43);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
