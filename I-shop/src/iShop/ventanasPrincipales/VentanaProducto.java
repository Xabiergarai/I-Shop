package iShop.ventanasPrincipales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;

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
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 72, 124, 141);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PCs");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(10, 11, 139, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		ImageIcon ico1= new ImageIcon("I-shop/img/1539-honor-magicbook-14-amd-ryzen-5-3500u-8gb-256gb-ssd-14.jpg");
        ImageIcon img1= new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
        lblNewLabel.setIcon(img1);
        
        JLabel lblNewLabel_2 = new JLabel("Lenovo IdeaPad 3 15ADA05 AMD\r\n3020e/8GB/256GB SSD/15.6\"");
        lblNewLabel_2.setBackground(Color.WHITE);
        lblNewLabel_2.setToolTipText("");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(10, 188, 139, 107);
        frame.getContentPane().add(lblNewLabel_2);
        
        JLabel label = new JLabel("379\u20AC");
        label.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label.setBounds(10, 270, 124, 43);
        frame.getContentPane().add(label);
	}
}
