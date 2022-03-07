package atras;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Rechazadas {
	
	/**
	 * guarda en un archivo las apuestas rechazadas
	 * @param contenido las apuestas rechazadas del tipo String
	 */
	public void redactar(String contenido) {
		try {
			JFileChooser rut = new JFileChooser();
			
			if(rut.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {
				
				String ruta = rut.getSelectedFile().getAbsolutePath();
			File fl = new File (ruta);
			PrintWriter pw = new PrintWriter(fl);
			pw.write(contenido);
			pw.close();
			}
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "error al subir archivo");
		}
	}
	

}
