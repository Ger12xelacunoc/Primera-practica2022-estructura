package atras;

import javax.swing.JOptionPane;

public class Resultado {

	String nombreCarrera= "";
	int[] resultado = new int[10];
	ManejoApuestas apuestas = new ManejoApuestas(); 
	
	/**
	 * Constructor de la clase resultado
	 * @param nombreCarrera: el nombre que se le da a la carrera para ser guardada
	 * @param resultado la posicion de entrada de los caballos
	 * @param apuestas la lista de apuestas del Tipo ManejoApuestas
	 */
	public Resultado(String nombreCarrera, int[] resultado , ManejoApuestas apuestas) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.resultado = resultado;
		this.apuestas = apuestas;
	}
	
	/**
	 * verifica si hay apuestas en la lista
	 * asigna los puntos que corresponden 
	 */
	public void comprobarResultado() {
		if(apuestas.vacia()) {
			JOptionPane.showMessageDialog(null, "No hay apuestas");
		}else {
			System.out.println("asignango puntos");
			apuestas.Asignarpuntos(resultado);

		}
		
	}
	
			
}
