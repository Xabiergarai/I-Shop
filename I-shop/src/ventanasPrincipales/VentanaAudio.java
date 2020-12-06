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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		JScrollPane scroll = new JScrollPane(panel);
		//scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		frame.getContentPane().add(scroll);
		
		
		PanelProducto pp1 = new PanelProducto("Audio", "img/1.jpg", "Logitech G432 Auriculares Gaming 7.1",(double)45.99);
		panel.add(pp1);
		PanelProducto pp2 = new PanelProducto("Audio", "img/mars-gaming-msx-altavoces-21-35w.jpg", "Mars Gaming MSX Altavoz",(double)15.90);
		panel.add(pp1);
		PanelProducto pp3 = new PanelProducto("Audio", "mg/1523-galaxy-buds-live-auriculares-inalambricos-negro.jpg", "Galaxy Buds Live Auriculares Inalambricos Negro",(double)134.99);
		panel.add(pp1);
		PanelProducto pp4 = new PanelProducto("Audio", "img/altavoz.jpg", "Logitech Speaker System Z313 Altavoces 2.1",(double)49.99);
		panel.add(pp1);
		

	}
}
