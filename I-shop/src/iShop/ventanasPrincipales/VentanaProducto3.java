package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VentanaProducto3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProducto3 window = new VentanaProducto3();
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
	public VentanaProducto3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Smartphones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(25, 23, 108, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/xabiergarai/Desktop/iphonexr-black-pureangles-us-en-screen1.jpg"));
		lblNewLabel_1.setBounds(95, 100, 129, 151);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apple iPhone XR 64GB Negro Libre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(85, 324, 195, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("630,99€");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(85, 371, 93, 16);
		frame.getContentPane().add(label);
		
		JButton btnAnadirAlCarrito = new JButton("Añadir al carrito");
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.setBounds(85, 428, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito);
		
		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		
		JButton btnAnadirAlCarrito_1 = new JButton("Añadir al carrito");
		btnAnadirAlCarrito_1.setForeground(Color.WHITE);
		btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_1.setBounds(314, 428, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_1);
		
		btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblNewLabel_2_1 = new JLabel("Samsung Galaxy M31 Negro Libre");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(314, 324, 161, 16);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("199€");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(314, 371, 85, 16);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("/Users/xabiergarai/Desktop/samsung-galaxy-m31-6-64gb-negro-libre-comprar.jpg"));
		lblNewLabel_1_1.setBounds(336, 100, 129, 151);
		frame.getContentPane().add(lblNewLabel_1_1);
	}

}
