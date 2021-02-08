package administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dataBase.BD;
import dataBase.DBException;

import javax.swing.JTable;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
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
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setBackground(new Color(255, 165, 0));
		btnAgregar.setBounds(50, 299, 100, 39);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(new Color(255, 165, 0));
		btnEliminar.setBounds(437, 299, 100, 39);
		contentPane.add(btnEliminar);
		
		
		
		
		
		
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
		
		
		
		for (String producto : productos) {
			modelo.addElement(producto);
		}
		
	
	
		
		
	
	
		
	}
}
