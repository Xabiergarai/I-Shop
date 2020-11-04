package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Color;

public class VentanaCarritoCompra {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCarritoCompra window = new VentanaCarritoCompra();
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
	public VentanaCarritoCompra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Vaciar cesta");
		btnNewButton.setBounds(104, 27, 212, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar lista");
		btnNewButton_1.setBounds(104, 56, 212, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Seguir comprando");
		btnNewButton_2.setBounds(104, 85, 212, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("* Con I-ShoPremium puedes benificiarte de gastos");
		lblNewLabel.setBounds(28, 126, 352, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("de envio GRATIS!");
		lblNewLabel_1.setBounds(28, 153, 130, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Contratar tarifa premium");
		chckbxNewCheckBox.setBounds(20, 179, 188, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL:   999,99");
		lblNewLabel_2.setBounds(20, 215, 360, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("REALIZAR PEDIDO");
		btnNewButton_3.setBackground(Color.YELLOW);
		btnNewButton_3.setBounds(104, 243, 188, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Formas de pago");
		lblNewLabel_3.setBounds(28, 313, 108, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("VISA");
		chckbxNewCheckBox_1.setBounds(20, 353, 83, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("MasterCard");
		chckbxNewCheckBox_2.setBounds(113, 353, 119, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("PayPal");
		chckbxNewCheckBox_3.setBounds(244, 353, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);
	}
}
