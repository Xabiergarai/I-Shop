package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Tienda.BD;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro {

	private JFrame frame;
	private JTextField txtEmail;
	private JTextField txtContrasena;
	private JTextField txtContrasena_1;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro window = new VentanaRegistro();
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
	public VentanaRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setText("EMAIL*");
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		txtEmail.setBackground(SystemColor.menu);
		txtEmail.setBounds(114, 178, 236, 42);
		frame.getContentPane().add(txtEmail);
		
		txtContrasena = new JTextField();
		txtContrasena.setText("CONTRASENA*");
		txtContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtContrasena.setColumns(10);
		txtContrasena.setBackground(SystemColor.menu);
		txtContrasena.setBounds(114, 231, 236, 42);
		frame.getContentPane().add(txtContrasena);
		
		txtContrasena_1 = new JTextField();
		txtContrasena_1.setText("REP. CONTRASENA*");
		txtContrasena_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtContrasena_1.setColumns(10);
		txtContrasena_1.setBackground(SystemColor.menu);
		txtContrasena_1.setBounds(114, 284, 236, 42);
		frame.getContentPane().add(txtContrasena_1);
		
		JButton btnCrearCuenta = new JButton("CREAR CUENTA");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String email = txtEmail.getText();
				//String con = txtContrasena.getText();
				//int resul = BD.comprobarUsuario(email, con);
				String nombreUsuario = txtNombre.getText();
				String emailUsuario = txtEmail.getText();
				String conUsuario = txtContrasena.getText();
				if  (BD.existeUsuario(emailUsuario)) {
					emailUsuario = JOptionPane.showInputDialog("Este email ya esta en uso, introduce otro: ");	
				} else {
					BD.insertarUsuario(nombreUsuario, emailUsuario, conUsuario);
				}
					
			}
		});
		btnCrearCuenta.setForeground(Color.WHITE);
		btnCrearCuenta.setBackground(new Color(255, 165, 0));
		btnCrearCuenta.setBounds(136, 440, 185, 48);
		frame.getContentPane().add(btnCrearCuenta);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(" He leido y acepto la politica de privacidad.");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(105, 388, 268, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		txtNombre = new JTextField();
		txtNombre.setText("NOMBRE*");
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNombre.setColumns(10);
		txtNombre.setBackground(SystemColor.menu);
		txtNombre.setBounds(114, 125, 236, 42);
		frame.getContentPane().add(txtNombre);
		
		JLabel lblNewLabel = new JLabel("Los campos marcados con * son obligatorios.");
		lblNewLabel.setBounds(114, 351, 277, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setBounds(114, 5, 236, 151);
		frame.getContentPane().add(lblNewLabel_1);
		
		ImageIcon ico1= new ImageIcon("img/i-shopSinFondo.png");
		ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img1);
		
	}
}
