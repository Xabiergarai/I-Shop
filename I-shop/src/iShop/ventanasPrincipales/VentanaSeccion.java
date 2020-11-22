package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaSeccion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSeccion window = new VentanaSeccion();
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
	public VentanaSeccion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Secciones de los productos");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(128, 27, 242, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(64, 121, 99, 55);
		frame.getContentPane().add(lblNewLabel_1);
		

		ImageIcon ico2= new ImageIcon("img/pc .jpg");
		ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(315, 121, 76, 55);
		frame.getContentPane().add(lblNewLabel_2);
		ImageIcon ico3= new ImageIcon("img/accesorios.jpg");
		ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_2.setIcon(img3);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(165, 260, 126, 77);
		frame.getContentPane().add(lblNewLabel_3);

		ImageIcon ico4= new ImageIcon("img/smartphone.png");
		ImageIcon img4= new ImageIcon(ico4.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_3.setIcon(img4);
		
		JButton btnPc = new JButton("PC");
		btnPc.setForeground(Color.WHITE);
		btnPc.setBackground(new Color(255, 165, 0));
		btnPc.setBounds(55, 62, 126, 48);
		frame.getContentPane().add(btnPc); 
				
			btnPc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaProducto.main(null);
					frame.dispose();
				}
			});
		
		JButton btnAccesorios = new JButton("Accesorios");
		btnAccesorios.setForeground(Color.WHITE);
		btnAccesorios.setBackground(new Color(255, 165, 0));
		btnAccesorios.setBounds(275, 62, 126, 48);
		frame.getContentPane().add(btnAccesorios); 
			
			btnAccesorios.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaProducto.main(null);
					frame.dispose();
				}
			});
		
		JButton btnSmartphone = new JButton("SmartPhone");
		btnSmartphone.setForeground(Color.WHITE);
		btnSmartphone.setBackground(new Color(255, 165, 0));
		btnSmartphone.setBounds(165, 201, 126, 48);
		frame.getContentPane().add(btnSmartphone);
		System.out.println("prueba");
		

		btnSmartphone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaProducto.main(null);
				frame.dispose();
			}
		});
	}
}
