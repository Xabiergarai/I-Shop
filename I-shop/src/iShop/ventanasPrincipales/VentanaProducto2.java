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

public class VentanaProducto2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProducto2 window = new VentanaProducto2();
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
	public VentanaProducto2() {
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
		
		JLabel lblNewLabel = new JLabel("Audio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(25, 30, 77, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/xabiergarai/Desktop/1.jpg"));
		lblNewLabel_1.setBounds(49, 103, 189, 130);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/xabiergarai/Desktop/mars-gaming-msx-altavoces-21-35w.jpg"));
		lblNewLabel_2.setBounds(287, 108, 151, 121);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Logitech G432 Auriculares Gaming 7.1");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(52, 276, 281, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mars Gaming MSX Altavoz");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(325, 276, 151, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("45,99€");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(52, 322, 61, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnAnadirAlCarrito = new JButton("Añadir al carrito");
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
		
		JLabel lblNewLabel_5_1 = new JLabel("15,90€");
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_5_1.setBounds(325, 324, 61, 16);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JButton btnAnadirAlCarrito_1 = new JButton("Añadir al carrito");
		btnAnadirAlCarrito_1.setForeground(Color.WHITE);
		btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_1.setBounds(325, 370, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_1);
		
		btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
	}
}
