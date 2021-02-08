package administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ventanasPrincipales.VentanaLogin;
import ventanasPrincipales.VentanaOrdenador;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window;


public class VentanaAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAdmin frame = new VentanaAdmin();
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
	public VentanaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStock = new JButton("STOCK DISPONIBLE");
		btnStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGestionStock.main(null);
				dispose();
		}
		});
		btnStock.setForeground(Color.WHITE);
		btnStock.setBackground(new Color(255, 165, 0));
		btnStock.setBounds(129, 81, 348, 66);
		contentPane.add(btnStock);
		
		JButton btnUsuarios = new JButton("GESTION DE USUARIOS");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGestionUsuarios.main(null);
				dispose();
				
			}
		});
		btnUsuarios.setForeground(Color.WHITE);
		btnUsuarios.setBackground(new Color(255, 165, 0));
		btnUsuarios.setBounds(129, 187, 348, 66);
		contentPane.add(btnUsuarios);
		
		JButton btnNewButton = new JButton("Cerrar Sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin.main(null);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 305, 138, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
