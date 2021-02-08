package ventanasPrincipales;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaAgregarProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAgregarProducto frame = new VentanaAgregarProducto();
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
	public VentanaAgregarProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuevo producto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(106, 45, 230, 39);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(197, 137, 170, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(32, 137, 88, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(32, 199, 88, 32);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 199, 170, 32);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Precio");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(32, 260, 88, 32);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(197, 260, 170, 32);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Descripcion");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(170, 332, 88, 32);
		contentPane.add(lblNewLabel_1_3);
		
		textArea= new JTextArea();
		textArea.setColumns(10);
		textArea.setBounds(48, 375, 339, 88);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1_4 = new JLabel("Categoria");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(51, 494, 88, 32);
		contentPane.add(lblNewLabel_1_4);
		
		String[] opciones = {"Smartphone","Television","Audio","Ordenador"};
		JComboBox comboBox = new JComboBox<String>(opciones);
		comboBox.setBounds(225, 501, 147, 25);
		contentPane.add(comboBox);

		
		JButton btnAgregarProducto = new JButton("AGREGAR");
		btnAgregarProducto.setForeground(Color.WHITE);
		btnAgregarProducto.setBackground(new Color(255, 165, 0));
		btnAgregarProducto.setBounds(149, 580, 132, 50);
		contentPane.add(btnAgregarProducto);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("EUR");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(368, 260, 41, 32);
		contentPane.add(lblNewLabel_1_2_1);
	}
}
