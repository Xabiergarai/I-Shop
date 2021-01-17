package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

import administrador.VentanaAdministrador;
import dataBase.BD;
import tienda.Contenedora;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

	private JFrame frame;
	static JTextField txtEmail;
	private JTextField txtContrase;
	public static Contenedora contenedora;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
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
	public VentanaLogin() {
		contenedora = new Contenedora();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		BD.crearLaBD();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setIgnoreRepaint(true);
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ishop");
		frame.getContentPane().setLayout(null);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String email = txtEmail.getText();
				String con = txtContrase.getText();
				int resul = BD.comprobarUsuario(email, con);
				if(resul==0) {
					JOptionPane.showMessageDialog(null, "El e-mail no esta registrado.", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
				}
				else if(resul==1) {
					JOptionPane.showMessageDialog(null, "La contrasena no es correcta", "ACCESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
				}	
				else {
					JOptionPane.showMessageDialog(null, "Bienvenido", "ACCESO CORRECTO", JOptionPane.INFORMATION_MESSAGE);
					if(email.equals("admin") && con.equals("admin")) {
						new VentanaAdministrador(null);
					} else {
						new VentanaMenu(null);
					}
					vaciarCampos();
					frame.dispose();
				}
			}
		});
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(255, 165, 0));
		btnEntrar.setBounds(132, 366, 185, 48);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnNuevoCliente = new JButton("NUEVO CLIENTE");
		btnNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegistro.main(null);
				frame.dispose();
			}
		});
		
		btnNuevoCliente.setForeground(new Color(255, 255, 255));
		btnNuevoCliente.setBackground(new Color(192, 192, 192));
		btnNuevoCliente.setBounds(132, 439, 185, 48);
		frame.getContentPane().add(btnNuevoCliente);
		
		txtEmail = new JTextField("Email");
		txtEmail.setBackground(SystemColor.menu);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setBounds(115, 179, 236, 42);
		frame.getContentPane().add(txtEmail);
		//txtEmail.setColumns(10);
		txtEmail.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						txtEmail.setText("");
						
					}
				});
		
		txtContrase = new JPasswordField();
		txtContrase.setBackground(SystemColor.menu);
		txtContrase.setHorizontalAlignment(SwingConstants.LEFT);
		txtContrase.setText("");
		txtContrase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		//txtContrase.setColumns(10);
		txtContrase.setBounds(115, 252, 236, 42);
		frame.getContentPane().add(txtContrase);
		
		JLabel lblOlvidarContrasena = new JLabel("He olvidado mi contrasena");
		lblOlvidarContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblOlvidarContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOlvidarContrasena.setForeground(new Color(255, 165, 0));
		lblOlvidarContrasena.setBounds(105, 319, 236, 14);
		frame.getContentPane().add(lblOlvidarContrasena);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("img/i-shopNombreLogo.jpg"));
		lblNewLabel_1.setBounds(115, 40, 236, 138);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		ImageIcon ico1= new ImageIcon("img/i-shopSinFondo.png");
		ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img1);

	}
	
	public void vaciarCampos() {
		txtEmail.setText("");
		txtContrase.setText("");
	}	
}
//probando con gridlayout
//private void initialize() {
//	frame = new JFrame();
//	frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
//	frame.setBounds(100, 100, 600, 650);
//	frame.setTitle("Ishop");
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.getContentPane().setLayout(null);
//
//	ArrayList<Television> televisiones = new ArrayList<Television>();
//	try {
//		televisiones = BD.listarTelevisiones();
//	} catch (DBException e1) {
//		e1.printStackTrace();
//	}
//
//	JPanel televisionesPanel = new JPanel(new FlowLayout());
//	for (Television t : televisiones) {
//		JPanel televisionPanel = productoPanel(t);
//		televisionesPanel.add(televisionPanel);
//	}
//	televisionesPanel.setBounds(50,100,500,900);
//	JScrollPane scrollPane = new JScrollPane(
//			televisionesPanel,
//			ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
//			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
//	);
//	frame.getContentPane().add(scrollPane);
//	frame.getContentPane().add(televisionesPanel);
//
//	JMenuBar menuBar = new JMenuBar();
//	menuBar.setBounds(0, 0, 99, 22);
//	frame.getContentPane().add(menuBar);
//
//	JMenu mnNewMenu = new JMenu("Categorias");
//	menuBar.add(mnNewMenu);
//
//	JMenuItem mntmNewMenuItem_2 = new JMenuItem("Audio");
//	mntmNewMenuItem_2.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			VentanaAudio.main(null);
//			frame.dispose();
//		}
//	});
//	mnNewMenu.add(mntmNewMenuItem_2);
//
//	JMenuItem mntmNewMenuItem = new JMenuItem("Ordenador");
//	mntmNewMenuItem.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			VentanaOrdenador.main(null);
//			frame.dispose();
//		}
//	});
//	mnNewMenu.add(mntmNewMenuItem);
//
//	JMenuItem mntmNewMenuItem_1 = new JMenuItem("SmartPhone");
//	mntmNewMenuItem_1.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			VentanaSmartphone.main(null);
//			frame.dispose();
//		}
//	});
//	mnNewMenu.add(mntmNewMenuItem_1);
//
//	JMenuItem mntmNewMenuItem_3 = new JMenuItem("Television");
//	mntmNewMenuItem_3.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			VentanaTelevision.main(null);
//			frame.dispose();
//		}
//	});
//	mnNewMenu.add(mntmNewMenuItem_3);
//
//	JLabel lblNewLabel_1_1 = new JLabel("Televisiones");
//	lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
//	lblNewLabel_1_1.setBounds(194, 34, 178, 43);
//	frame.getContentPane().add(lblNewLabel_1_1);
//}
//
//private JPanel productoPanel(Television t) {
//	JPanel panel =  new JPanel();
//	panel.setLayout((LayoutManager) new BoxLayout(panel, BoxLayout.Y_AXIS));
//	panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//	panel.setBackground(Color.WHITE);
//
//	JLabel lblNewLabel = new JLabel();
//	lblNewLabel.setBounds(72, 90, 124, 141);
//	ImageIcon ico1= new ImageIcon(t.getRutaFoto());//meter las rutas en la bd
//	ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
//	lblNewLabel.setIcon(img1);
//	lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//	panel.add(lblNewLabel);
//
//	JLabel lblNewLabel_2 = new JLabel(t.getNombre());
//	lblNewLabel_2.setBackground(Color.WHITE);
//	lblNewLabel_2.setToolTipText("");
//	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
//	lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
//	panel.add(lblNewLabel_2);
//
//	JLabel label = new JLabel(String.valueOf(t.getPrecio()));
//	label.setFont(new Font("Tahoma", Font.PLAIN, 18));
//	label.setAlignmentX(Component.CENTER_ALIGNMENT);
//	panel.add(label);
//
//	JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
//	btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
//	btnAnadirAlCarrito.setForeground(Color.WHITE);
//	btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
//	btnAnadirAlCarrito.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			productos.getProductos().put(
//					new Random().nextInt(), t
//			);
//		}
//	});
//	btnAnadirAlCarrito.setAlignmentX(Component.CENTER_ALIGNMENT);
//	panel.add(btnAnadirAlCarrito);
//
//	return panel;
//}