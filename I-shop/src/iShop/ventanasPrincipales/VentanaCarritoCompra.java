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
		
		JButton btnVaciarCesta = new JButton("Vaciar cesta");
		btnVaciarCesta.setBounds(104, 27, 212, 29);
		frame.getContentPane().add(btnVaciarCesta);
		
		JButton btnGuardarLista = new JButton("Guardar lista");
		btnGuardarLista.setBounds(104, 56, 212, 29);
		frame.getContentPane().add(btnGuardarLista);
		
		JButton btnSeguirComprando = new JButton("Seguir comprando");
		btnSeguirComprando.setBounds(104, 85, 212, 29);
		frame.getContentPane().add(btnSeguirComprando);
		
		JLabel lblPremium = new JLabel("* Con I-ShoPremium puedes benificiarte de gastos");
		lblPremium.setBounds(28, 126, 352, 29);
		frame.getContentPane().add(lblPremium);
		
		JLabel lblEnvioGratis = new JLabel("de envio GRATIS!");
		lblEnvioGratis.setBounds(28, 153, 130, 16);
		frame.getContentPane().add(lblEnvioGratis);
		
		JCheckBox chckbxContratoTarifa = new JCheckBox("Contratar tarifa premium");
		chckbxContratoTarifa.setBounds(20, 179, 188, 23);
		frame.getContentPane().add(chckbxContratoTarifa);
		
		JLabel lblTotal = new JLabel("TOTAL:   999,99");
		lblTotal.setBounds(20, 215, 360, 16);
		frame.getContentPane().add(lblTotal);
		
		JButton btnRealizarPedido = new JButton("REALIZAR PEDIDO");
		btnRealizarPedido.setBackground(Color.YELLOW);
		btnRealizarPedido.setBounds(104, 243, 188, 29);
		frame.getContentPane().add(btnRealizarPedido);
		
		JLabel lblFormasDePago = new JLabel("Formas de pago");
		lblFormasDePago.setBounds(28, 313, 108, 16);
		frame.getContentPane().add(lblFormasDePago);
		
		JCheckBox chckbxVisa = new JCheckBox("VISA");
		chckbxVisa.setBounds(20, 353, 83, 23);
		frame.getContentPane().add(chckbxVisa);
		
		JCheckBox chckbxMaterCard = new JCheckBox("MasterCard");
		chckbxMaterCard.setBounds(113, 353, 119, 23);
		frame.getContentPane().add(chckbxMaterCard);
		
		JCheckBox chckbxPayPal= new JCheckBox("PayPal");
		chckbxPayPal.setBounds(244, 353, 97, 23);
		frame.getContentPane().add(chckbxPayPal);
	}
}
