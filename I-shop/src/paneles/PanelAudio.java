package paneles;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tienda.Audio;
import ventanasPrincipales.VentanaLogin;

public class PanelAudio extends JPanel{
	private JPanel pSur,pCentro,pIzquierda,pDerecha;
	private JButton btnAnyadir,btnFavoritos;
	private JLabel lblFoto,lblNombre,lblCategoria,lblDescripcion,lblPrecio,lblMarca,lblEntrada,lblPotencia,lblBluetooth;
	private JFrame ventana;
	public PanelAudio(Audio a, JFrame v) {
		super();
		ventana = v;
		setLayout(new BorderLayout());
		pSur = new JPanel();
		btnFavoritos = new JButton("Lista de deseos");
		pSur.add(btnFavoritos);
		btnAnyadir = new JButton("Anadir al carrito");
		pSur.add(btnAnyadir);
		
		pCentro = new JPanel(new GridLayout(1,2));
		pIzquierda = new JPanel();
		
		lblFoto = new JLabel();
		lblFoto.setSize(150,205);
		ImageIcon im = new ImageIcon(a.getRutaFoto());
		ImageIcon imagenConDimensiones = new ImageIcon(im.getImage().getScaledInstance(lblFoto.getWidth(),lblFoto.getHeight(),Image.SCALE_DEFAULT));
		lblFoto.setIcon(imagenConDimensiones);
		pIzquierda.add(lblFoto);
		pCentro.add(pIzquierda);
		
		pDerecha = new JPanel(new GridLayout(5,1));
		lblNombre = new JLabel(a.getNombre());
		lblMarca = new JLabel(a.getMarca());
		lblPotencia =  new JLabel("Potencia: "+ String.valueOf(a.getPotencia()) + " Hz");
		if(a.isBluetooth() == true)
			lblBluetooth =  new JLabel("El producto tiene bluetooth");
		else
			lblBluetooth = new JLabel("El producto no tiene bluetooth");
		lblPrecio =  new JLabel("Precio de compra: "+String.valueOf(a.getPrecio())+ " $");
		pDerecha.add(lblNombre);
		pDerecha.add(lblMarca);
		pDerecha.add(lblPotencia);
		pDerecha.add(lblBluetooth);
		pDerecha.add(lblPrecio);
		pCentro.add(pDerecha);
		
		btnFavoritos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VentanaLogin.contenedora.aniadirProductoAFavoritos(a);
				JOptionPane.showMessageDialog(null, "El producto ha sido añadido a la lista de deseos con exito");
			}
		});
		
		btnAnyadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VentanaLogin.contenedora.aniadirProductoAlCarrito(a);
				JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito con exito");
			}
		});
		
		add(pCentro, BorderLayout.CENTER);
		add(pSur,BorderLayout.SOUTH);	
	}
}
