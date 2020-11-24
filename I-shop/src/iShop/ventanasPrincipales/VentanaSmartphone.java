package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Smartphones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(52, 27, 108, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(85, 100, 129, 151);
		frame.getContentPane().add(lblNewLabel_1);
		
		ImageIcon ico1= new ImageIcon("img/iphonexr-black-pureangles-us-en-screen1.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_1.setIcon(img1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>Apple iPhone XR 64GB Negro Libre<html>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(36, 309, 195, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("630,99 eur");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(85, 371, 93, 16);
		frame.getContentPane().add(label);
		
		JButton btnAnadirAlCarrito = new JButton("A�adir al carrito");
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
		
		
		JButton btnAnadirAlCarrito_1 = new JButton("A�adir al carrito");
		btnAnadirAlCarrito_1.setForeground(Color.WHITE);
		btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_1.setBounds(293, 428, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_1);
		
		btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>Samsung Galaxy M31 Negro Libre<html>");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(270, 309, 204, 16);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("199 eur");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(314, 371, 85, 16);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(303, 100, 129, 151);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		ImageIcon ico2= new ImageIcon("img/samsung-galaxy-m31-6-64gb-negro-libre-comprar.jpg");
        ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblNewLabel_1_1.getWidth(), lblNewLabel_1_1.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_1_1.setIcon(img2);
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setBounds(67, 510, 139, 123);
        frame.getContentPane().add(lblNewLabel_3);
        
        ImageIcon ico3= new ImageIcon("img/movil 4.jpg");
        ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_3.setIcon(img3);
        
        JLabel lblNewLabel_4 = new JLabel("<html>Samsung Galaxy Tab A 10.1\" 2019 32GB Wifi Plata<html>");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_4.setBounds(67, 645, 139, 16);
        frame.getContentPane().add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("169 eur");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_5.setBounds(67, 698, 93, 16);
        frame.getContentPane().add(lblNewLabel_5);
        
        JButton btnAnadirAlCarrito_2 = new JButton("A�adir al carrito");
        btnAnadirAlCarrito_2.setForeground(Color.WHITE);
        btnAnadirAlCarrito_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_2.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_2.setBounds(67, 726, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito_2);
        
        btnAnadirAlCarrito_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JButton btnAnadirAlCarrito_3 = new JButton("A�adir al carrito");
        btnAnadirAlCarrito_3.setForeground(Color.WHITE);
        btnAnadirAlCarrito_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_3.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_3.setBounds(293, 726, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito_3);
        
        btnAnadirAlCarrito_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblNewLabel_6 = new JLabel("New label");
        lblNewLabel_6.setBounds(298, 510, 134, 123);
        frame.getContentPane().add(lblNewLabel_6);
        
        ImageIcon ico4= new ImageIcon("img/movil3.jpg");
        ImageIcon img4= new ImageIcon(ico4.getImage().getScaledInstance(lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_6.setIcon(img4);
        
        
        JLabel lblNewLabel_7 = new JLabel("Realme 6 4/64GB Comet Blue Libre");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_7.setBounds(293, 645, 106, 16);
        frame.getContentPane().add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("169 eur");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_8.setBounds(293, 698, 78, 16);
        frame.getContentPane().add(lblNewLabel_8);
        
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(499, 110, 15, 482);
        frame.getContentPane().add(scrollBar);
        
        JButton btnFav = new JButton("New button");
        btnFav.setBounds(207, 428, 53, 43);
        frame.getContentPane().add(btnFav);
        
        btnFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav3 = new JButton("New button");
        btnFav3.setBounds(434, 428, 53, 43);
        frame.getContentPane().add(btnFav3);
        
        btnFav3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        
        JButton btnFav2 = new JButton("New button");
        btnFav2.setBounds(207, 726, 53, 43);
        frame.getContentPane().add(btnFav2);
        
        btnFav2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav4 = new JButton("New button");
        btnFav4.setBounds(434, 726, 53, 43);
        frame.getContentPane().add(btnFav4);
        
		
        btnFav4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
	}

}
