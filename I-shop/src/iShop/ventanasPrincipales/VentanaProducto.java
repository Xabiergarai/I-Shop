package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaProducto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProducto window = new VentanaProducto();
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
	public VentanaProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(57, 72, 124, 141);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PCs");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(29, 11, 139, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		ImageIcon ico1= new ImageIcon("img/1539-honor-magicbook-14-amd-ryzen-5-3500u-8gb-256gb-ssd-14.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel.setIcon(img1);
        
        JLabel lblNewLabel_2 = new JLabel("Lenovo IdeaPad 3 15ADA05 AMD\r\n3020e/8GB/256GB SSD/15.6\"");
        lblNewLabel_2.setBackground(Color.WHITE);
        lblNewLabel_2.setToolTipText("");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(57, 188, 139, 107);
        frame.getContentPane().add(lblNewLabel_2);
        
        JLabel label = new JLabel("379\u20AC");
        label.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label.setBounds(57, 270, 124, 43);
        frame.getContentPane().add(label);
        
        JButton btnAnadirAlCarrito = new JButton("A\u00F1adir al carrito");
        btnAnadirAlCarrito.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito.setForeground(Color.WHITE);
        btnAnadirAlCarrito.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito.setBounds(57, 312, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito);
        

		btnAnadirAlCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setBounds(291, 72, 124, 141);
        frame.getContentPane().add(lblNewLabel_3);
        
        ImageIcon ico2= new ImageIcon("img/Portatil.jpg");
        ImageIcon img2= new ImageIcon(ico2.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel_3.setIcon(img2);
        
        JLabel lblNewLabel_2_1 = new JLabel("HP 255 G7 AMD Ryzen 5 3500U/8GB/256 GB SSD/15.6\"");
        lblNewLabel_2_1.setToolTipText("");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_1.setBackground(Color.WHITE);
        lblNewLabel_2_1.setBounds(291, 188, 139, 107);
        frame.getContentPane().add(lblNewLabel_2_1);
        
        JLabel label_1 = new JLabel("559\u20AC");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label_1.setBounds(291, 270, 124, 43);
        frame.getContentPane().add(label_1);
        
        JButton btnAnadirAlCarrito_1 = new JButton("A\u00F1adir al carrito");
        btnAnadirAlCarrito_1.setForeground(Color.WHITE);
        btnAnadirAlCarrito_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAnadirAlCarrito_1.setBackground(new Color(255, 165, 0));
        btnAnadirAlCarrito_1.setBounds(291, 312, 139, 43);
        frame.getContentPane().add(btnAnadirAlCarrito_1);
        

		btnAnadirAlCarrito_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCarritoCompra.main(null);
				frame.dispose();
			}
		});
	}
}
