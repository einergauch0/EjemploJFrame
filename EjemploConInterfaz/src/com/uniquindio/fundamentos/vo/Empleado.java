package com.uniquindio.fundamentos.vo;

/**
 * @author Einer
 * @version 1.0 31/10/2014
 */
public class Empleado {

	private String codigo;
	private String nombre;
	private int edad;
	private double sueldo;
	private String cargo;

	/**
	 * Metodo constructor de la clase empreado
	 * 
	 * @param codigo
	 * @param nombre
	 * @param edad
	 * @param sueldo
	 * @param cargo
	 */
	public Empleado(String codigo, String nombre, int edad, double sueldo,
			String cargo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		this.cargo = cargo;
	}

	/**
	 * retorna el codigo del empleado
	 * 
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * modifica el codigo del empleado por el parametro enviado
	 * 
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * retorna el nombre del empleado
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * modifica el nombre del empleado por el parametro enviado
	 * 
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * retorna el edad del empleado
	 * 
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * modifica la edad del empleado por el parametro enviado
	 * 
	 * @param edad
	 *            the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * retorna el sueldo del empleado
	 * 
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * modifica el sueldo del empleado por el parametro enviado
	 * 
	 * @param sueldo
	 *            the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * retorna el cargo del empleado
	 * 
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * modifica el cargo del empleado por el parametro enviado
	 * 
	 * @param cargo
	 *            the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * Se sobre escirbe el metodo toString
	 * @return retorna la informacion del empleado
	 */
	public String toString() {
		return "Codigo: " + codigo + " Nombre: " + nombre + " Cargo: " + cargo
				+ " Sueldo: " + sueldo;
	}

}
