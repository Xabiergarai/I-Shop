package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class VentanaBusqueda {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBusqueda window = new VentanaBusqueda();
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
	public VentanaBusqueda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ishop");
		frame.getContentPane().setLayout(null);
		
		JLabel lblBusqueda = new JLabel("Busque aqui tu producto deseado");
		lblBusqueda.setBounds(76, 18, 292, 16);
		frame.getContentPane().add(lblBusqueda);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 123, 61, 16);
		frame.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(142, 118, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSeccion = new JLabel("Sección:");
		lblSeccion.setBounds(20, 81, 61, 16);
		frame.getContentPane().add(lblSeccion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(142, 77, 130, 27);
		frame.getContentPane().add(comboBox);
		
		JLabel lblRangoPrecio = new JLabel("Rango de precio:");
		lblRangoPrecio.setBounds(20, 166, 115, 16);
		frame.getContentPane().add(lblRangoPrecio);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(142, 162, 130, 27);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnBusqueda2 = new JButton("Buscar producto");
		btnBusqueda2.setBounds(201, 220, 146, 29);
		frame.getContentPane().add(btnBusqueda2);
	}
}
