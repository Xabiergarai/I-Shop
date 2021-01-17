package ventanasPrincipales;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaTransaccion extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTransaccion window = new VentanaTransaccion();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel pCentral;
	public VentanaTransaccion() {
		setBounds(800,300,400,100);
		setTitle("Espera unos segundos mientras se realiza la transacción");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		pCentral = new JPanel();
		getContentPane().add(pCentral,BorderLayout.CENTER);
		JFrame ventana = this;
		Runnable r = new Runnable() { //objeto ejecutable
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++) {
					JLabel lbl = new JLabel(".");
					lbl.setFont(new Font(Font.SERIF,Font.BOLD, 30));
					pCentral.add(lbl);
					getContentPane().validate();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				ventana.dispose();
				VentanaMenu.main(null);
				JOptionPane.showMessageDialog(null,"Gracias por su compra, la operación se ha realizado con exito");
			}
		};
		Thread t = new Thread(r); //hilo
		t.start();
		setVisible(true);
	}
}
