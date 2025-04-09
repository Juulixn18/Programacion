package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotonesProgramaticamente extends JFrame implements ActionListener {
	private final int NUM_BOTONES=25;
	private JPanel panel;
	private JButton[] botones;
	
	public BotonesProgramaticamente() {
		super("Añadir botones programáticamente");
		this.setBounds(100, 100, 275, 275);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		this.add(panel);
		botones=new JButton[NUM_BOTONES];
		
		for (int i=0;i<NUM_BOTONES;i++) {
			botones[i]=new JButton((i+1)+"");
			panel.add(botones[i]);
			botones[i].addActionListener(this);
		}
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton=(JButton)e.getSource();
		System.out.println("Has pulsado el boton:"+boton.getText());
	}

}