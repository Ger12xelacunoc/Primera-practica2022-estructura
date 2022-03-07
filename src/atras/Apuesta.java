package atras;

import java.util.Arrays;


public class Apuesta {
	boolean principal;
	Apuesta siguiente;
	Apuesta anterior;
	String apostador="";
	int monto=0;
	int puntos;
	int [] posiciones = new int[10];

	/**
	 * constructor representacion de una apuesta entrelaza varias apuestas
	 * @param apostador: nombre del apostador 
	 * @param monto: monto que apuesta 
	 * @param posiciones: posiciones a las cual juega
	 */
	public Apuesta(String apostador, int monto, int[] posiciones) {
		
		super();
		this.apostador = apostador;
		this.monto = monto;
		this.posiciones = posiciones;
	}

	public Apuesta getFinal() {
		Apuesta e= this;
		
		if (this.siguiente != null) {
			e = this.siguiente.getFinal();
		}
		System.out.println(this.toString());
		return e;
	}
	
	
	
	
	@Override
	public String toString() {
		return "apostador-- \t"+apostador+"\t Apuesta-- \t"+monto+""
				+ " \t[posiciones=" + Arrays.toString(posiciones) + "]\t"
				+" puntos--\t"+ puntos;
	}

	public String toStringComas() {
		return apostador+","+monto+","+ Arrays.toString(posiciones);
	}
	
	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	public Apuesta getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Apuesta siguiente) {
		this.siguiente = siguiente;
	}

	public Apuesta getAnterior() {
		return anterior;
	}

	public void setAnterior(Apuesta anterior) {
		this.anterior = anterior;
	}

	public String getApostador() {
		return apostador;
	}

	public void setApostador(String apostador) {
		this.apostador = apostador;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int[] getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(int[] posiciones) {
		this.posiciones = posiciones;
	}
	
	
	
	

}
