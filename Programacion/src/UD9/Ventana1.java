package UD9;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana1 {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Mi primera ventana");
		//1. ventana inicialmente tiene tamaño 0.
		ventana.setSize(600, 200); //ancho y alto
		ventana.setLocation(0, 0); //posicion en la pantalla 
		//2. Una ventana hay que indicarle el
		//comportamiento al pulsar el aspa.
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Vinculamos el panel en la ventana
		JPanel panel = new JPanel();
		ventana.add(panel);
		//Dibujamos la etiqueta
		JLabel et1=new JLabel ("Nombre");
		//Vinculamos la etiqueta con el panel
		panel.add(et1);
		
		//ahora vinculamos el campo de texto
		JTextField campo=new JTextField(10);
		panel.add(campo);
		
		//Lo mismo con un boton
		JButton boton = new JButton ("Saluda");
		panel.add(boton);		
		
		//3. Por defecto la ventana es invisible.
		//Siempre al final cuando estan todos los elementos añadidos
		ventana.setVisible(true);
		

	}

}
