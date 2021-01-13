package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;

public class VentanaCarritoCompra {

	private JFrame frame;
	private JTable carritoTabla;
	private DefaultTableModel carritoModeloTabla;
	

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
		initTableModel();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ishop");
		frame.getContentPane().setLayout(null);
		
		JButton btnVaciarCesta = new JButton("Vaciar cesta");
		btnVaciarCesta.setBounds(90, 349, 212, 29);
		frame.getContentPane().add(btnVaciarCesta);
				
		JButton btnGuardarLista = new JButton("Guardar lista");
		btnGuardarLista.setBounds(90, 378, 212, 29);
		frame.getContentPane().add(btnGuardarLista);
		
		JButton btnSeguirComprando = new JButton("Seguir comprando");
		btnSeguirComprando.setBounds(90, 407, 212, 29);
		frame.getContentPane().add(btnSeguirComprando);
		
		JLabel lblPremium = new JLabel("* Con I-ShoPremium puedes benificiarte de gastos");
		lblPremium.setBounds(14, 448, 352, 29);
		frame.getContentPane().add(lblPremium);
		
		JLabel lblEnvioGratis = new JLabel("de envio GRATIS!");
		lblEnvioGratis.setBounds(14, 475, 130, 16);
		frame.getContentPane().add(lblEnvioGratis);
		
		JCheckBox chckbxContratoTarifa = new JCheckBox("Contratar tarifa premium");
		chckbxContratoTarifa.setBounds(14, 498, 188, 23);
		frame.getContentPane().add(chckbxContratoTarifa);
		
		JLabel lblTotal = new JLabel("TOTAL:   999,99");
		lblTotal.setBounds(14, 527, 360, 16);
		frame.getContentPane().add(lblTotal);
		
		JButton btnRealizarPedido = new JButton("REALIZAR PEDIDO");
		btnRealizarPedido.setBackground(Color.YELLOW);
		btnRealizarPedido.setBounds(98, 555, 188, 29);
		frame.getContentPane().add(btnRealizarPedido);
		
		JLabel lblFormasDePago = new JLabel("Formas de pago");
		lblFormasDePago.setBounds(22, 625, 108, 16);
		frame.getContentPane().add(lblFormasDePago);
		
		JRadioButton radiobtVisa = new JRadioButton("VISA");
		radiobtVisa.setBounds(14, 665, 83, 23);
		frame.getContentPane().add(radiobtVisa);
		
		JRadioButton radiobtMaterCard = new JRadioButton("MasterCard");
		radiobtMaterCard.setBounds(107, 665, 119, 23);
		frame.getContentPane().add(radiobtMaterCard);
		
		JRadioButton radiobtPayPal= new JRadioButton("PayPal");
		radiobtPayPal.setBounds(238, 665, 97, 23);
		frame.getContentPane().add(radiobtPayPal);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(radiobtVisa);
		grupo1.add(radiobtMaterCard);
		grupo1.add(radiobtPayPal);
		
		carritoTabla = new JTable();
		carritoTabla.setBounds(10, 81, 360, 241);
		carritoTabla.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		frame.getContentPane().add(carritoTabla);
		
		//JScrollPane js = new JScrollPane(carritoTabla);
		//frame.getContentPane().add(js);
		
		
		
		JLabel lblNewLabel = new JLabel("Resumen Compra");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		lblNewLabel.setBounds(35, 27, 310, 43);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
	private void initTableModel() {
		carritoModeloTabla = new DefaultTableModel();
		carritoModeloTabla.addColumn("Imagen");
		carritoModeloTabla.addColumn("Nombre");
		carritoModeloTabla.addColumn("Marca");
		carritoModeloTabla.addColumn("Categoria");
		carritoModeloTabla.addColumn("Precio");
		
	}
}
