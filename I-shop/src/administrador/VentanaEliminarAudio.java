package administrador;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import paneles.PanelEliminarAudio;
import tienda.Audio;
import tienda.Producto;
import ventanasPrincipales.VentanaLogin;

public class VentanaEliminarAudio extends JFrame {
	private JTextField txtNombre,txtPotencia,txtPrecio,txtFoto,txtMarca,txtDescripcion,txtCategoria,txtEntrada;
	private JLabel lblNombre,lblPotencia,lblBluetooth,lblPrecio,lblRutaFoto,lblMarca,lblDescripcion,lblCategoria,lblEntrada;
	private JPanel pSur,pCentro;
	private JButton btnInsertar,btnActualizarFichero,btnVolverAlMenu;
	private JFrame ventana, ventanaAnterior;
	
	public void cargarFotos() {
		int i = 0;
		for(Producto p: VentanaLogin.contenedora.getListaProductos()) {
			if(p instanceof Audio) {
				PanelEliminarAudio panel = new PanelEliminarAudio((Audio) p,ventana, i);
				pCentro.add(panel);
			}
			i++;
		}
	}	
	
	public VentanaEliminarAudio() {
		super();
		ventana = this;
		setBounds(800, 300, 800, 400); //Le damos las dimensiones a la ventana
		setTitle("Selecciona el producto que desea eliminar"); //Le asignamos un título a la ventana
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		pCentro = new JPanel();
		getContentPane().add(pCentro, BorderLayout.CENTER);
		cargarFotos();
		pSur = new JPanel();
		btnActualizarFichero = new JButton("Actualizar datos");
		btnVolverAlMenu = new JButton("Volver al menu");
		pSur.add(btnActualizarFichero);
		pSur.add(btnVolverAlMenu);
		getContentPane().add(pSur, BorderLayout.SOUTH);
		
		btnVolverAlMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ventana.dispose();
			}
		});
		

		btnActualizarFichero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				for(Producto p: VentanaLogin.contenedora.getListaProductos())
					System.out.println(p);
				VentanaLogin.contenedora.guardarListaProductosEnFichero();
				pCentro.removeAll();
				cargarFotos();
				validate();
				repaint();
			}
		});	
		
				
		setVisible(true);
	}
}
