import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.uniquindio.fundamentos.interfaz.InterfazInicio;


public class Aplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InterfazInicio inicio= new InterfazInicio();
		inicio.setSize(650, 580);
		inicio.setTitle("Prueba de interfaz");
		inicio.getContentPane().setBackground(Color.WHITE);
		inicio.addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) {System.exit(0);} }); 
		inicio.setVisible(true);
		
	}

}
