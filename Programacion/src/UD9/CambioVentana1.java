package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CambioVentana1 extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton btn1;
	private CambioVentana1 cambioVentana;

	public CambioVentana1() {
		this.setBounds(0, 0, 280, 300);
		this.setLocationRelativeTo(null);
		construirPanel1();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cambioVentana= new CambioVentana1();
		
		

	}
	
	public void construirPanel1() {
		
		panel=new JPanel();
		btn1= new JButton("Abrir ventana 2");
		panel.add(btn1);
		this.add(panel);
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
			CambioVentana1 ;
		}

	}

}
