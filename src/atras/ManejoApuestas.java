package atras;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ManejoApuestas {

	Apuesta root = null;
	int tamanio = 0;

	public ManejoApuestas() {

	}
	/**
	 * inicializa las apuestas se borra lo que se hace con anterioriadad 
	 */
	public void nuevaCarrera() {
		root=null;
	}

	/**
	 * agrega una sola apuesta a la lista de apuestas este lo hace al inicio
	 * es un O(1)
	 * @param e: la nueva apuesta
	 */
	public void agregarInicio(Apuesta e) {
		if (root == null) {
			root = e;
		} else {
			Apuesta tp = root;
			root = e;
			root.setSiguiente(tp);
			root.getSiguiente().setAnterior(root);
			root.setPrincipal(true);
			root.getSiguiente().setPrincipal(false);
			;
		}
		tamanio++;

	}

	/**
	 * coloca los puntos correspondientes por los aciertos en las posiciones a las 
	 * cuales jugo
	 * @param resultados: ingresados manualmente en la clase resultados 
	 * representa la llegada de los caballos son 10 posiciones no repetidas
	 * @return retorna la cantidad de apuestas
	 */
	public int Asignarpuntos(int[] resultados) {
		Apuesta ac = root;
		Apuesta ultimo = ac;
		int tamanio=0;
		while(ac != null) {
			int puntos = 0;
			if(ac.posiciones[0]==resultados[0]) puntos +=10;
			if(ac.posiciones[1]==resultados[1]) puntos +=9;
			if(ac.posiciones[2]==resultados[2]) puntos +=8;
			if(ac.posiciones[3]==resultados[3]) puntos +=7;
			if(ac.posiciones[4]==resultados[4]) puntos +=6;
			if(ac.posiciones[5]==resultados[5]) puntos +=5;
			if(ac.posiciones[6]==resultados[6]) puntos +=4;
			if(ac.posiciones[7]==resultados[7]) puntos +=3;
			if(ac.posiciones[8]==resultados[8]) puntos +=2;
			if(ac.posiciones[9]==resultados[9]) puntos +=1;
			ac.setPuntos(puntos);
			ultimo = ac;
			ac=ultimo.getSiguiente();
			tamanio++;
		}
		JOptionPane.showMessageDialog(null, "Comparaciones realizas "
				+ tamanio +"\n Mayor cantidad de pasos "
				+ tamanio +"\n nenor cantidad de pasos "+tamanio
				, "Reporte de casos", JOptionPane.WARNING_MESSAGE);
		return tamanio;
	}

	/**
	 * muestra en el JTextArea las apuestas en la lista enlazada
	 * @param temp: JTextArea donde se muestran las apuestas
	 * @return el tamanio de filas mostradas
	 */
	public int presentar(JTextArea temp) {
		if(root ==null) {
			temp.setText("");
			return 0;
		}else {
			
		Apuesta ac = root;
		Apuesta ultimo = ac;
		int tamanio=0;
		String texto= "";
		while(ac != null) {
			texto+=ac.toString()+"\n";
			ultimo = ac;
			ac=ultimo.getSiguiente();
			tamanio++;
		}
		temp.setText(texto);
		return tamanio;
		}
	}
	
	/**
	 * elimina apuestas con deficiencias en este caso posiciones repetidas
	 */
	public void buscarYeliminar() {
		Apuesta ac = root;
		Apuesta ultimo = ac;
		String registro="borrados por repetir caballos \n\n";
		int i=0;
		int t=0;
		// recorre la lista
		while(ac != null) {
			t++;
			if(repetido(ac)) {
				i++;			
				registro +=ac.toStringComas()+"\n";

				Apuesta sg = ac.getSiguiente();
				Apuesta at = ac.getAnterior();
					try {
						
						at.setSiguiente(sg);
						sg.setAnterior(at);
						ac = at;
					} catch (Exception e) {
						
					}
				}
			ultimo = ac;
			ac=ultimo.getSiguiente();
		}
		if(i==0)JOptionPane.showMessageDialog(null, "no se a encontrado apuestas con anomalias");
		else {
			JOptionPane.showMessageDialog(null, "se ha eliminado apuestas por estar repetidas"
					+ " seleccione la ruta para el registro de eliminados");
		Rechazadas rc = new Rechazadas();
		rc.redactar(registro);
		}
		JOptionPane.showMessageDialog(null, "Comparaciones realizas "
				+ t +"\n Mayor cantidad de pasos "
				+ t +"\n nenor cantidad de pasos "+t, "Reporte de casos", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * verificar repetido
	 * @param ac la puauesta a verificas 
	 * @return falso si no hay posiciones repetidas, verdadero si hay dos caballos iguales
	 */
	public boolean repetido(Apuesta ac) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - 1; j++) {
				if (i != j) {
					if (ac.getPosiciones()[i] == ac.getPosiciones()[j]) {
						// eliminamos su valor
						System.out.println(ac.getApostador() + "  eliminado");
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * si es una lista vacia	
	 * @return verdadero si es una lista vacia falso si tiene ya apuestas agregadas
	 */
	public boolean vacia() {
		return root ==null;
		
	}
	/**
	 * 
	 * @return la ultima apuesta agregada
	 */
	public Apuesta getRoot() {
		return root;
	}

}
