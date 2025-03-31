package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana2 extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel et1;
	private JLabel et2;
	private JLabel etSuma;
	private JTextField campo1;
	private JTextField campo2;
	private JButton boton;

	// Constructor
	public MiVentana2() {
		super("Mi primera ventana");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construirPanel();
		this.setVisible(true);
	}

	public void construirPanel() {

		panel = new JPanel();

		et1 = new JLabel("Primer Numero");
		panel.add(et1);
		et2 = new JLabel("Segundo Numero");
		panel.add(et2);

		campo1 = new JTextField(5);
		panel.add(campo1);
		campo2 = new JTextField(5);
		panel.add(campo2);

		boton = new JButton("Suma");
		panel.add(boton);

		etSuma = new JLabel("");
		panel.add(etSuma);

		// asociamos la respuesta al click del raton al boton
		boton.addActionListener(this);

		this.add(panel);
	}
	public void actionPerformed(ActionEvent e) {
		// El cuerpo del metodo es la respuesta ante el evento de un click
		int suma = campo1.getint();
		etSaludo.setText("Hola " + nombre);

	}

}
