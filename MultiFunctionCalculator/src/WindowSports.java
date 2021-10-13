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
		setTitle("Window sports");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		startComponents();
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
		setBackground(Color.magenta);
		add(panel);
	}

	private void setLabel() {
		label = new JLabel("Choose your favorite sport");
		label.setBounds(200, 10, 250, 40);
		label.setFont(new Font("Arial", 0, 18));
		panel.add(label);
	}

	private void setRadioButtons() {
		rb1 = new JRadioButton("Soccer");
		rb1.setBounds(20, 80, 100, 40);
		rb1.setFont(new Font("Arial", 0, 18));

		rb2 = new JRadioButton("Basketball");
		rb2.setBounds(20, 140, 150, 40);
		rb2.setFont(new Font("Arial", 0, 18));

		rb3 = new JRadioButton("Swimming");
		rb3.setBounds(20, 200, 200, 40);
		rb3.setFont(new Font("Arial", 0, 18));

		rb4 = new JRadioButton("Powerlifting");
		rb4.setBounds(20, 260, 200, 40);
		rb4.setFont(new Font("Arial", 0, 18));

		panel.add(rb1);
		panel.add(rb2);
		panel.add(rb3);
		panel.add(rb4);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);
		group.add(rb4);
		
		actionEvent();
	}

	private void actionEvent() {
		imagen = new JLabel();
		imagen.setBounds(200, 80, 300, 200);
		panel.add(imagen);

		/*final ImageIcon imagenSoccer = new ImageIcon( getClass().getResource("/Images/soccer.jpg"));
		final ImageIcon imagenBasketball = new ImageIcon(getClass().getResource("/Images/basketball.jpg"));
		final ImageIcon imagenSwimming = new ImageIcon(getClass().getResource("/Images/swimming.jpg"));
		final ImageIcon imagenPowerlifting = new ImageIcon(getClass().getResource("/Images/powerlifting.jpg"));
		
		//JLabel lblNewLabel = new JLabel("   Nombre(s):");
		//lblNewLabel.setIcon(new ImageIcon(PanelRegistroWindow.class.getResource("/images/nombre.png")));

		ActionListener action1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenSoccer.getImage().getScaledInstance(imagen.getWidth(),
						imagen.getHeight(), Image.SCALE_SMOOTH)));
			}
		};
		rb1.addActionListener(action1);

		ActionListener action2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenBasketball.getImage().getScaledInstance(imagen.getWidth(),
						imagen.getHeight(), Image.SCALE_SMOOTH)));
			}
		};
		rb2.addActionListener(action2);
		
		ActionListener action3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenSwimming.getImage().getScaledInstance(imagen.getWidth(),
						imagen.getHeight(), Image.SCALE_SMOOTH)));
			}
		};
		rb3.addActionListener(action3);

		ActionListener action4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imagen.setIcon(new ImageIcon(imagenPowerlifting.getImage().getScaledInstance(imagen.getWidth(),
						imagen.getHeight(), Image.SCALE_SMOOTH)));
			}
		};
		rb4.addActionListener(action4);*/
	}
}
