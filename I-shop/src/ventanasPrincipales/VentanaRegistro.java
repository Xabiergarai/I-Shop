package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import tienda.BD;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.*;
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
		frame.setTitle("Ishop");
		frame.getContentPane().setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setText("EMAIL*");
		txtEmail.setToolTipText("");
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		txtEmail.setBackground(SystemColor.menu);
		txtEmail.setBounds(114, 178, 236, 42);
		frame.getContentPane().add(txtEmail);
		
		txtContrasena = new JPasswordField();;
		txtContrasena.setText("");
		txtContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtContrasena.setColumns(10);
		txtContrasena.setBackground(SystemColor.menu);
		txtContrasena.setBounds(114, 231, 236, 42);
		frame.getContentPane().add(txtContrasena);
		
		txtContrasena_1 = new JPasswordField();;
		txtContrasena_1.setText("");
		txtContrasena_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtContrasena_1.setColumns(10);
		txtContrasena_1.setBackground(SystemColor.menu);
		txtContrasena_1.setBounds(114, 284, 236, 42);
		frame.getContentPane().add(txtContrasena_1);
		
		JCheckBox chckbxPrivacidad = new JCheckBox(" He leido y acepto la politica de privacidad.");
		chckbxPrivacidad.setBackground(new Color(255, 255, 255));
		chckbxPrivacidad.setBounds(105, 388, 268, 23);
		frame.getContentPane().add(chckbxPrivacidad);
		
		
		JButton btnCrearCuenta = new JButton("CREAR CUENTA");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxPrivacidad.isSelected()) {
					
					String nombreUsuario = txtNombre.getText();
					String emailUsuario = txtEmail.getText();
					String conUsuario = txtContrasena.getText();
					
					if (!conUsuario.isEmpty()) {
						if (!emailUsuario.isEmpty()) {
							if (!nombreUsuario.isEmpty()) {
								
							} else {
								JOptionPane.showMessageDialog(null, "El apartado nombre esta vacio");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Tienes que introducir un correo");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Tienes que crear una contrase�a");
					}
					
					if  (BD.existeUsuario(emailUsuario)) {
						emailUsuario = JOptionPane.showInputDialog("Este email ya esta en uso, introduce otro: ");	
					} else {
						BD.insertarUsuario(nombreUsuario, emailUsuario, conUsuario);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Debes aceptar la politica de privacidad", "ERROR!", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnCrearCuenta.setForeground(Color.WHITE);
		btnCrearCuenta.setBackground(new Color(255, 165, 0));
		btnCrearCuenta.setBounds(136, 440, 185, 48);
		frame.getContentPane().add(btnCrearCuenta);
		
		
		
		txtNombre = new JTextField();
		txtNombre.setText("NOMBRE*");
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNombre.setColumns(10);
		txtNombre.setBackground(SystemColor.menu);
		txtNombre.setBounds(114, 125, 236, 42);
		frame.getContentPane().add(txtNombre);
		
		JLabel lblCampos = new JLabel("Los campos marcados con * son obligatorios.");
		lblCampos.setBounds(114, 351, 277, 14);
		frame.getContentPane().add(lblCampos);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setBounds(114, 5, 236, 151);
		frame.getContentPane().add(lblNewLabel_1);
		
		ImageIcon ico1= new ImageIcon("img/i-shopSinFondo.png");
		ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img1);
		
		JButton btnNewButton = new JButton("Ya tengo una cuenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(136, 514, 185, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
