package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class VentanaOrdenador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOrdenador window = new VentanaOrdenador();
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
	public VentanaOrdenador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		JScrollPane scroll = new JScrollPane(panel);
		//scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		frame.getContentPane().add(scroll);

		PanelProducto pp1 = new PanelProducto("Ordenadores", "img/1539-honor-magicbook-14-amd-ryzen-5-3500u-8gb-256gb-ssd-14.jpg", "Lenovo IdeaPad 3 15ADA05 AMD",(double)379);
		panel.add(pp1);
		PanelProducto pp2 = new PanelProducto("Ordenadores", "img/Portatil.jpg", "HP 255 G7 AMD Ryzen 5 3500U/8GB/256 GB SSD/15.6",(double)559);
		panel.add(pp2);
		PanelProducto pp3 = new PanelProducto("Ordenadores", "img/pc3.jpg", "Apple MacBook Pro Intel Core i5/8GB/512GB SSD/13.3 Gris Espacial",(double)1499);
		panel.add(pp3);
		PanelProducto pp4 = new PanelProducto("Ordenadores", "img/pc4.jpg", "Asus Tuf Gaming A15 AMD Ryzen 7 4800H/16GB/1TB SSD/GTX 1650Ti/15.6",(double)1199);
		panel.add(pp4);
				
		
	}
}