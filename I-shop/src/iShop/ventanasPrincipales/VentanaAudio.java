package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

public class VentanaAudio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAudio window = new VentanaAudio();
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
	public VentanaAudio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Audio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(57, 37, 77, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(49, 103, 189, 130);
		frame.getContentPane().add(lblNewLabel_1);
		
		ImageIcon ico1= new ImageIcon("img/1.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_1.setIcon(img1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(287, 108, 151, 121);
		frame.getContentPane().add(lblNewLabel_2);
		
		ImageIcon ico2= new ImageIcon("img/mars-gaming-msx-altavoces-21-35w.jpg");
        ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_2.setIcon(img2);
		
		JLabel lblNewLabel_3 = new JLabel("<html>Logitech G432 Auriculares Gaming 7.1<html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(52, 244, 172, 48);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<html>Mars Gaming MSX Altavoz<html>");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(287, 234, 151, 52);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("45,99 eur");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(52, 322, 112, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnAnadirAlCarrito = new JButton("A�adir al carrito");
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.setBounds(52, 370, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito);
		
		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblNewLabel_5_1 = new JLabel("15,90 eur");
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_5_1.setBounds(287, 322, 85, 16);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JButton btnAnadirAlCarrito_1 = new JButton("A�adir al carrito");
		btnAnadirAlCarrito_1.setForeground(Color.WHITE);
		btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_1.setBounds(287, 370, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(49, 444, 157, 148);
		frame.getContentPane().add(lblNewLabel_6);
		
		ImageIcon ico3= new ImageIcon("img/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg");
        ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_6.setIcon(img3);
		
		JLabel lblNewLabel_7 = new JLabel("<html>Galaxy Buds Live Auriculares Inalambricos Negro<html>");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(57, 612, 172, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("134,99 eur");
		lblNewLabel_8.setBounds(86, 666, 61, 16);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnAnadirAlCarrito_2 = new JButton("A�adir al carrito");
		btnAnadirAlCarrito_2.setForeground(Color.WHITE);
		btnAnadirAlCarrito_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_2.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_2.setBounds(57, 717, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_2);
		
		btnAnadirAlCarrito_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JButton btnAnadirAlCarrito_3 = new JButton("A�adir al carrito");
		btnAnadirAlCarrito_3.setForeground(Color.WHITE);
		btnAnadirAlCarrito_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito_3.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito_3.setBounds(287, 717, 139, 43);
		frame.getContentPane().add(btnAnadirAlCarrito_3);
		
		btnAnadirAlCarrito_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setBounds(287, 449, 172, 139);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		ImageIcon ico4 = new ImageIcon("img/altavoz.jpg");
        ImageIcon img4 = new ImageIcon(ico4.getImage().getScaledInstance(lblNewLabel_6_1.getWidth(), lblNewLabel_6_1.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_6_1.setIcon(img4);
		
		JLabel lblNewLabel_6_2 = new JLabel("<html>Logitech Speaker System Z313 Altavoces 2.1<html>");
		lblNewLabel_6_2.setBounds(305, 612, 189, 16);
		frame.getContentPane().add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("49,99 eur");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6_3.setBounds(333, 666, 105, 16);
		frame.getContentPane().add(lblNewLabel_6_3);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(503, 107, 15, 366);
		frame.getContentPane().add(scrollBar);
		
		btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
	}
}
