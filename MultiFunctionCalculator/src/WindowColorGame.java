import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WindowColorGame extends JFrame {

	private JPanel panel;
	private JButton button1, button2, button3;
	private JLabel label;
	private int pulsado = 0;
	private int redCounter = 0, greenCounter = 0, blueCounter = 0;

	public WindowColorGame() {
		setSize(600, 400);
		setTitle("         Game colors");
		setLocationRelativeTo(null);
		//setLayout(null);
		setVisible(true);
		startComponents();
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

	private void startComponents() {
		setPanel();
		setLabel();
		setButtons();
	}

	private void setPanel() {
		panel = new JPanel();
		panel.setBackground(Color.magenta);
		this.add(panel);
		wheelEvent();
	}

	private void setLabel() {
		label = new JLabel("Color (Rojo, Verde, Azul)");
		label.setBounds(100, 60, 400, 50);
		label.setFont(new Font("Arial", 0, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
	}

	private void setButtons() {
		// pulsado = 0 --> Ningungo
		// pulsado = 1 --> Rojo
		// pulsado = 3 --> Azul

		button1 = new JButton("Red");
		button1.setBounds(50, 230, 130, 50);
		button1.setForeground(Color.RED);
		button1.setFont(new Font("arial rounded my bold", 0, 20));
		panel.add(button1);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pulsado = 1;
			}
		});

		button2 = new JButton("Green");
		button2.setBounds(230, 230, 130, 50);
		button2.setForeground(Color.GREEN);
		button2.setFont(new Font("arial rounded my bold", 0, 20));
		panel.add(button2);

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pulsado = 2;
			}
		});

		button3 = new JButton("Blue");
		button3.setBounds(410, 230, 130, 50);
		button3.setForeground(Color.BLUE);
		button3.setFont(new Font("arial rounded my bold", 0, 20));
		panel.add(button3);

		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pulsado = 3;
			}
		});
	}

	private void wheelEvent() {
		MouseWheelListener mouseWheel = new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				if (pulsado != 0) {
					if (pulsado == 1) {
						redCounter += e.getWheelRotation();
						if (redCounter < 0) {
							redCounter = 0;
						}
						if (redCounter > 255) {
							redCounter = 0;
						}
					} else if (pulsado == 2) {
						greenCounter += e.getWheelRotation();
						if (greenCounter < 0) {
							greenCounter = 0;
						}
						if (greenCounter > 255) {
							greenCounter = 255;
						}
					} else {
						blueCounter += e.getWheelRotation();
						if (blueCounter < 0) {
							blueCounter = 0;
						}
						if (blueCounter > 255) {
							blueCounter = 255;
						}
					}
				}
				label.setText("Color (Red = " + redCounter + ", Green = " + greenCounter + ", Blue = " + blueCounter);
				panel.setBackground(new Color(redCounter, greenCounter, blueCounter));
			}
		};
		panel.addMouseWheelListener(mouseWheel);
	}
}