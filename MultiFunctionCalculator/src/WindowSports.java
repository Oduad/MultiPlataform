import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class WindowSports extends JFrame {

	private JPanel panel;
	private JLabel label, imagen;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JRadioButton rb3;
	private JRadioButton rb4;

	public WindowSports() {
		setSize(900, 600);
		setTitle("Title");
		setVisible(true);
		startComponents();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void startComponents() {
		setPanel();
		setLabel();
		setRadioButtons();
	}
	
	private void setPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		setTitle("BB");
		setBackground(Color.yellow);
		add(panel);
	}

	private void setLabel() {
		label = new JLabel("Choose your favorite sport");
		label.setBounds(200, 10, 250, 40);
		label.setFont(new Font("Arial", 0, 20));
		panel.add(label);
	}

	private void setRadioButtons() {
		rb1 = new JRadioButton("Soccer");
		rb1.setBounds(20, 80, 100, 40);
		rb1.setFont(new Font("Arial", 0, 18));
		
		rb2 = new JRadioButton("Basketball");
		rb2.setBounds(20, 140, 150, 40);
		rb2.setFont(new Font("Arial", 0, 18));
		
		rb3 = new JRadioButton("Running");
		rb3.setBounds(20, 200, 200, 40);
		rb3.setFont(new Font("Arial", 0, 18));
		
		rb4 = new JRadioButton("Powerlifting");
		rb4.setBounds(20, 260, 00, 40);
		rb4.setFont(new Font("Arial", 0, 18));
		
		panel.add(rb1);
		panel.add(rb2);
		panel.add(rb3);
		panel.add(rb4);
		actionEvent();
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);
		group.add(rb4);
	}

	private void actionEvent() {
		imagen = new JLabel();
		imagen.setBounds(200, 80, 300, 200);
		panel.add(imagen);

		final ImageIcon imagenSoccer = new ImageIcon(getClass().getResource("/Imagenes/soccer.png"));

		ActionListener action1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenSoccer.getImage().getScaledInstance(imagen.getWidth(),
						imagen.getHeight(), Image.SCALE_SMOOTH)));
			}
		};
		rb1.addActionListener(action1);
	}
	
}
