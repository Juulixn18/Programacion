package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaConDosBotones extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JButton btn1, btn2;
	
	public VentanaConDosBotones() {
		super("VentanaConDosBotones");
		this.setBounds(100, 100, 300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construirPanel();
		
		
		this.setVisible(true);
	}
	
	private void construirPanel() {
		panel = new JPanel();
		btn1 = new JButton("Boton 1");
		btn1.addActionListener(this);
		btn2 = new JButton("Boton 2");
		btn2.addActionListener(this);
		panel.add(btn1);
		panel.add(btn2);
		
		
		this.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
			System.out.println("Ha pulsado boton 1");
		}else {
			System.out.println("Ha pulsado boton 2");
		}
		
		
	}
	
	
}
