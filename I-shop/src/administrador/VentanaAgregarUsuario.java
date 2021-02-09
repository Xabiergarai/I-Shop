package administrador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import dataBase.BD;
import tienda.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAgregarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textEmail;
	private JTextField textPass;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAgregarUsuario frame = new VentanaAgregarUsuario();
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
	public VentanaAgregarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuevo usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(106, 45, 230, 39);
		contentPane.add(lblNewLabel);
		
		textNombre = new JTextField();
		textNombre.setBounds(197, 137, 170, 32);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(32, 137, 88, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(32, 199, 88, 32);
		contentPane.add(lblNewLabel_1_1);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(197, 199, 170, 32);
		contentPane.add(textEmail);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contrasenya");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(32, 260, 88, 32);
		contentPane.add(lblNewLabel_1_2);
		
		textPass = new JTextField();
		textPass.setColumns(10);
		textPass.setBounds(197, 260, 170, 32);
		contentPane.add(textPass);
		
		JButton btnAgregarProducto = new JButton("AGREGAR");
		btnAgregarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombre.getText();
				String email = textEmail.getText();
				String contrasenia = textPass.getText();
				Usuario u = new Usuario(nombre, email, contrasenia, null, null);
				System.out.println(u);
			}
		});
		btnAgregarProducto.setForeground(Color.WHITE);
		btnAgregarProducto.setBackground(new Color(255, 165, 0));
		btnAgregarProducto.setBounds(149, 390, 132, 50);
		contentPane.add(btnAgregarProducto);
		
		btnAgregarProducto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				BD.insertarUsuario(textNombre.getText(), textEmail.getText(), textPass.getText());
				setVisible(false);
				VentanaGestionUsuarios vu = new VentanaGestionUsuarios();
				vu.setVisible(true);
				
			}
		});
		
	}
}