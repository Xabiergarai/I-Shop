package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class VentanaLogin {

	private JFrame frame;
	private JTextField txtEmail;
	private JTextField txtContrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
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
	public VentanaLogin() {
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
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setBounds(132, 363, 185, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNuevoCliente = new JButton("NUEVO CLIENTE");
		btnNuevoCliente.setBounds(132, 439, 185, 48);
		frame.getContentPane().add(btnNuevoCliente);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setText("EMAIL");
		txtEmail.setBounds(105, 178, 236, 42);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtContrase = new JTextField();
		txtContrase.setText("CONTRASE\u00D1A");
		txtContrase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtContrase.setColumns(10);
		txtContrase.setBounds(105, 252, 236, 42);
		frame.getContentPane().add(txtContrase);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(105, 323, 236, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Deusto\\Proyectos\\Proyecto Prog 3\\fotos\\i-shopNombreLogo.jpg"));
		lblNewLabel_1.setBounds(146, 47, 171, 94);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
