package ventanasSecundarias;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class VentanaFacturacion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFacturacion window = new VentanaFacturacion();
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
	public VentanaFacturacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos personales y direccion de envio");
		lblNewLabel.setBounds(25, 63, 239, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JEditorPane dtrpnAadirDireccion = new JEditorPane();
		dtrpnAadirDireccion.setText("Aniadir direccion");
		dtrpnAadirDireccion.setBounds(25, 89, 130, 16);
		frame.getContentPane().add(dtrpnAadirDireccion);
		
		JLabel lblNewLabel_1 = new JLabel("Facturacion");
		lblNewLabel_1.setBounds(25, 19, 111, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Datos de facturacion");
		lblNewLabel_2.setBounds(25, 129, 154, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JEditorPane dtrpnAadirDireccion_1 = new JEditorPane();
		dtrpnAadirDireccion_1.setText("Aniadir direccion");
		dtrpnAadirDireccion_1.setBounds(25, 154, 130, 16);
		frame.getContentPane().add(dtrpnAadirDireccion_1);
		
		JLabel lblNewLabel_3 = new JLabel("Configuracion Newsletter");
		lblNewLabel_3.setBounds(25, 189, 173, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Suscrito a boletines");
		rdbtnNewRadioButton.setBounds(25, 217, 173, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("Guardar cambios");
		btnNewButton.setBounds(254, 271, 138, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
