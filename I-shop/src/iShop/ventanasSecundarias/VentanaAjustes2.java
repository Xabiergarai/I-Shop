package iShop.ventanasSecundarias;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaAjustes2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAjustes2 window = new VentanaAjustes2();
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
	public VentanaAjustes2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 300, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Privacidad");
		lblNewLabel.setBounds(25, 24, 110, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Antigua contraseña");
		lblNewLabel_1.setBounds(25, 63, 137, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(22, 85, 165, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nueva contraseña");
		lblNewLabel_2.setBounds(25, 122, 137, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(25, 150, 162, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Repetir contraeña");
		lblNewLabel_3.setBounds(25, 188, 137, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(25, 216, 155, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Seguridad");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(25, 266, 87, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("- Utiliza 6 caracteres o mas");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(25, 293, 181, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("- Este cambio puede tardar ");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(25, 310, 175, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("hasta 1 minuto en ser valido");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(35, 325, 186, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		btnNewButton = new JButton("Guardar cambios");
		btnNewButton.setBounds(268, 332, 137, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
