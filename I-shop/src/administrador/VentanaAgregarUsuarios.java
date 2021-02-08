package administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaAgregarUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAgregarUsuarios frame = new VentanaAgregarUsuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaAgregarUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNuevoUsuario = new JLabel("Nuevo usuario");
		lblNuevoUsuario.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNuevoUsuario.setBounds(101, 38, 230, 39);
		contentPane.add(lblNuevoUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(49, 112, 132, 32);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(214, 112, 170, 32);
		contentPane.add(textField);
		
		JButton btnAgregarProducto = new JButton("AGREGAR");
		btnAgregarProducto.setForeground(Color.WHITE);
		btnAgregarProducto.setBackground(new Color(255, 165, 0));
		btnAgregarProducto.setBounds(157, 481, 132, 50);
		contentPane.add(btnAgregarProducto);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(49, 181, 88, 32);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(214, 181, 170, 32);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(49, 247, 88, 32);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(214, 247, 170, 32);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nombre");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(49, 313, 88, 32);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(214, 313, 170, 32);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Apellido");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBounds(49, 377, 88, 32);
		contentPane.add(lblNewLabel_1_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(214, 377, 170, 32);
		contentPane.add(textField_4);
	}

}
