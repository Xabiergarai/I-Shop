package administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dataBase.BD;
import dataBase.DBException;
import ventanasPrincipales.VentanaAgregarProducto;
import ventanasPrincipales.VentanaAudio;
import ventanasPrincipales.VentanaLogin;
import ventanasPrincipales.VentanaOrdenador;
import ventanasPrincipales.VentanaSmartphone;

import javax.swing.JTable;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ListModel;
import java.awt.Font;
import javax.swing.JLabel;

public class VentanaGestionStock extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ArrayList<String> productos = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGestionStock frame = new VentanaGestionStock();
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
	public VentanaGestionStock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAgregarProducto.main(null);
				dispose();
			}
		});
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setBackground(new Color(255, 165, 0));
		btnAgregar.setBounds(50, 299, 100, 39);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(new Color(255, 165, 0));
		btnEliminar.setBounds(437, 299, 100, 39);
		contentPane.add(btnEliminar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 584, 22);
		getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Gestion");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Stock");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGestionStock.main(null);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem = new JMenuItem("Usuarios");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaGestionUsuarios.main(null);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cerrar sesion");
		mntmNewMenuItem_1.setForeground(Color.RED);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin.main(null);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		try {
			productos = BD.listarProductos();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DefaultListModel modelo = new DefaultListModel<>();
		JList listaArticulos = new JList(modelo);
		listaArticulos.setForeground(Color.BLACK);
		listaArticulos.setFont(new Font("Arial", Font.PLAIN, 15));
		listaArticulos.setBackground(new Color(255, 255, 255));
		listaArticulos.setBounds(50, 54, 487, 234);
		contentPane.add(listaArticulos);
		
		JScrollPane scrollpane = new JScrollPane(listaArticulos);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        scrollpane.setBounds(50, 54, 487, 234);
		contentPane.add(scrollpane);
		
		JLabel lblNewLabel = new JLabel("                Gestion de Stock");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		scrollpane.setColumnHeaderView(lblNewLabel);
		
		JButton btnExpACsv = new JButton("Exp a CSV");
		btnExpACsv.setForeground(Color.WHITE);
		btnExpACsv.setBackground(new Color(0, 128, 0));
		btnExpACsv.setBounds(245, 299, 100, 39);
		contentPane.add(btnExpACsv);
		
		
		
		for (String producto : productos) {
			modelo.addElement(producto);
		}
		
	
	
		
		
	
	
		
	}
}
