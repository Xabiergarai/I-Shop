package ventanasPrincipales;

import tienda.ListaProducto;
import tienda.Producto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaCarritoCompra {

	private JFrame frame;
	private JPanel tablePanel;
	private JTable carritoTabla;
	private DefaultTableModel carritoModeloTabla;
	private JLabel lblTotal;
	private double precioTotal;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCarritoCompra window = new VentanaCarritoCompra(null);
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
	public VentanaCarritoCompra(ListaProducto productos) {
		this.precioTotal = 0;
		initTablePanel();
		initialize();
	}

	private void initTablePanel() {
		tablePanel = new JPanel(new GridLayout());
	    tablePanel.setBounds(10, 81, 360, 241);

		initTableModel();

		carritoTabla = new JTable();
		carritoTabla.setModel(carritoModeloTabla);
		tablePanel.add(carritoTabla);

		JScrollPane js = new JScrollPane(carritoTabla);
		tablePanel.add(js);
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
		btnVaciarCesta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		frame.getContentPane().add(btnVaciarCesta);
				
		JButton btnGuardarLista = new JButton("Guardar lista");
		btnGuardarLista.setBounds(90, 378, 212, 29);
		frame.getContentPane().add(btnGuardarLista);
		
		JButton btnSeguirComprando = new JButton("Seguir comprando");
		btnSeguirComprando.setBounds(90, 407, 212, 29);
		frame.getContentPane().add(btnSeguirComprando);
		btnSeguirComprando.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaMenu.main(null);
				frame.dispose();
			}
		});
		
		JLabel lblPremium = new JLabel("* Con I-ShoPremium puedes benificiarte de gastos");
		lblPremium.setBounds(14, 448, 352, 29);
		frame.getContentPane().add(lblPremium);
		
		JLabel lblEnvioGratis = new JLabel("de envio GRATIS!");
		lblEnvioGratis.setBounds(14, 475, 130, 16);
		frame.getContentPane().add(lblEnvioGratis);
		
		JCheckBox chckbxContratoTarifa = new JCheckBox("Contratar tarifa premium");
		chckbxContratoTarifa.setBounds(14, 498, 188, 23);
		frame.getContentPane().add(chckbxContratoTarifa);
		
		lblTotal = new JLabel();
		updatePrecioTotal();
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

		frame.getContentPane().add(tablePanel);

		JLabel lblNewLabel = new JLabel("Resumen Compra");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		lblNewLabel.setBounds(63, 28, 261, 43);
		frame.getContentPane().add(lblNewLabel);
	}

	private void initTableModel() {
		carritoModeloTabla = new DefaultTableModel();
		carritoModeloTabla.addColumn("Nombre");
		carritoModeloTabla.addColumn("Marca");
		carritoModeloTabla.addColumn("Categoria");
		carritoModeloTabla.addColumn("Precio");
		
	}

	public void setTableContent(List<Producto> productos) {
		clear();
		for (Producto producto: productos) {
			this.carritoModeloTabla.addRow(new Object[] {
					producto.getNombre(),
					producto.getMarca(),
					producto.getCategoria(),
					producto.getPrecio(),
			});
			precioTotal += producto.getPrecio();
		}
		updatePrecioTotal();
	}

	public void clear() {
	    this.precioTotal = 0;
		this.carritoModeloTabla.setRowCount(0);
		updatePrecioTotal();
	}

	private void updatePrecioTotal() {
		this.lblTotal.setText("TOTAL:   "+this.precioTotal+" Euros");
	}
}
