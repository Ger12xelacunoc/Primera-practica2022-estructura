package frente;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import atras.ManejoApuestas;
import atras.Resultado;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class IngresarResultado extends JFrame implements ActionListener {
	
	public static final String RESULTADO = "RESULTADO";

	private JPanel contentPane;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JButton btnIngresarResultado;
	
	ManejoApuestas apuestas = new ManejoApuestas();
	Ventana ventana;
	public IngresarResultado(ManejoApuestas apuestas, Ventana ventana) {
		this();
		this.apuestas=apuestas;
		this.ventana=ventana;
	}

	/**
	 * Create the frame.
	 */
	public IngresarResultado() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 314, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese la posiciones de los caballos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(22, 62, 237, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblPrimerLuagar = new JLabel("Primer Lugar");
		lblPrimerLuagar.setBounds(44, 116, 87, 14);
		contentPane.add(lblPrimerLuagar);
		
		JLabel lblSegundoLugar = new JLabel("Segundo lugar");
		lblSegundoLugar.setBounds(44, 141, 87, 14);
		contentPane.add(lblSegundoLugar);
		
		JLabel lblTercerLugar = new JLabel("Tercer lugar");
		lblTercerLugar.setBounds(44, 166, 87, 14);
		contentPane.add(lblTercerLugar);
		
		JLabel lblCuartoLugar = new JLabel("Cuarto Lugar");
		lblCuartoLugar.setBounds(44, 191, 87, 14);
		contentPane.add(lblCuartoLugar);
		
		JLabel lblQuintoLugar = new JLabel("Quinto lugar");
		lblQuintoLugar.setBounds(44, 216, 87, 14);
		contentPane.add(lblQuintoLugar);
		
		JLabel lblSextoLugar = new JLabel("Sexto lugar");
		lblSextoLugar.setBounds(44, 241, 87, 14);
		contentPane.add(lblSextoLugar);
		
		JLabel lblSeptimoLugar = new JLabel("Septimo lugar");
		lblSeptimoLugar.setBounds(44, 266, 87, 14);
		contentPane.add(lblSeptimoLugar);
		
		JLabel lblOctavoLugar = new JLabel("Octavo lugar");
		lblOctavoLugar.setBounds(44, 291, 87, 14);
		contentPane.add(lblOctavoLugar);
		
		JLabel lblNovenoLugar = new JLabel("Noveno Lugar");
		lblNovenoLugar.setBounds(44, 316, 87, 14);
		contentPane.add(lblNovenoLugar);
		
		JLabel lblDecimoLugar = new JLabel("Decimo Lugar");
		lblDecimoLugar.setBounds(44, 341, 87, 14);
		contentPane.add(lblDecimoLugar);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(178, 112, 50, 22);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_1.setBounds(178, 137, 50, 22);
		contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(178, 162, 50, 22);
		contentPane.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_3.setBounds(178, 187, 50, 22);
		contentPane.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setBounds(178, 212, 50, 22);
		contentPane.add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_5.setBounds(178, 237, 50, 22);
		contentPane.add(comboBox_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_6.setBounds(178, 262, 50, 22);
		contentPane.add(comboBox_6);
		
		comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_7.setBounds(178, 287, 50, 22);
		contentPane.add(comboBox_7);
		
		comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_8.setBounds(178, 312, 50, 22);
		contentPane.add(comboBox_8);
		
		comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_9.setBounds(178, 337, 50, 22);
		contentPane.add(comboBox_9);
		
		btnIngresarResultado = new JButton("Ingresar resultado");
		btnIngresarResultado.setBounds(44, 388, 184, 36);
		btnIngresarResultado.setActionCommand(RESULTADO);
		btnIngresarResultado.addActionListener(this);
		contentPane.add(btnIngresarResultado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand().equals(RESULTADO)) {
			resultado();
		}
	}
	
	public void resultado() {
		 DateTimeFormatter tiempoCarrera = DateTimeFormatter.ofPattern("yy-MM-dd HH-mm-ss");
		 String nameCarrera = tiempoCarrera.format(LocalDateTime.now());
		 int[] resultado = new int[10];
		 resultado[0]=Integer.parseInt(comboBox.getSelectedItem().toString()); 
		 resultado[1]=Integer.parseInt(comboBox_1.getSelectedItem().toString()); 
		 resultado[2]=Integer.parseInt(comboBox_2.getSelectedItem().toString()); 
		 resultado[3]=Integer.parseInt(comboBox_3.getSelectedItem().toString()); 
		 resultado[4]=Integer.parseInt(comboBox_4.getSelectedItem().toString()); 
		 resultado[5]=Integer.parseInt(comboBox_5.getSelectedItem().toString()); 
		 resultado[6]=Integer.parseInt(comboBox_6.getSelectedItem().toString()); 
		 resultado[7]=Integer.parseInt(comboBox_7.getSelectedItem().toString()); 
		 resultado[8]=Integer.parseInt(comboBox_8.getSelectedItem().toString()); 
		 resultado[9]=Integer.parseInt(comboBox_9.getSelectedItem().toString()); 
		 if(verificarResultado(resultado)) {
			 JOptionPane.showMessageDialog(null,"Lugares respetidos\n compruebe los resultados");
		 }else {
			 System.out.println("apuesta creada--");
			 Resultado result = new Resultado(nameCarrera,resultado,apuestas);
			 result.comprobarResultado();
			 ventana.presentar();
			 this.dispose();
			 
			 
		 }
		 
	}
	public boolean verificarResultado(int[] orden) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - 1; j++) {
				if (i != j) {
					if (orden[i] == orden[j]) {
						// un caballo entro en dos posisiones al mismo tiempo
						return true;
					}
				}
			}
		}
		return false;
	}

}
