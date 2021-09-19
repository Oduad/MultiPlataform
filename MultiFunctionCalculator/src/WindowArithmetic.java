import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowArithmetic extends JFrame {

	JPanel panel = new JPanel();
	GridBagConstraints gbc;
	GridBagLayout gbl;
	JLabel numbers;
	JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	JButton jbc, jbpow, jbdiv, jberaise, jbmult, jbdiff, jbadd;
	JButton jbConvert, jbDot, jbEquals;
	private String numbersString = "";
	private String operation = "null";
	private double number1, result;
	private boolean enabled = true;

	public WindowArithmetic() {
		setVisible(true);
		setTitle("Arithmetic Operations");
		setSize(350, 400);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		setPanel();
	}

	private void setPanel() {
		panel = new JPanel();
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		panel.setBackground(Color.cyan);
		panel.setLayout(gbl);
		this.add(panel);

		numbers = new JLabel("       SEE HERE     ");
		numbers.setBackground(Color.RED);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.gridheight = 2;
		panel.add(numbers, gbc);

		jbc = new JButton("  C  ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbc, gbc);

		jbpow = new JButton("Pow");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbpow, gbc);

		jbdiv = new JButton("  / ");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbdiv, gbc);

		jberaise = new JButton("<--");
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jberaise, gbc);

		jb7 = new JButton("  7  ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb7, gbc);

		jb8 = new JButton("  8  ");
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb8, gbc);

		jb9 = new JButton("  9  ");
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb9, gbc);

		jbmult = new JButton("  X  ");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbmult, gbc);

		jb4 = new JButton("  4  ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb4, gbc);

		jb5 = new JButton("  5  ");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb5, gbc);

		jb6 = new JButton("  6  ");
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb6, gbc);

		jbdiff = new JButton("  -  ");
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbdiff, gbc);

		jb1 = new JButton("  1  ");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb1, gbc);
		button1ActionPerformed();

		jb2 = new JButton("  2  ");
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb2, gbc);
		button2ActionPerformed();

		jb3 = new JButton("  3  ");
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb3, gbc);

		jbadd = new JButton("  +  ");
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbadd, gbc);
		plus2ActionPerformed();

		jbConvert = new JButton(" +- ");
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbConvert, gbc);

		jb0 = new JButton("  0  ");
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb0, gbc);
		button0ActionPerformed();

		jbDot = new JButton("  . ");
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbDot, gbc);

		jbEquals = new JButton(" = ");
		gbc.gridx = 3;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbEquals, gbc);
		equalsActionPerformed();
	}

	private void button0ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numbersString != "") {
					numbersString += "0";
					numbers.setText(numbersString);
					enabled = true;
				}
			}
		};
		jb0.addActionListener(action);
	}

	private void button1ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numbersString += "1";
				numbers.setText(numbersString);
				enabled = true;
			}
		};
		jb1.addActionListener(action);
	}

	private void button2ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numbersString += "2";
				numbers.setText(numbersString);
				enabled = true;
			}
		};
		jb2.addActionListener(action);
	}

	private void plus2ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (enabled = true) {
					number1 = Double.parseDouble(numbersString);
					numbers.setText(numbersString + " + ");
					numbersString = "";
					operation = "add";
					enabled = false;
				}
			}
		};
		jbadd.addActionListener(action);
	}

	private void equalsActionPerformed() {
		ActionListener action = new ActionListener() {
			double number2;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operation.equals("null")) {
					numbers.setText(numbersString + " + ");
				} else if (operation.equals("add")) {
					number2 = Double.parseDouble(numbersString);
					result = number1 + number2;
					numbers.setText(String.format("%.2f", result));
					numbersString = String.valueOf(result);
					operation = "null";
				}
				numbers.setText(numbersString + "");
			}
		};
		jbEquals.addActionListener(action);
		enabled = true;
	}
}
