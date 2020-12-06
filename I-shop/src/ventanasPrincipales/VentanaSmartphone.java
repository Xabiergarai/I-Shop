package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class VentanaSmartphone {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSmartphone window = new VentanaSmartphone();
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
	public VentanaSmartphone() {
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
		
		PanelProducto pp1 = new PanelProducto("Smartphones", "img/iphonexr-black-pureangles-us-en-screen1.jpg", "Apple iPhone XR 64GB Negro Libre",(double)630.99);
		panel.add(pp1);
		PanelProducto pp2 = new PanelProducto("Smartphones", "img/samsung-galaxy-m31-6-64gb-negro-libre-comprar.jpg", "Samsung Galaxy M31 Negro Libre",(double)199);
		panel.add(pp1);
		PanelProducto pp3 = new PanelProducto("Smartphones", "img/movil3.jpg", "Realme 6 4/64GB Comet Blue Libre",(double)169);
		panel.add(pp1);
		PanelProducto pp4 = new PanelProducto("Smartphones", "img/movil 4.jpg", "Samsung Galaxy Tab A 10.1 2019 32GB",(double)784);
		panel.add(pp1);
		
	}
}