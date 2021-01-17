package ventanasPrincipales;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.Random;

import dataBase.BD;
import dataBase.DBException;
import tienda.ListaProducto;
import tienda.Ordenador;

public class VentanaOrdenador {

	private JFrame frame;
	private ListaProducto productos;

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
		productos = new ListaProducto();
		initialize();
	}

	public VentanaOrdenador(ListaProducto productos) {
		this.productos = productos;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 600,650);
		frame.setTitle("Ishop");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ArrayList<Ordenador> ordenadores = new ArrayList<Ordenador>();
		try {
			ordenadores = BD.listarOrdenadores();
		} catch (DBException e1) {
			e1.printStackTrace();
		}

		JPanel ordenadoresPanel = new JPanel(new FlowLayout());
		for (Ordenador o : ordenadores) {
			JPanel ordenadorPanel = productoPanel(o);
			ordenadoresPanel.add(ordenadorPanel);
		}
		ordenadoresPanel.setBounds(50,100,500,700);
		JScrollPane scrollPane = new JScrollPane(
				ordenadoresPanel,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
		);
		frame.getContentPane().add(scrollPane);
		frame.getContentPane().add(ordenadoresPanel);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 99, 22);
		frame.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("Categorias");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Audio");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAudio.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem = new JMenuItem("Ordenador");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOrdenador.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("SmartPhone");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSmartphone.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Television");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTelevision.main(null);
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);

		JLabel lblNewLabel_1_1 = new JLabel("Ordenadores");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(194, 34, 178, 43);
		frame.getContentPane().add(lblNewLabel_1_1);
	}

	private JPanel productoPanel(Ordenador o) {
		JPanel panel =  new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel.setBackground(Color.WHITE);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(72, 90, 124, 141);
		ImageIcon ico1= new ImageIcon(o.getRutaFoto());//meter las rutas en la bd
		ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(img1);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel(o.getNombre());
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_2);

		JLabel label = new JLabel(String.valueOf(o.getPrecio()));
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(label);

		JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
		btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadirAlCarrito.setForeground(Color.WHITE);
		btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				productos.getProductos().put(
						new Random().nextInt(), o
				);
			}
		});
		btnAnadirAlCarrito.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnAnadirAlCarrito);

		return panel;
	}
}
