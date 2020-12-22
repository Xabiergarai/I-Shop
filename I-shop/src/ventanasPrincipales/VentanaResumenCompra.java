package ventanasPrincipales;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import Clases.Articulo;
import Tienda.BD;
import Tienda.Producto;
import Ventanas.VentanaEsperaTransaccion;
import Ventanas.VentanaPrincipal;

public class VentanaResumenCompra extends JFrame {
	private JTextArea ta;
	public VentanaResumenCompra() {
		setBounds(800, 300, 600, 200); //Le damos las dimensiones a la ventana
		setTitle("Resumen de la compra "+ VentanaLogin.txtEmail); //Le asignamos un título a la ventana
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		JPanel pSur = new JPanel();
		JButton btnRealizarPago = new JButton("Realizar pago");
		pSur.add(btnRealizarPago);
		
		JPanel pCentral = new JPanel();
		ta = new JTextArea(4,50);
		cargarResumenEnTextArea();
		JScrollPane scroll = new JScrollPane(ta);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		pCentral.add(scroll);
		
		getContentPane().add(pCentral, BorderLayout.CENTER);
		getContentPane().add(pSur, BorderLayout.SOUTH);
		setVisible(true);
		JFrame ventana = this;
		btnRealizarPago.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VentanaLogin.contenedora.guardarCarritoEnFicheroDeTexto();
				VentanaLogin.contenedora.vaciarCarrito();
				new VentanaTransaccion();
				
				ventana.dispose();
			}
		});
		
	}
	
	private void cargarResumenEnTextArea() {
		String texto="";
		for(Producto p: VentanaLogin.contenedora.getCarrito()) {
			texto = texto + p +"\n";
		}
		ta.setText(texto);
	}
}
