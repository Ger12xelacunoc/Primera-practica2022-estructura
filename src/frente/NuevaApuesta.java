package frente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import atras.Apuesta;
import atras.ManejoApuestas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class NuevaApuesta extends JFrame implements ActionListener {
	
	public static final String INGRESAR = "INGRESAR";

	private JPanel contentPane;
	private JTextField textApostador;
	private JTextField textFieldMonto;
	private JComboBox comboBox1;
	private JComboBox comboBox5;
	private JComboBox comboBox8;
	private JComboBox comboBox7;
	private JComboBox comboBox3;
	private JComboBox comboBox6;
	private JComboBox comboBox9;
	private JComboBox comboBox4;
	private JButton btnIngresar;
	private JComboBox comboBox2;
	private JComboBox comboBox10;
	
	ManejoApuestas momento = new ManejoApuestas();
	public NuevaApuesta(ManejoApuestas e) {
		this();
		momento =e;
		
	}

	/**
	 * Create the frame.
	 */
	public NuevaApuesta() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100,340, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApostador = new JLabel("Apostador");
		lblApostador.setBounds(10, 35, 99, 14);
		contentPane.add(lblApostador);
		
		textApostador = new JTextField();
		textApostador.setBounds(162, 32, 127, 20);
		contentPane.add(textApostador);
		textApostador.setColumns(10);
		
		JLabel lblMonto = new JLabel("Monto");
		lblMonto.setBounds(10, 66, 99, 14);
		contentPane.add(lblMonto);
		
		JLabel lblPrimero = new JLabel("Primero");
		lblPrimero.setBounds(10, 138, 99, 14);
		contentPane.add(lblPrimero);
		
		JLabel lblSegundo = new JLabel("Segundo");
		lblSegundo.setBounds(10, 163, 99, 14);
		contentPane.add(lblSegundo);
		
		JLabel lblTercero = new JLabel("Tercero");
		lblTercero.setBounds(10, 188, 99, 14);
		contentPane.add(lblTercero);
		
		JLabel lblCuarto = new JLabel("Cuarto");
		lblCuarto.setBounds(10, 213, 99, 14);
		contentPane.add(lblCuarto);
		
		JLabel lblQuinto = new JLabel("Quinto");
		lblQuinto.setBounds(10, 238, 99, 14);
		contentPane.add(lblQuinto);
		
		JLabel lblSexto = new JLabel("Sexto");
		lblSexto.setBounds(10, 263, 99, 14);
		contentPane.add(lblSexto);
		
		JLabel lblSeptimo = new JLabel("Septimo");
		lblSeptimo.setBounds(10, 288, 99, 14);
		contentPane.add(lblSeptimo);
		
		JLabel lblOctavo = new JLabel("Octavo");
		lblOctavo.setBounds(10, 313, 99, 14);
		contentPane.add(lblOctavo);
		
		JLabel lblNoveno = new JLabel("Noveno");
		lblNoveno.setBounds(10, 338, 99, 14);
		contentPane.add(lblNoveno);
		
		JLabel lblDecimo = new JLabel("Decimo");
		lblDecimo.setBounds(10, 363, 99, 14);
		contentPane.add(lblDecimo);
		
		JLabel lblPosicionesDeLos = new JLabel("Posiciones de los caballos");
		lblPosicionesDeLos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicionesDeLos.setBounds(90, 109, 149, 14);
		contentPane.add(lblPosicionesDeLos);
		
		textFieldMonto = new JTextField();
		textFieldMonto.setColumns(10);
		textFieldMonto.setBounds(162, 63, 127, 20);
		contentPane.add(textFieldMonto);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox1.setBounds(162, 134, 46, 22);
		contentPane.add(comboBox1);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox2.setBounds(162, 159, 46, 22);
		contentPane.add(comboBox2);
		
		comboBox3 = new JComboBox();
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox3.setBounds(162, 184, 46, 22);
		contentPane.add(comboBox3);
		
		comboBox4 = new JComboBox();
		comboBox4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox4.setBounds(162, 209, 46, 22);
		contentPane.add(comboBox4);
		
		comboBox5 = new JComboBox();
		comboBox5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox5.setBounds(162, 234, 46, 22);
		contentPane.add(comboBox5);
		
		comboBox6 = new JComboBox();
		comboBox6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox6.setBounds(162, 259, 46, 22);
		contentPane.add(comboBox6);
		
		comboBox7 = new JComboBox();
		comboBox7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox7.setBounds(162, 284, 46, 22);
		contentPane.add(comboBox7);
		
		comboBox8 = new JComboBox();
		comboBox8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox8.setBounds(162, 309, 46, 22);
		contentPane.add(comboBox8);
		
		comboBox9 = new JComboBox();
		comboBox9.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox9.setBounds(162, 334, 46, 22);
		contentPane.add(comboBox9);
		
		comboBox10 = new JComboBox();
		comboBox10.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox10.setBounds(162, 359, 46, 22);
		contentPane.add(comboBox10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(119, 427, 89, 23);
		contentPane.add(btnIngresar);
		btnIngresar.setActionCommand(INGRESAR);
		btnIngresar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(INGRESAR)) {
			ingresarNueva();
		}
	}
	
	public void ingresarNueva() {
		int monto = 0;
		String apostador = textApostador.getText();
		try {
			
			monto = Integer.parseInt(textFieldMonto.getText());
		} catch (Exception e2) {
			monto = 40;
			JOptionPane.showMessageDialog(this, "La casilla de apuesta esta vacia por defecto "
					+ "se coloca 40 en el monto de apuesta");
		}
		int[] posiciones = new int[10];
		
		posiciones[0] = Integer.parseInt(comboBox1.getSelectedItem().toString());
		posiciones[1] = Integer.parseInt(comboBox2.getSelectedItem().toString());
		posiciones[2] = Integer.parseInt(comboBox3.getSelectedItem().toString());
		posiciones[3] = Integer.parseInt(comboBox4.getSelectedItem().toString());
		posiciones[4] = Integer.parseInt(comboBox5.getSelectedItem().toString());
		posiciones[5] = Integer.parseInt(comboBox6.getSelectedItem().toString());
		posiciones[6] = Integer.parseInt(comboBox7.getSelectedItem().toString());
		posiciones[7] = Integer.parseInt(comboBox8.getSelectedItem().toString());
		posiciones[8] = Integer.parseInt(comboBox9.getSelectedItem().toString());
		posiciones[9] = Integer.parseInt(comboBox10.getSelectedItem().toString());
		
		Apuesta nueva = new Apuesta(apostador, monto, posiciones);
		momento.agregarInicio(nueva);
		JOptionPane.showMessageDialog(null,"apuesta ingresada");
		textApostador.setText("");
	}

}
