package atras;

import javax.swing.JOptionPane;

import frente.Ventana;

public class Ordenamiento {

	ManejoApuestas apuestas;
	Ventana ventana;
	
	/**
	 * contructor 
	 * @param apuestas: tipo ManejoApuestas, lista enlazada de apuestas 
	 * @param ventana. Jframe principal donde se muestran resultados
	 */
	public Ordenamiento(ManejoApuestas apuestas, Ventana ventana) {
		this.apuestas = apuestas;
		this.ventana = ventana;
	}
	
	/**
	 * ordena las apuestas por puntaje, de mayor a menor, las posiciones superiores tienen mas ganancia
	 */
	public void ordenar() {
		Apuesta actual;
		Apuesta siguiente;
		Apuesta tmp = new Apuesta("temp", 0, new int [10]);

		actual = apuestas.getRoot();
		while(actual!=null) {
			siguiente = actual.getSiguiente();
			while(siguiente!=null) {
				if(actual.getPuntos()<siguiente.getPuntos()) {
					cambio(tmp,actual,siguiente);		
				}
				Apuesta sig = siguiente.getSiguiente();
				siguiente=sig;
			}
			Apuesta sig = actual.getSiguiente();
			actual = sig;
			
		}
			
	}
	
	/**
	 * ordena las apuestas alfabeticamente con los nombres de los apostadores
	 * facil acceso a los nombres
	 */
	public void ordenarAlfa() {
		Apuesta actual;
		Apuesta siguiente;
		Apuesta tmp = new Apuesta("temp", 0, new int [10]);
		int cm =0;

		actual = apuestas.getRoot();
		while(actual!=null) {
			siguiente = actual.getSiguiente();
			while(siguiente!=null) {
				cm ++;
				int valorac = actual.getApostador().toCharArray()[0];
				int valorsg = siguiente.getApostador().toCharArray()[0];
				if(valorac>valorsg) {
					cambio(tmp,actual,siguiente);		
				}
				Apuesta sig = siguiente.getSiguiente();
				siguiente=sig;
			}
			Apuesta sig = actual.getSiguiente();
			actual = sig;
			JOptionPane.showMessageDialog(null, "Comparaciones realizas "
					+ cm +"\n Mayor cantidad de pasos "
					+ cm +"\n nenor cantidad de pasos "+cm
					, "Reporte de casos", JOptionPane.WARNING_MESSAGE);
			
		}
			
	}
	
	public void cambio(Apuesta tmp,Apuesta actual,Apuesta siguiente) {
		// otengo datos de el primero en fila
		tmp.setApostador(actual.getApostador());
		tmp.setMonto(actual.getMonto());
		tmp.setPosiciones(actual.getPosiciones());
		tmp.setPuntos(actual.getPuntos());
		
		//cambio el siguiente por el primero en fila
		actual.setApostador(siguiente.getApostador());
		actual.setMonto(siguiente.getMonto());
		actual.setPosiciones(siguiente.getPosiciones());
		actual.setPuntos(siguiente.getPuntos());
		
		//lleno con el temporal al siguiente
		siguiente.setApostador(tmp.getApostador());
		siguiente.setMonto(tmp.getMonto());
		siguiente.setPosiciones(tmp.getPosiciones());
		siguiente.setPuntos(tmp.getPuntos());
	}
}
