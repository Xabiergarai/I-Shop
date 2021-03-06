package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

import administrador.VentanaAdmin;
import dataBase.BD;
import tienda.Contenedora;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

	private JFrame frame;
	static JTextField txtEmail;
	private JTextField txtContrase;
	public static Contenedora contenedora;

	/*
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
		contenedora = new Contenedora();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BD.crearLaBD();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setIgnoreRepaint(true);
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ishop");
		frame.getContentPane().setLayout(null);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String email = txtEmail.getText();
				String con = txtContrase.getText();
				
				
				// acceso a la intranet a traves de usuario admin y contraseņa admin
				if (email.equals("admin") && con.equals("admin")) {
					VentanaAdmin va = new VentanaAdmin();
					va.setVisible(true);
					setVisible(false);
					frame.dispose();
					
					
					
				}else {
					int resul = BD.comprobarUsuario(email, con);
					if(resul==0) {
						JOptionPane.showMessageDialog(null, "El e-mail no esta registrado.", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
					}
					else if(resul==1) {
						JOptionPane.showMessageDialog(null, "La contrasena no es correcta", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
					}	
					else {
						JOptionPane.showMessageDialog(null, "Bienvenido", "ACCESO CORRECTO", JOptionPane.INFORMATION_MESSAGE);
						VentanaMenu.main(null);

						vaciarCampos();
						frame.dispose();
					}
				}
				
			}
		});
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(255, 165, 0));
		btnEntrar.setBounds(132, 366, 185, 48);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnNuevoCliente = new JButton("NUEVO CLIENTE");
		btnNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegistro.main(null);
				frame.dispose();
			}
		});
		
		btnNuevoCliente.setForeground(new Color(255, 255, 255));
		btnNuevoCliente.setBackground(new Color(192, 192, 192));
		btnNuevoCliente.setBounds(132, 439, 185, 48);
		frame.getContentPane().add(btnNuevoCliente);
		
		txtEmail = new JTextField("Email");
		txtEmail.setBackground(SystemColor.menu);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setBounds(115, 179, 236, 42);
		frame.getContentPane().add(txtEmail);
		//txtEmail.setColumns(10);
		txtEmail.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						txtEmail.setText("");
						
					}
				});
		
		txtContrase = new JPasswordField();
		txtContrase.setBackground(SystemColor.menu);
		txtContrase.setHorizontalAlignment(SwingConstants.LEFT);
		txtContrase.setText("");
		txtContrase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		//txtContrase.setColumns(10);
		txtContrase.setBounds(115, 252, 236, 42);
		frame.getContentPane().add(txtContrase);
		
		JLabel lblOlvidarContrasena = new JLabel("He olvidado mi contrasena");
		lblOlvidarContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblOlvidarContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOlvidarContrasena.setForeground(new Color(255, 165, 0));
		lblOlvidarContrasena.setBounds(105, 319, 236, 14);
		frame.getContentPane().add(lblOlvidarContrasena);
		
		
		
		URL iconURL = getClass().getResource("/i-shopSinFondo.png");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(iconURL));
		lblNewLabel_1.setBounds(115, 40, 236, 138);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		ImageIcon ico1= new ImageIcon(iconURL);
		ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img1);

		
		
		
		
	}
	
	public void vaciarCampos() {
		txtEmail.setText("");
		txtContrase.setText("");
	}	
}
        