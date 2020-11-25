package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

import Tienda.BD;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		BD.crearLaBD();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setIgnoreRepaint(true);
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String email = txtEmail.getText();
				String con = txtContrase.getText();
				int resul = BD.comprobarUsuario(email, con);
				if(resul==0) {
					JOptionPane.showMessageDialog(null, "El e-mail no esta registrado.", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
				}
				else if(resul==1)
					JOptionPane.showMessageDialog(null, "La contraseña no es correcta", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "Bienvenido", "ACCESO CORRECTO", JOptionPane.INFORMATION_MESSAGE);
				vaciarCampos();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setBounds(132, 366, 185, 48);
		frame.getContentPane().add(btnNewButton);
		
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
		
		txtEmail = new JTextField();
		txtEmail.setBackground(SystemColor.menu);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setText("EMAIL");
		txtEmail.setBounds(115, 179, 236, 42);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtContrase = new JTextField();
		txtContrase.setBackground(SystemColor.menu);
		txtContrase.setHorizontalAlignment(SwingConstants.LEFT);
		txtContrase.setText("CONTRASEÑA");
		txtContrase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtContrase.setColumns(10);
		txtContrase.setBounds(115, 252, 236, 42);
		frame.getContentPane().add(txtContrase);
		
		JLabel lblNewLabel = new JLabel("He olvidado mi contraseña");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 165, 0));
		lblNewLabel.setBounds(105, 319, 236, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("img/i-shopNombreLogo.jpg"));
		lblNewLabel_1.setBounds(115, 40, 236, 138);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		ImageIcon ico1= new ImageIcon("img/i-shopSinFondo.png");
		ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img1);

	}
	
	public void vaciarCampos() {
		txtEmail.setText("");
		txtContrase.setText("");
	}	
}
