package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Adivino extends JFrame implements ActionListener{
	

	private JPanel panel;
	private JButton mayor, menor, acertar;
	private JLabel et1;
	private boolean ganar;
	private int min, max, numGenerado;
	
	
	public Adivino() {
		super("Adivina numero");
		min=1; 
		max=100;
		
		this.setBounds(100, 100, 300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		constuirPanel();
		
		this.setVisible(true);
		
	}
	
	private void constuirPanel() {
		
		panel= new JPanel();
		et1=new JLabel();
		
		numGenerado=generaNumero();
		et1.setText("Creo que el numero es: "+numGenerado);
		panel.add(et1);
		
		mayor=new JButton("Mayor");
		mayor.addActionListener(this);
		
		panel.add(mayor);
		
		menor=new JButton("Menor");
		menor.addActionListener(this);
		panel.add(menor);
		
		this.add(panel);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==acertar) {
			et1.setText("Has acertado");
			menor.setEnabled(false);
			mayor.setEnabled(false);
			acertar.setText("Empezar");
		}
		if (e.getSource()==menor) {
			max=numGenerado;
			numGenerado=generaNumero();
			et1.setText("Creo que el numero es: "+numGenerado);
		}
		if (e.getSource()==mayor) {
			min=numGenerado;
			numGenerado=generaNumero();
			et1.setText("Creo que el numero es: "+numGenerado);
		}
		
	}
	
	private int generaNumero() {
		return (max-min)/2+min;
	}
	
}
