package classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WindowChronometer extends JFrame{

	private Timer time;
	private JPanel panel;
	private JButton button1, button2, button3;
	private JLabel label, labelCount;
	private int hundredths = 0, seconds = 0, minutes = 0, hours = 0;

	private ActionListener actions = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			hundredths++;
			if (hundredths == 100) {
				seconds++;

				hundredths = 0;
			}
			if (seconds == 60) {
				minutes++;
				seconds = 0;
			}
			if (minutes == 60) {
				hours++;
				minutes = 0;
			}
			updateLabel();
		}
	};
	// button1.addActionListener(actions);
	// buttonStartActionPerformed();

	private void updateLabel() {
		String time = (hours <= 9 ? "0" : "") + hours + ":" + (minutes <= 9 ? "0" : "") + minutes + ":"
				+ (seconds <= 9 ? "0" : "") + seconds + ":" + (hundredths <= 9 ? "0" : "") + hundredths;
		labelCount.setText(time);
	}

	public WindowChronometer() {
		setVisible(true);
		setTitle("      Chronometer");
		setSize(600, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		initComponents();
		time = new Timer(10, actions);
	}

	private void initComponents() {
		setPanel();
		setButtons();
		setLabel();
	}

	private void setPanel() {
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		panel.setLayout(null);
		this.add(panel);
	}

	private void setButtons() {
		button1 = new JButton("Start");
		button2 = new JButton("Pause");
		button3 = new JButton("Stop");
		button1.setBounds(070, 300, 120, 30);
		button2.setBounds(230, 300, 120, 30);
		button3.setBounds(390, 300, 120, 30);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button1StartActionPerformed(evt);
			}
		});

		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button2StartActionPerformed(evt);
			}
		});

		button3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button3StartActionPerformed(evt);
			}
		});

	}

	private void setLabel() {
		label = new JLabel("C R O N O M E T E R");
		label.setBounds(300, 100, 200, 50);
		label.setFont(new Font("Arial", 1, 18));
		panel.add(label);
		labelCount = new JLabel("00:00:00:00");
		labelCount.setBounds(300, 180, 200, 50);
		labelCount.setFont(new Font("Arial", 1, 22));
		panel.add(labelCount);
	}

	private void button1StartActionPerformed(ActionEvent ae) {
		time.start();
		button1.setEnabled(false);
		button1.setText("Restart");
		button2.setEnabled(true);
		button3.setEnabled(true);
	}

	private void button2StartActionPerformed(ActionEvent ae) {
		time.stop();
		button1.setEnabled(true);
		button2.setEnabled(false);
	}

	private void button3StartActionPerformed(ActionEvent ae) {
		if (time.isRunning()) {
			time.stop();
			button1.setEnabled(true);
		}
		button1.setText("Start");
		button2.setEnabled(false);
		button3.setEnabled(false);
		hours = 0;
		minutes = 0;
		seconds = 0;
		hundredths = 0;
		updateLabel();
	}
}
