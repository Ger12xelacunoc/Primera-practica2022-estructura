package frente;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import atras.Apuesta;
import atras.ManejoApuestas;
import atras.Ordenamiento;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;

public class Ventana extends JFrame implements ActionListener {
	
	public static final String INGRESAR = "INGRESAR";
	public static final String NUEVA = "NUEVA";
	public static final String VERIFICAR = "VERIFICAR";
	public static final String RESULTADO = "RESULTADO";
	public static final String ORDENAR = "ORDENAR";
	public static final String ORDENALFA = "ORDENALFA";
	public static final String NUEVACARRERA = "NUEVACARRERA";

	ManejoApuestas apuestas = new ManejoApuestas();
	NuevaApuesta napst = new NuevaApuesta(apuestas);
	IngresarResultado inresult = new IngresarResultado(apuestas, this);
	
	private JPanel contentPane;
	private JButton btnIngresar;
	private JButton btnApuestaNueva;
	private JButton btnIngresarResultado;
	private JButton btnOrdenar;
	private JButton btnNuevaCarrera;
	private JScrollPane scrollPane;
	private JButton btnVerificar;
	private JTextArea textArea;
	private JButton btnOrdenAlfabetic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		
		btnIngresar = new JButton("Ingresar Datos");
		panel_1.add(btnIngresar);
		btnIngresar.setActionCommand(INGRESAR);
		btnIngresar.addActionListener(this);
		
		btnApuestaNueva = new JButton("Apuesta Nueva");
		panel_1.add(btnApuestaNueva);
		btnApuestaNueva.setActionCommand(NUEVA);
		btnApuestaNueva.addActionListener(this);
		
		btnVerificar = new JButton("Verificar Apuestas");
		panel_1.add(btnVerificar);
		btnVerificar.setActionCommand(VERIFICAR);
		btnVerificar.addActionListener(this);
		
		btnIngresarResultado = new JButton("Ingresar resultado");
		panel_1.add(btnIngresarResultado);
		btnIngresarResultado.setActionCommand(RESULTADO);
		btnIngresarResultado.addActionListener(this);
		
		btnOrdenar = new JButton("Ordenar por puntos");
		panel_1.add(btnOrdenar);
		btnOrdenar.setActionCommand(ORDENAR);
		btnOrdenar.addActionListener(this);
		
		btnOrdenAlfabetic = new JButton("Ordenar Alfabeticamente");
		panel_1.add(btnOrdenAlfabetic);
		btnOrdenAlfabetic.setActionCommand(ORDENALFA);
		btnOrdenAlfabetic.addActionListener(this);
		
		btnNuevaCarrera = new JButton("Nueva Carrera");
		panel_1.add(btnNuevaCarrera);
		btnNuevaCarrera.setActionCommand(NUEVACARRERA);
		btnNuevaCarrera.addActionListener(this);

		
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(2, 450));
		scrollPane.setSize(new Dimension(50, 50));
		scrollPane.setMinimumSize(new Dimension(50, 50));
		contentPane.add(scrollPane, BorderLayout.SOUTH);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	// apt es la lista enlazada de apuestas al agregar al inicio es un O(1) es un movimiento y ya



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(INGRESAR)) {
			ingresar();
		}
		if(e.getActionCommand().equals(NUEVA)) {
			apuestaManual();
		}
		if(e.getActionCommand().equals(VERIFICAR)) {
			verificar();
		}
		if(e.getActionCommand().equals(RESULTADO)) {
			ingresarReultado();
		}
		if(e.getActionCommand().equals(ORDENAR)) {
			ordenar();
		}
		if(e.getActionCommand().equals(ORDENALFA)) {
			ordenarAlfabeticamente();
		}
		if(e.getActionCommand().endsWith(NUEVACARRERA)) {
			nuevaCarrera();
			
		}

	}

	private void ordenar() {
		Ordenamiento ordenar = new Ordenamiento(apuestas,this);
		ordenar.ordenar();
		apuestas.presentar(textArea);
	}

	public void ordenarAlfabeticamente() {
		Ordenamiento ordenar = new Ordenamiento(apuestas,this);
		ordenar.ordenarAlfa();
		apuestas.presentar(textArea);
		
	}

	public void ingresar() {

		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);
		File archivo = fc.getSelectedFile();
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String texto= "";
			String linea= "";
			while (br.ready()) {
				String[] datos = br.readLine().split(",");
				if(datos.length == 12) {
					
				String apostador = datos[0];
				int monto = Integer.parseInt(datos[1]);
				int[] posiciones = new int[10];
				
				posiciones[0] = Integer.parseInt(datos[2]);
				posiciones[1] = Integer.parseInt(datos[3]);
				posiciones[2] = Integer.parseInt(datos[4]);
				posiciones[3] = Integer.parseInt(datos[5]);
				posiciones[4] = Integer.parseInt(datos[6]);
				posiciones[5] = Integer.parseInt(datos[7]);
				posiciones[6] = Integer.parseInt(datos[8]);
				posiciones[7] = Integer.parseInt(datos[9]);
				posiciones[8] = Integer.parseInt(datos[10]);
				posiciones[9] = Integer.parseInt(datos[11]);
				Apuesta nueva = new Apuesta(apostador, monto, posiciones);
				apuestas.agregarInicio(nueva);

				linea = " nombre:--"+apostador+"  monto--"+monto;
				texto +=linea+"\n";
				}
			}
			this.presentar();
			
		} catch (Exception e2) {

		}

	}
	
	public void presentar() {
		apuestas.presentar(textArea);
		
	}
	public void apuestaManual() {
		napst.setVisible(true);
	
	}
	
	public void verificar() {
		apuestas.buscarYeliminar();
		apuestas.presentar(textArea);
	
	}
	public void ingresarReultado() {
		inresult.setVisible(true);
		
	}
	public void nuevaCarrera() {
		apuestas.nuevaCarrera();
	}

}
