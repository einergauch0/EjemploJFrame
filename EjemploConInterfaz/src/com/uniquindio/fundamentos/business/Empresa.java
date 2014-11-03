/**
 * 
 */
package com.uniquindio.fundamentos.business;

import java.util.ArrayList;
import java.util.Vector;

import com.uniquindio.fundamentos.vo.Empleado;

/**
 * @author Einer
 * @version 1.0 31/10/2014
 */
public class Empresa {

	private ArrayList<Empleado> empleados;

	/**
	 * metodo contructor de la clase empresa
	 */
	public Empresa() {
		empleados = new ArrayList<Empleado>();
	}

	/**
	 * Busca un empleado por codigo
	 * @param codigo
	 *            codigo el empleado que se esta buscando
	 * @return la posicion donde se encuentra el empreado buscado, de no existir
	 *         devuelve -1
	 */
	public int buscarEmpleado(String codigo) {

		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getCodigo().equals(codigo))
				return i;
		}

		return -1;
	}
	
	/**
	 * Metodo encargado de agregar un empleado a la arraylist
	 * @param empleado
	 * empleado que se desea agregar a la arraylist
	 * @return devuelve true si agrego a un nuevo empleado false si no
	 */
	public boolean agregarEmpleado(Empleado empleado){
		
		if(buscarEmpleado(empleado.getCodigo())!=-1)
			return false;
		
		return empleados.add(empleado);
	}
	
	/**
	 * Metodo encargado de eliminar un empleado
	 * @param codigo
	 * codigo del empleado que se desea eliminar
	 * @return
	 * devuelve true si elimino, false si no 
	 */
	public boolean eliminarEmpleado(String codigo){
		
		int posEmpleado=buscarEmpleado(codigo);
		
		if(posEmpleado==-1)
			return false;
		
		empleados.remove(posEmpleado);
		return true;
	}
	
	/**
	 * este metodo retotna un lista de string con la informacion de los empleados
	 * @return devuelve la lista de datos de los empleados registrados
	 */
	public String[] listaDeDatos(){
		
		String [] listaDatos= new String[empleados.size()];
		
		for (int i = 0; i < empleados.size(); i++) {
			listaDatos[i]=empleados.get(i).toString();
		}
		return listaDatos;
	}
	
}
