package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VentanaFavoritos {

	private JFrame frame;
	private JTextField txtFavoritos;
	private JTextField txtMisListas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFavoritos window = new VentanaFavoritos();
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
	public VentanaFavoritos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtFavoritos = new JTextField();
		txtFavoritos.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtFavoritos.setText("Lista de deseos");
		txtFavoritos.setBounds(98, 49, 295, 54);
		frame.getContentPane().add(txtFavoritos);
		txtFavoritos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\luisg\\git\\I-Shop\\I-shop\\img\\listadedeseos.png"));
		lblNewLabel.setBounds(34, 49, 55, 54);
		frame.getContentPane().add(lblNewLabel);
		
		txtMisListas = new JTextField();
		txtMisListas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMisListas.setText("Mis listas");
		txtMisListas.setBounds(34, 139, 115, 20);
		frame.getContentPane().add(txtMisListas);
		txtMisListas.setColumns(10);
		
		JButton btnNewButton = new JButton("A\u00F1adir lista");
		btnNewButton.setBounds(34, 170, 115, 158);
		frame.getContentPane().add(btnNewButton);
		
		ImageIcon ico= new ImageIcon("img/listadedeseos.png");
		ImageIcon img= new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(img);
	}
}
