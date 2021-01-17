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

import tienda.Audio;
import tienda.Producto;
import ventanasPrincipales.VentanaLogin;

public class VentanaAniadirAudio extends JFrame{
	private JTextField txtNombre,txtPotencia,txtPrecio,txtFoto,txtMarca,txtDescripcion,txtCategoria,txtEntrada;
	private JLabel lblNombre,lblPotencia,lblBluetooth,lblPrecio,lblRutaFoto,lblMarca,lblDescripcion,lblCategoria,lblEntrada;
	private JComboBox<String> cbBluetooth; //Desplegable con SI ï¿½ NO
	private JPanel pSur,pCentro;
	private JButton btnInsertar,btnActualizarFichero,btnVolverAlMenu;
	
	public VentanaAniadirAudio() {
		super();
		JFrame ventana = this;
		setBounds(800, 300, 400, 200); //Le damos las dimensiones a la ventana
		setTitle("Aï¿½ade un producto a la tienda"); //Le asignamos un tï¿½tulo a la ventana
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		lblNombre = new JLabel("Introduce el nombre");
		txtNombre = new JTextField(50);
		lblMarca = new JLabel("Introduce la marca");
		txtMarca = new JTextField(50);
		lblDescripcion = new JLabel("Introduce una descripcion");
		txtDescripcion = new JTextField(50);
		lblCategoria = new JLabel("Introduce la categoria");
		txtCategoria = new JTextField(50);
		lblEntrada = new JLabel("Introduce la entrada");
		txtEntrada = new JTextField(50);
		lblPotencia = new JLabel("Introduce la potencia");
		txtPotencia = new JTextField(50);
		lblBluetooth = new JLabel("¿Tiene bluetooth?");
		String [] opciones = {"SI","NO"}; //Creamos las opciones del desplegable
		cbBluetooth = new JComboBox<String>(opciones); //Creamos el desplegable con las opciones que queremos que apaerzcan
		lblPrecio = new JLabel("Introduce el precio del producto");
		txtPrecio = new JTextField(50);
		lblRutaFoto = new JLabel("Introduce la ruta de la foto");
		txtFoto = new JTextField(50);
		pCentro = new JPanel(new GridLayout(5,2));
		pCentro.add(lblNombre);
		pCentro.add(txtNombre);
		pCentro.add(lblMarca);
		pCentro.add(txtMarca);
		pCentro.add(lblDescripcion);
		pCentro.add(txtDescripcion);
		pCentro.add(lblCategoria);
		pCentro.add(txtCategoria);
		pCentro.add(lblEntrada);
		pCentro.add(txtEntrada);
		pCentro.add(lblPotencia);
		pCentro.add(txtPotencia);
		pCentro.add(lblBluetooth);
		pCentro.add(cbBluetooth);
		pCentro.add(lblPrecio);
		pCentro.add(txtPrecio);
		pCentro.add(lblRutaFoto);
		pCentro.add(txtFoto);
		getContentPane().add(pCentro,BorderLayout.CENTER);
		
		pSur = new JPanel();
		btnInsertar = new JButton("Guardar datos");
		btnActualizarFichero = new JButton("Actualizar datos");
		btnVolverAlMenu = new JButton("Volver al menu");
		pSur.add(btnInsertar);
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
		
		btnInsertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nombre = txtNombre.getText();
				String marca = txtMarca.getText();
				String descripcion = txtDescripcion.getText();
				String categoria = txtCategoria.getText();
				String entrada = txtEntrada.getText();
				String potencia = txtPotencia.getText();
				String bluetooth = (String) cbBluetooth.getSelectedItem();
				String precio = txtPrecio.getText();
				System.out.println(txtFoto.getText());
				String ruta = "img/"+txtFoto.getText();
				boolean bl;
				if(bluetooth.compareTo("SI")==0)
					bl=true;
				else
					bl=false;
				Audio a = new Audio(nombre, marca, Double.parseDouble(precio), descripcion, categoria, ruta, entrada, Integer.parseInt(potencia), bl);
				System.out.println(a);
				VentanaLogin.contenedora.getListaProductos().add(a);		
			}
		});
		
		btnActualizarFichero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				for(Producto p: VentanaLogin.contenedora.getListaProductos())
					System.out.println(p);
				VentanaLogin.contenedora.guardarListaProductosEnFichero();
				
			}
		});
		setVisible(true);
	}
}
