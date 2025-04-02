package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

	Scanner in = new Scanner(System.in);
	private int n1, n2;
	private JPanel panel;
	private JButton suma, resta, division, multiplicacion;
	private JTextField  result;
	private JTextArea op1, op2;
	private JLabel et;

	public Calculadora() {
		super("Elige una operacion con dos numeros que desees");

		this.setBounds(100, 100, 300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		constuirPanel();
		this.setVisible(true);

	}

	private void constuirPanel() {

		panel = new JPanel();

		et = new JLabel("N1:");
		panel.add(et);
		op1 = new JTextArea(in.nextLine());
		panel.add(op1);
		
		et = new JLabel("N2:");
		panel.add(et);
		op2 = new JTextArea(in.nextLine());
		panel.add(op2);
		
		et = new JLabel("Resultado:");
		panel.add(et);
		result = new JTextField(6);
		panel.add(result);

		suma = new JButton("Suma");
		panel.add(suma);
		
		resta = new JButton("Resta");
		panel.add(resta);
		
		multiplicacion = new JButton("Multiplicacion");
		panel.add(multiplicacion);
		
		division = new JButton("Division");
		panel.add(division);

		this.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == suma) {
			n1=op1;
			n2=op2;
			result.setText(" "+(n1+n2));
		}
		if (e.getSource() == resta) {
			n1=op1;
			n2=op2;
			result.setText(" "+ (n1-n2));
		}
		if (e.getSource() == multiplicacion) {
			n1=op1;
			n2=op2;
			result.setText(" "+ (n1*n2));
		}
		if (e.getSource() == division) {
			n1=op1;
			n2=op2;
			result.setText(" "+ (n1/n2));
		}
	}

}
