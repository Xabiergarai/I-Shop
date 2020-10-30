package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;

public class VentanaInfoProducto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInfoProducto window = new VentanaInfoProducto();
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
	public VentanaInfoProducto() {
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
		
		JLabel lblNewLabel = new JLabel("ORDENADORES PORTATILES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(108, 30, 273, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: Honor MagicBook 14 AMD Ryzen 5 3500U/8GB/256GB 14\"");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(42, 247, 424, 152);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio: 579 eur");
		lblNewLabel_2.setForeground(new Color(255, 165, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(42, 345, 147, 54);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(89, 83, 114, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.setForeground(Color.WHITE);
		btnComprar.setBackground(new Color(255, 165, 0));
		btnComprar.setBounds(232, 463, 185, 48);
		frame.getContentPane().add(btnComprar);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(152, 472, 51, 31);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_6 = new JLabel("Cantidad");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(152, 446, 57, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnFavoritos = new JButton("FAVORITO");
		btnFavoritos.setForeground(Color.WHITE);
		btnFavoritos.setBackground(new Color(169, 169, 169));
		btnFavoritos.setBounds(32, 463, 94, 48);
		frame.getContentPane().add(btnFavoritos);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		
		lblNewLabel_3.setBounds(84, 70, 318, 229);
		frame.getContentPane().add(lblNewLabel_3);
	
		
		
		ImageIcon ico= new ImageIcon("img/1539-honor-magicbook-14-amd-ryzen-5-3500u-8gb-256gb-ssd-14.jpg");
		ImageIcon img= new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
			lblNewLabel_3.setIcon(img);
		

		
	}
}
