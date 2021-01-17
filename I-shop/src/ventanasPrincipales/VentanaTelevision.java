package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import dataBase.BD;
import dataBase.DBException;
import tienda.ListaProducto;
import tienda.Television;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.*;

import javax.swing.*;

public class VentanaTelevision {

	private JFrame frame;
	private ListaProducto productos;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTelevision window = new VentanaTelevision();
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
	public VentanaTelevision() {
		productos = new ListaProducto();
		initialize();
	}
	public VentanaTelevision(ListaProducto productos) {
		this.productos = productos;
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
private void initialize() {
frame = new JFrame();
frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
frame.setBounds(100, 100, 600, 650);
frame.setTitle("Ishop");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

ArrayList<Television> televisiones = new ArrayList<Television>();
try {
	televisiones = BD.listarTelevisiones();
} catch (DBException e1) {
	e1.printStackTrace();
}

JPanel televisionesPanel = new JPanel(new FlowLayout());
for (Television t : televisiones) {
	JPanel televisionPanel = productoPanel(t);
	televisionesPanel.add(televisionPanel);
}
televisionesPanel.setBounds(50,100,500,900);
JScrollPane scrollPane = new JScrollPane(
		televisionesPanel,
		ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
);
frame.getContentPane().add(scrollPane);
frame.getContentPane().add(televisionesPanel);

JMenuBar menuBar = new JMenuBar();
menuBar.setBounds(0, 0, 99, 22);
frame.getContentPane().add(menuBar);

JMenu mnNewMenu = new JMenu("Categorias");
menuBar.add(mnNewMenu);

JMenuItem mntmNewMenuItem_2 = new JMenuItem("Audio");
mntmNewMenuItem_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		VentanaAudio.main(null);
		frame.dispose();
	}
});
mnNewMenu.add(mntmNewMenuItem_2);

JMenuItem mntmNewMenuItem = new JMenuItem("Ordenador");
mntmNewMenuItem.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		VentanaOrdenador.main(null);
		frame.dispose();
	}
});
mnNewMenu.add(mntmNewMenuItem);

JMenuItem mntmNewMenuItem_1 = new JMenuItem("SmartPhone");
mntmNewMenuItem_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		VentanaSmartphone.main(null);
		frame.dispose();
	}
});
mnNewMenu.add(mntmNewMenuItem_1);

JMenuItem mntmNewMenuItem_3 = new JMenuItem("Television");
mntmNewMenuItem_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		VentanaTelevision.main(null);
		frame.dispose();
	}
});
mnNewMenu.add(mntmNewMenuItem_3);

JLabel lblNewLabel_1_1 = new JLabel("Televisiones");
lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
lblNewLabel_1_1.setBounds(194, 34, 178, 43);
frame.getContentPane().add(lblNewLabel_1_1);
}

private JPanel productoPanel(Television t) {
JPanel panel =  new JPanel();
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
panel.setBackground(Color.WHITE);

JLabel lblNewLabel = new JLabel();
lblNewLabel.setBounds(72, 90, 124, 141);
ImageIcon ico1= new ImageIcon(t.getRutaFoto());//meter las rutas en la base de datos
ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
lblNewLabel.setIcon(img1);
lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
panel.add(lblNewLabel);

JLabel lblNewLabel_2 = new JLabel(t.getNombre());
lblNewLabel_2.setBackground(Color.WHITE);
lblNewLabel_2.setToolTipText("");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
panel.add(lblNewLabel_2);

JLabel label = new JLabel(String.valueOf(t.getPrecio()));
label.setFont(new Font("Tahoma", Font.PLAIN, 18));
label.setAlignmentX(Component.CENTER_ALIGNMENT);
panel.add(label);

JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
btnAnadirAlCarrito.setForeground(Color.WHITE);
btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
btnAnadirAlCarrito.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		productos.getProductos().put(
				new Random().nextInt(), t
		);
	}
});
btnAnadirAlCarrito.setAlignmentX(Component.CENTER_ALIGNMENT);
panel.add(btnAnadirAlCarrito);

return panel;
}	
	

}
	



