package administrador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import ventanasPrincipales.VentanaLogin;

public class VentanaAdministrador extends JFrame {
	JPanel panelCentral,panelSur,panelNorte;;
	JRadioButton rbtnAudio,rbtnOrdenador,rbtnSmartphone,rbtnTelevision;
	JButton btnAniadir,btnEliminar,btnSalir;
	JFrame ventanaActual;
	JLabel lblTitulo;
	public VentanaAdministrador(JFrame va) {
		super();
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//ventanaAnterior = va; //Para volver a la ventana desde la que se llamï¿½ a esta
		ventanaActual = this; //ventana guarda la venta es curso
		setBounds(800, 300, 500, 300); //Le damos las dimensiones a la ventana
		setTitle("Bienvenido Administrador, ¿Que operacion desea realizar?"); //Le asignamos un tï¿½tulo a la ventana
		panelCentral = new JPanel(new GridLayout(2, 1));//Creamos un panel con 2 filas
		panelNorte = new JPanel();
		lblTitulo = new JLabel("Zona de Administrador");
		panelNorte.add(lblTitulo);
		getContentPane().add(panelNorte,BorderLayout.NORTH);
		panelNorte.setBackground(Color.GREEN);
		lblTitulo.setForeground(Color.BLACK);
		/*Creamos 2 RadioButton*/
		rbtnAudio = new JRadioButton("Audio", true);
		rbtnOrdenador = new JRadioButton("Ordenadores", false);
		rbtnSmartphone = new JRadioButton("Smartphones", false);
		rbtnTelevision = new JRadioButton("Television", false);
		/*Los aï¿½adimos a un grupo para que sï¿½lo pueda estar seleccionado uno de ellos*/
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbtnAudio);
		grupo.add(rbtnOrdenador);
		grupo.add(rbtnSmartphone);
		grupo.add(rbtnTelevision);
		/*Aï¿½adimos los 2 radio button al panel con las 2 filas*/
		panelCentral.add(rbtnAudio);
		panelCentral.add(rbtnOrdenador);
		panelCentral.add(rbtnSmartphone);
		panelCentral.add(rbtnTelevision);
		
		panelSur = new JPanel();
		btnAniadir = new JButton("Aniadir");
		btnEliminar = new JButton("Eliminar");
		btnSalir = new JButton("Cerrar Sesion");
		panelSur.add(btnAniadir);
		panelSur.add(btnEliminar);
		panelSur.add(btnSalir);
		
		getContentPane().add(panelCentral,BorderLayout.CENTER);
		getContentPane().add(panelSur,BorderLayout.SOUTH);
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ventanaActual.dispose(); //Cierra la ventana en curso
				new VentanaLogin(); //Abre la ventana anterior
			}
		});
		
		btnAniadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(rbtnAudio.isSelected()) {
					new VentanaAniadirAudio();
				}
			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(rbtnAudio.isSelected()) {
					new VentanaEliminarAudio();
				}
			}
		});			
		
		setVisible(true);
	}
}
