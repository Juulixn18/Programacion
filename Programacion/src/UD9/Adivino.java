package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Adivino extends JFrame implements ActionListener{
	
	private Random random;
	private JPanel panel;
	private JButton btn1, btn2, btn3;
	private JLabel nintentos, numero;
	
	
	public Adivino() {
		super("Adivina numero");
		this.setBounds(100, 100, 300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		constuirPanel();
		
		this.setVisible(true);
		
	}
	
	private void constuirPanel() {
		panel= new JPanel();
		random =new Random();
		btn1=new JButton("Mayor");
		btn1.addActionListener(this);
		btn2=new JButton("Menor");
		btn2.addActionListener(this);
		btn3=new JButton("Acertaste");
		btn3.addActionListener(this);
		
		nintentos=new JLabel("");
		numero=new JLabel(random.nextInt(100));
		
		
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		this.add(panel);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btn1) {
			et1.setText(et1+" ");
		}
		if (e.getSource()==btn2) {
			et2.setText(et2+" ");
		}
		if (e.getSource()==btn3) {
			et3.setText(et3+" ");
		}
		
	}
	
}
