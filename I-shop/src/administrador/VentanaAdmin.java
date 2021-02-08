package administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;

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
		
		JButton btnEntrar = new JButton("STOCK DISPONIBLE");
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setBackground(new Color(255, 165, 0));
		btnEntrar.setBounds(129, 81, 348, 66);
		contentPane.add(btnEntrar);
		
		JButton btnEntrar_1 = new JButton("GESTION DE USUARIOS");
		btnEntrar_1.setForeground(Color.WHITE);
		btnEntrar_1.setBackground(new Color(255, 165, 0));
		btnEntrar_1.setBounds(129, 187, 348, 66);
		contentPane.add(btnEntrar_1);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.setBounds(10, 24, 89, 23);
		contentPane.add(btnNewButton);
		
//		JButton btnEntrar_2 = new JButton("ENTRAR");
//		btnEntrar_2.setForeground(Color.WHITE);
//		btnEntrar_2.setBackground(new Color(255, 165, 0));
//		btnEntrar_2.setBounds(129, 314, 348, 66);
//		contentPane.add(btnEntrar_2);
	}
}
