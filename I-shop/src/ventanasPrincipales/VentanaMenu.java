package ventanasPrincipales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import paneles.PanelAudio;
import tienda.Audio;
import tienda.ListaProducto;
import tienda.Producto;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaMenu extends JFrame {
	private JFrame frame;
	JPanel pCentral, pSur;
	private JButton btnSalir, btnFinalizarCompra;
	private JFrame ventana, ventanaAnterior;
	ArrayList<Producto> carrito = new ArrayList<Producto>();
	ListaProducto listaProducto = new ListaProducto();
	
	public void cargarFotos() {
		for(Producto p: VentanaLogin.contenedora.getListaProductos()) {
			if(p instanceof Audio) {
				PanelAudio panel = new PanelAudio((Audio) p,ventana);
				pCentral.add(panel);
			} 
		}
	}	


		VentanaLogin vp = new VentanaLogin();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu window = new VentanaMenu();
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
	public VentanaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ishop");
		frame.getContentPane().setLayout(null);
		
		JLabel lblSeccionesProductos = new JLabel("Secciones de los productos");
		lblSeccionesProductos.setFont(new Font("Dialog", Font.BOLD, 18));
		lblSeccionesProductos.setBounds(128, 11, 242, 26);
		frame.getContentPane().add(lblSeccionesProductos);
		
		URL iconURL = getClass().getResource("/audio.jpg");
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(275, 62, 126, 77);
		frame.getContentPane().add(lblNewLabel_1);
		

		ImageIcon ico2= new ImageIcon(iconURL);
		ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img2);
		
		URL iconURL1 = getClass().getResource("/portatilLogo.png");
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(90, 62, 106, 77);
		frame.getContentPane().add(lblNewLabel_2);
		ImageIcon ico3= new ImageIcon(iconURL1);
		ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_2.setIcon(img3);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(83, 224, 126, 77);
		frame.getContentPane().add(lblNewLabel_3);

		URL iconURL2 = getClass().getResource("/smartphone.png");
		ImageIcon ico4= new ImageIcon(iconURL2);
		ImageIcon img4= new ImageIcon(ico4.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_3.setIcon(img4);
		
		JButton btnPc = new JButton("PC");
		btnPc.setForeground(Color.WHITE);
		btnPc.setBackground(new Color(255, 165, 0));
		btnPc.setBounds(83, 150, 126, 48);
		frame.getContentPane().add(btnPc); 
				
			btnPc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaOrdenador.main(carrito);
					frame.dispose();
				}
			});
		
		JButton btnAudio = new JButton("Audio");
		btnAudio.setForeground(Color.WHITE);
		btnAudio.setBackground(new Color(255, 165, 0));
		btnAudio.setBounds(275, 150, 126, 48);
		frame.getContentPane().add(btnAudio); 
			
		btnAudio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaAudio.main(carrito);
					frame.dispose();
				}
			});
		
		JButton btnSmartphone = new JButton("SmartPhone");
		btnSmartphone.setForeground(Color.WHITE);
		btnSmartphone.setBackground(new Color(255, 165, 0));
		btnSmartphone.setBounds(83, 339, 126, 48);
		frame.getContentPane().add(btnSmartphone);
		
		
		JButton btnTelevision = new JButton("Television");
		btnTelevision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTelevision.main(carrito);
				frame.dispose();
			}
		});
		btnTelevision.setForeground(Color.WHITE);
		btnTelevision.setBackground(new Color(255, 165, 0));
		btnTelevision.setBounds(275, 339, 126, 48);
		frame.getContentPane().add(btnTelevision);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBackground(Color.WHITE);
		lblNewLabel_3_1.setBounds(275, 224, 126, 77);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		URL iconURL3 = getClass().getResource("/iconotv.jpg");
		ImageIcon ico5= new ImageIcon(iconURL3);
		ImageIcon img5= new ImageIcon(ico5.getImage().getScaledInstance(lblNewLabel_3_1.getWidth(), lblNewLabel_3_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_3_1.setIcon(img5);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cerrar sesion");
		mntmNewMenuItem_1.setForeground(Color.RED);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin.main(null);
				frame.dispose();
			}
		});
		menuBar.add(mntmNewMenuItem_1);
		

		btnSmartphone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSmartphone.main(carrito);
				frame.dispose();
			}
		});
	}
}
