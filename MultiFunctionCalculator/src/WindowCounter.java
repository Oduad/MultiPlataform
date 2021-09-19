import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WindowCounter extends JFrame{

	private JPanel panel;
	private JButton button;
	private JLabel label;
	private int counter = 0;

	public WindowCounter() {
		setSize(600, 400);
		setTitle("           Counter");
		setLocationRelativeTo(null);
		setVisible(true);
		startComponents();
		panel.setBackground(Color.YELLOW);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

	private void startComponents() {
		setPanel();
		setLabel();
		setButton();
	}

	private void setPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		// panel.setBackground(Color.yellow);
		add(panel);
	}

	private void setLabel() {
		label = new JLabel("Pulse the button");
		label.setBounds(0, 50, 400, 40);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", 0, 20));
		panel.add(label);
	}

	private void setButton() {
		button = new JButton();
		button.setBounds(110, 200, 180, 50);
		button.setText("Pulse here");
		button.setFont(new Font("Cooper black", 0, 18));
		panel.add(button);
		actionEvent();
	}

	private void actionEvent() {
		ActionListener alist = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				if (counter == 1) {
					label.setText("You've pressed the button once.");
				} else {
					label.setText("You've pressed the button " + counter + " times.");
				}
			}
		};
		button.addActionListener(alist);
	}
}
