package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana1 extends JFrame implements ActionListener{
	
	//atributos
	private JPanel panel;
	private JLabel et1;
	private JLabel etSaludo;
	private JTextField campo;
	private JButton boton;
	
	//Constructor
	public MiVentana1() {
		super("Mi primera ventana");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construirPanel();
		this.setVisible(true);
	}
	
	public void construirPanel() {
		
		panel=new JPanel();
		
		et1=new JLabel("Nombre");
		panel.add(et1);
		
		
		
		campo=new JTextField(20);
		panel.add(campo);
		
		boton=new JButton("Saluda");
		panel.add(boton);
		
		etSaludo=new JLabel("");
		panel.add(etSaludo);
		
		//asociamos la respuesta al click del raton al boton
		boton.addActionListener(this);
		
		
		this.add(panel);
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// El cuerpo del metodo es la respuesta ante el evento de un click
		String nombre=campo.getText();
		etSaludo.setText("Hola "+nombre);
		
	}
}
