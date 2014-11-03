/**
 * 
 */
package com.uniquindio.fundamentos.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.uniquindio.fundamentos.business.Empresa;
import com.uniquindio.fundamentos.vo.Empleado;

/**
 *  Esta interfaz da la opcion de dar manejo a la informacion de los empleados
 * @author Einer
 * @version 1.0 31/10/2014
 */
/*
 * la clase JFrame proporciona un marco en el cual podemos poner componetes como
 * botones, texto o camposla inteface ActionListener permite que los botones
 * pueda llamar eventos, esos eventos llegan al actionPerformed
 */
public class InterfazInicio extends JFrame implements ActionListener {

	// la clase JLabel nos permite poner texto en la interfaz
	private JLabel txtTitulo, txtCodigoE, txtNombreE, txtEdadE, txtCargoE,
			txtSueldoE, txtCodigoEmpleadoAElimnar;
	// la clase JTextField permite agregar campos de texto en la interfaz
	private JTextField cmpCodigoE, cmpNombreE, cmpEdadE, cmpCargoE, cmpSueldoE,
			cmpCodigoEmpleadoAEliminar;
	// la clase JButton da la posibilidad de agregar botones a la interfaz
	private JButton btnAgregarEmpleado, btnEliminarEmpleado,
			btnIrInterfazMatriz;
	private JList<String> listaEmpleados;
	private InterfazMatriz interfazMatriz;
	private Empresa empresa;

	public InterfazInicio() {

		/*
		 * existen varios tipos de layout, preferiblemente debemos dejar el
		 * valor en null el layout null nos da libertad de unicar los componetes
		 * de la interfaz donde desemos
		 */
		this.setLayout(null);

		empresa = new Empresa();
		//se envia como para metro la instancia de la interfaz principal 
		interfazMatriz= new InterfazMatriz(this);

		// se crea una etiqueta y se manda como parametro el nombre que queremos
		// q muestre
		txtTitulo = new JLabel("Empleado");
		// se posiciona en el JFrame la etiqueta, x:270, y:20, ancho:180,
		// alto:80
		txtTitulo.setBounds(270, 20, 180, 80);
		// secambia el tamaño de la letra a 24
		txtTitulo.setFont(txtTitulo.getFont().deriveFont(24.0f));
		// se adiciona la etiqueta al JFrame
		add(txtTitulo);

		txtCodigoE = new JLabel("Código");
		txtCodigoE.setBounds(20, 80, 180, 30);
		add(txtCodigoE);

		txtNombreE = new JLabel("Nombre");
		txtNombreE.setBounds(20, 140, 100, 30);
		add(txtNombreE);

		txtEdadE = new JLabel("Edad");
		txtEdadE.setBounds(20, 200, 100, 30);
		add(txtEdadE);

		txtCargoE = new JLabel("Cargo");
		txtCargoE.setBounds(20, 260, 100, 30);
		add(txtCargoE);

		txtSueldoE = new JLabel("Edad");
		txtSueldoE.setBounds(20, 320, 100, 30);
		add(txtSueldoE);

		cmpCodigoE = new JTextField();
		cmpCodigoE.setBounds(20, 110, 100, 30);
		add(cmpCodigoE);

		cmpNombreE = new JTextField();
		cmpNombreE.setBounds(20, 170, 100, 30);
		add(cmpNombreE);

		cmpEdadE = new JTextField();
		cmpEdadE.setBounds(20, 230, 100, 30);
		add(cmpEdadE);

		cmpCargoE = new JTextField();
		cmpCargoE.setBounds(20, 290, 100, 30);
		add(cmpCargoE);

		cmpSueldoE = new JTextField();
		cmpSueldoE.setBounds(20, 350, 100, 30);
		add(cmpSueldoE);

		btnAgregarEmpleado = new JButton("Agregar");
		btnAgregarEmpleado.setBounds(20, 400, 100, 30);
		// con esta linea le damos al boton un evento, si se presiona el boton
		// se activara el metodo actionPerformed
		btnAgregarEmpleado.addActionListener(this);
		add(btnAgregarEmpleado);

		// reservamos memoria a la lista donde se guardaran los datos de los
		// empleados
		listaEmpleados = new JList<String>();
		// se reserva memoria a un JScrollPane y se agrega la lista que creamos
		// anteriormente, esto permitira
		// que aprezca un scroll cuando se ha ingresado mucha informacion
		JScrollPane scrollPane = new JScrollPane(listaEmpleados);
		scrollPane.setBounds(200, 100, 400, 320);
		add(scrollPane);

		// la clase JSeparator proporciona una linea que permite separar
		// componentes en la interfaz
		JSeparator separador = new JSeparator(SwingConstants.VERTICAL);
		separador.setBounds(150, 92, 5, 320);
		add(separador);

		JSeparator separador2 = new JSeparator();
		separador2.setBounds(20, 440, 600, 5);
		add(separador2);

		txtCodigoEmpleadoAElimnar = new JLabel(
				"Ingrese el código del empleado a eliminar");
		txtCodigoEmpleadoAElimnar.setBounds(20, 460, 250, 30);
		add(txtCodigoEmpleadoAElimnar);

		cmpCodigoEmpleadoAEliminar = new JTextField();
		cmpCodigoEmpleadoAEliminar.setBounds(20, 500, 100, 30);
		add(cmpCodigoEmpleadoAEliminar);

		btnEliminarEmpleado = new JButton("Eliminar empleado");
		btnEliminarEmpleado.setBounds(150, 500, 150, 30);
		btnEliminarEmpleado.addActionListener(this);
		add(btnEliminarEmpleado);
		
		btnIrInterfazMatriz= new JButton("Ir a matriz");
		btnIrInterfazMatriz.setBounds(330, 500, 100, 30);
		btnIrInterfazMatriz.addActionListener(this);
		add(btnIrInterfazMatriz);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		// con esta condicion reconocemos que el boton que presionamos es
		// btnAgregarEmpleado
		if (e.getSource() == btnAgregarEmpleado) {

			try {

				// se obtiene los valores que se ingresaron en los campos de
				// texto
				String codigo = cmpCodigoE.getText();
				String nombre = cmpNombreE.getText();
				int edad = Integer.parseInt(cmpEdadE.getText());
				String cargo = cmpCargoE.getText();
				double sueldo = Double.parseDouble(cmpSueldoE.getText());

				// se agrega un nuevo empleado
				if (empresa.agregarEmpleado(new Empleado(codigo, nombre, edad,
						sueldo, cargo))) {
					mostrarAlerta("El empleado a sido registrado");

				} else {
					mostrarAlerta("El empleado ya fue ingresado");
				}

			} catch (Exception e2) {
				mostrarAlerta("Verifique los datos ingresados");
			}

		}

		if (e.getSource() == btnEliminarEmpleado) {
			if (empresa.eliminarEmpleado(cmpCodigoEmpleadoAEliminar.getText())) {
				mostrarAlerta("El empleado fue eliminado");
			} else {
				mostrarAlerta("El empleado no fue encontrado");
			}
		}

		if(e.getSource()==btnIrInterfazMatriz){
			//se muestra en pantalla la interfaz de matriz
			interfazMatriz.setVisible(true);
			//se oculta la interfaz inicial
			this.setVisible(false);
		}
		
		// cada que se presiona angregar nuevo empleado se actualza
		// la lista
		listaEmpleados.setListData(empresa.listaDeDatos());

	}

	/**
	 * metodo encargado de mostrar un mensaje en pantalla
	 * 
	 * @param mensaje
	 *            mensaje que se desea mostrar
	 */
	public void mostrarAlerta(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}

}
