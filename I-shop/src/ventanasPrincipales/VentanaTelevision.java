package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class VentanaTelevision {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTelevision window = new VentanaTelevision();
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
	public VentanaTelevision() {
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
		
		
		PanelProducto pp1 = new PanelProducto("Televisiones", "img/tv1.jpg", "Televisor Sony 65 LED UltraHD 4K",(double)784);
		panel.add(pp1);
		PanelProducto pp2 = new PanelProducto("Televisiones", "img/tv2.jpg", "Lenco 10 TFT HD Televisor Portatil",(double)130.99);
		panel.add(pp1);
		PanelProducto pp3 = new PanelProducto("Televisiones", "img/tv3.jpg", "Televisor LG 49 LED UltraHD 4K",(double)428.99);
		panel.add(pp1);
		PanelProducto pp4 = new PanelProducto("Televisiones", "img/tv4.jpg", "Sony Bravia 85 LED UltraHD 4K",(double)1999);
		panel.add(pp1);
		
		
	}
	
	}