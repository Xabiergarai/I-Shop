package ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class VentanaOrdenador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOrdenador window = new VentanaOrdenador();
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
	public VentanaOrdenador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		JScrollPane scroll = new JScrollPane(panel);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(panel);

		
		/*PanelProducto pp1 = PanelProducto("Ordenador");
		panel.add(pp1);
		
		PanelProducto pp2 = PanelProducto("Audio");
		panel.add(pp2);
		
		PanelProducto pp3 = PanelProducto("Smartphone");
		panel.add(pp3);
		
		
		
		
		frame.getContentPane().add(scroll);
		//frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(72, 90, 124, 141);
		//frame.getContentPane().add(lblNewLabel);
		panel.add(lblNewLabel);
		
		JLabel lblSeccion = new JLabel("Ordenadores");
		lblSeccion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSeccion.setBounds(42, 18, 154, 43);
		//frame.getContentPane().add(lblNewLabel_1);
		panel.add(lblSeccion);
		
		ImageIcon ico1= new ImageIcon("img/1539-honor-magicbook-14-amd-ryzen-5-3500u-8gb-256gb-ssd-14.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel.setIcon(img1);
        
        JLabel lblRuta = new JLabel("<html>Lenovo IdeaPad 3 15ADA05 AMD\r\n3020e/8GB/256GB SSD/15.6\"<html>" );
        lblRuta.setBackground(Color.WHITE);
        lblRuta.setToolTipText("");
        lblRuta.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblRuta.setBounds(77, 234, 139, 107);
        //frame.getContentPane().add(lblNewLabel_2);
        panel.add(lblRuta);
        
        JLabel lblPrecioP1 = new JLabel("379 eur");
        lblPrecioP1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPrecioP1.setBounds(57, 342, 124, 43);
        //frame.getContentPane().add(label);
        panel.add(lblPrecioP1);
        
        JButton btnAnadirAlCarrito = new JButton("Agregar al carrito");
        btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito.setForeground(Color.WHITE);
        btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito.setBounds(57, 419, 139, 43);
        //frame.getContentPane().add(btnAnadirAlCarrito);
        panel.add(btnAnadirAlCarrito);

		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setBounds(301, 90, 150, 141);
        //frame.getContentPane().add(lblNewLabel_3);
        panel.add(lblNewLabel_3);
        
        ImageIcon ico2= new ImageIcon("img/Portatil.jpg");
        ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_3.setIcon(img2);
        
        JLabel lblRuta2 = new JLabel("<html>HP 255 G7 AMD Ryzen 5 3500U/8GB/256 GB SSD/15.6\"<html>");
        lblRuta2.setToolTipText("");
        lblRuta2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblRuta2.setBackground(Color.WHITE);
        lblRuta2.setBounds(291, 234, 139, 107);
        //frame.getContentPane().add(lblNewLabel_2_1);
        panel.add(lblRuta2);
        
        JLabel lblPrecio2 = new JLabel("559 eur");
        lblPrecio2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPrecio2.setBounds(291, 342, 124, 43);
        //frame.getContentPane().add(label_1);
        panel.add(lblPrecio2);
        
        JButton btnAnadirAlCarrito_1 = new JButton("Agregar al carrito");
        btnAnadirAlCarrito_1.setForeground(Color.WHITE);
        btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_1.setBounds(291, 419, 139, 43);
        //frame.getContentPane().add(btnAnadirAlCarrito_1);
        panel.add(btnAnadirAlCarrito_1);
        
        btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblNewLabel_4 = new JLabel("New label");
        lblNewLabel_4.setBounds(72, 526, 154, 93);
        //frame.getContentPane().add(lblNewLabel_4);
        panel.add(lblNewLabel_4);
        
        ImageIcon ico3= new ImageIcon("img/pc3.jpg");
        ImageIcon img3= new ImageIcon(ico3.getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_4.setIcon(img3);
        
        JLabel lblRuta3 = new JLabel("<html>Apple MacBook Pro Intel Core i5/8GB/512GB SSD/13.3\" Gris Espacial<html>");
        lblRuta3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblRuta3.setBounds(57, 630, 139, 60);
        //frame.getContentPane().add(lblNewLabel_5);
        panel.add(lblRuta3);
        
        JLabel lblPrecio3 = new JLabel("1499 eur");
        lblPrecio3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPrecio3.setBounds(57, 718, 119, 16);
        //frame.getContentPane().add(lblNewLabel_6);
        panel.add(lblPrecio3);
        
        JButton btnAnadirAlCarrito_2 = new JButton("Agregar al carrito");
        btnAnadirAlCarrito_2.setForeground(Color.WHITE);
        btnAnadirAlCarrito_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_2.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_2.setBounds(57, 759, 139, 43);
        //frame.getContentPane().add(btnAnadirAlCarrito_2);
        panel.add(btnAnadirAlCarrito_2);
        
        btnAnadirAlCarrito_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JButton btnAnadirAlCarrito_3 = new JButton("Agregar al carrito");
        btnAnadirAlCarrito_3.setForeground(Color.WHITE);
        btnAnadirAlCarrito_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_3.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_3.setBounds(301, 759, 139, 43);
        //frame.getContentPane().add(btnAnadirAlCarrito_2_1);
        panel.add(btnAnadirAlCarrito_3);
        
        btnAnadirAlCarrito_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblNewLabel_7 = new JLabel("New label");
        lblNewLabel_7.setBounds(301, 526, 154, 93);
        //frame.getContentPane().add(lblNewLabel_7);
        panel.add(lblNewLabel_7);
        
        ImageIcon ico4= new ImageIcon("img/pc4.jpg");
        ImageIcon img4= new ImageIcon(ico4.getImage().getScaledInstance(lblNewLabel_7.getWidth(), lblNewLabel_7.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_7.setIcon(img4);
        
      
        JLabel lblRuta4 = new JLabel("<html>Asus Tuf Gaming A15 AMD Ryzen 7 4800H/16GB/1TB SSD/GTX 1650Ti/15.6\"<html>");
        lblRuta4.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblRuta4.setBounds(301, 630, 124, 77);
        //frame.getContentPane().add(lblNewLabel_8);
        panel.add(lblRuta4);
        
        JLabel lblPrecio4 = new JLabel("1199 eur");
        lblPrecio4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPrecio4.setBounds(309, 718, 93, 16);
        //frame.getContentPane().add(lblNewLabel_9);
        panel.add(lblPrecio4);
        
        /*JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(559, -38, 15, 920);
        frame.getContentPane().add(scrollBar);*/	
        
        JButton btnFav = new JButton("Fav");
        btnFav.setHorizontalTextPosition(SwingConstants.CENTER);
        btnFav.setBounds(198, 419, 53, 43);
        //frame.getContentPane().add(btnFav);
        panel.add(btnFav);
        
        btnFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav2 = new JButton("Fav");
        btnFav2.setBounds(431, 419, 53, 43);
        //frame.getContentPane().add(btnFav2);
        panel.add(btnFav2);
        
        btnFav2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav3 = new JButton("Fav");
        btnFav3.setBounds(198, 759, 53, 43);
        //frame.getContentPane().add(btnFav3);
        panel.add(btnFav3);
        
        btnFav3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
        JButton btnFav4 = new JButton("Fav");
        btnFav4.setBounds(442, 759, 53, 43);
        //frame.getContentPane().add(btnFav4);
        panel.add(btnFav4);
        
        btnFav4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFavoritos.main(null);
				frame.dispose();
			}
		});
        
	}

	private PanelProducto PanelProducto(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
