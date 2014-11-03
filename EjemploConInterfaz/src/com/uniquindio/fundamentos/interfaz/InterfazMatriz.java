/**
 * 
 */
package com.uniquindio.fundamentos.interfaz;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *  Esta interfaz muestra un ejemplo de como manejar una matriz de botones
 * @author Einer
 * @version 1.0 31/10/2014
 */
public class InterfazMatriz extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private InterfazInicio interfazInicio;
	private Button [][] matrizBotones;
	private Button btnVolver, btnAleatorio;
	private int contarPosicion;
	
	/**
	 * Metodo contructor de la clase 
	 * @param interfazInicio
	 * recibe una instancia de la interfaz principal para no perder la información
	 */
	public InterfazMatriz(InterfazInicio interfazInicio) {
		
		setLayout(null);
		this.interfazInicio=interfazInicio;
		
		try {
			//se pone una imagen de fongo
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("fondo.jpg")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		contarPosicion=0;
		matrizBotones= new Button [4][4];
		int x=90, y=70;
		
		//se recorre la matriz para poder dar valor a los botones
		for (int i = 0; i < matrizBotones.length; i++) {
			for (int j = 0; j < matrizBotones.length; j++) {
				matrizBotones[i][j]= new Button("Pos: "+contarPosicion);
				matrizBotones[i][j].setBounds(30+(i*x), 40+(j*y), 60, 50);
				matrizBotones[i][j].addActionListener(this);
				add(matrizBotones[i][j]);
				contarPosicion++;
			}
		}
		
		btnVolver= new Button("Volver");
		btnVolver.setBounds(260, 330, 100,30);
		btnVolver.addActionListener(this);
		add(btnVolver);
		
		btnAleatorio= new Button("Pos Aleatoria");
		btnAleatorio.setBounds(30, 330, 100,30);
		btnAleatorio.addActionListener(this);
		add(btnAleatorio);
		
		this.setTitle("Matriz");
		this.setSize(400, 400);
		this.setResizable(false);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		//se recorre la mariz de botones para saber cual es el boton presionado
		for (int i = 0; i < matrizBotones.length; i++) {
			for (int j = 0; j < matrizBotones.length; j++) {
				if(e.getSource()==matrizBotones[i][j]){
					interfazInicio.mostrarAlerta(matrizBotones[i][j].getLabel());
				}
			}
		}
		
		//vuelve a la interfaz principal
		if(btnVolver==e.getSource()){
			interfazInicio.setVisible(true);
			setVisible(false);
		}
		
		if(btnAleatorio==e.getSource()){
			ponerValoresAleatorio();
		}
		
	}

	/**
	 * Este metodo pone valores aleatorios enteros sobre los botones 
	 */
	private void ponerValoresAleatorio() {
		int aleatorio=0;
		for (int i = 0; i < matrizBotones.length; i++) {
			for (int j = 0; j < matrizBotones.length; j++) {
				aleatorio=(int) (16*Math.random());
				matrizBotones[i][j].setLabel("Pos: "+aleatorio);
			}
		}
	}
	

}
