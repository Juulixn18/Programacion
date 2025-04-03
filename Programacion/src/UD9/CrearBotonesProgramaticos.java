package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CrearBotonesProgramaticos extends JFrame implements ActionListener {

	private final int NUM_BOTONES = 25;
	private JPanel panel;
	private JButton[] botones;

	public CrearBotonesProgramaticos() {
		this.setBounds(0, 0, 280, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		botones = new JButton[NUM_BOTONES];

		for (int i = 0; i < NUM_BOTONES; i++) {
			botones[i] = new JButton((i + 1) + "");
			panel.add(botones[i]);
			botones[i].addActionListener(this);;
		}

		this.add(panel);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		System.out.println("Pulsaste el boton" + boton);

	}

}
