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
	JLabel showNumbers, show;
	JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	JButton jbClear, jbRadix, jbDivision, jbEraise, jbMultiplication, jbDifference, jbAddition;
	JButton jbConvert, jbDot, jbEquals;
	private String numbersString = "";
	private String operation = "null";
	private double number1, result;
	private boolean enabled = true;
	private boolean dot = true;

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

		showNumbers = new JLabel("       SEE HERE     ");
		showNumbers.setBackground(Color.RED);

		show = new JLabel("small label");
		show.setBackground(Color.RED);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		panel.add(show, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 4;
		gbc.gridheight = 2;
		panel.add(showNumbers, gbc);

		jbClear = new JButton("C");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbClear, gbc);
		clearActionPerformed();

		jbRadix = new JButton("√");
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbRadix, gbc);
		radixActionPerformed();

		jbDivision = new JButton("/");
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbDivision, gbc);
		divisionActionPerformed();

		jbEraise = new JButton("←");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbEraise, gbc);
		eraseActionPerformed();

		jb7 = new JButton("7");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb7, gbc);
		button7ActionPerformed();

		jb8 = new JButton("8");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb8, gbc);
		button8ActionPerformed();

		jb9 = new JButton("9");
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb9, gbc);
		button9ActionPerformed();

		jbMultiplication = new JButton("X");
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbMultiplication, gbc);
		multiplicationActionPerformed();

		jb4 = new JButton("4");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb4, gbc);
		button4ActionPerformed();

		jb5 = new JButton("5");
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb5, gbc);
		button5ActionPerformed();

		jb6 = new JButton("6");
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb6, gbc);
		button6ActionPerformed();

		jbDifference = new JButton("—");
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbDifference, gbc);
		differenceActionPerformed();

		jb1 = new JButton("1");
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb1, gbc);
		button1ActionPerformed();

		jb2 = new JButton("2");
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb2, gbc);
		button2ActionPerformed();

		jb3 = new JButton("3");
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb3, gbc);
		button3ActionPerformed();

		jbAddition = new JButton("+");
		gbc.gridx = 3;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbAddition, gbc);
		additionActionPerformed();

		jbConvert = new JButton("+-");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbConvert, gbc);
		conversionActionPerformed();

		jb0 = new JButton("0");
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb0, gbc);
		button0ActionPerformed();

		jbDot = new JButton(".");
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbDot, gbc);
		dotActionPerformed();

		jbEquals = new JButton("=");
		gbc.gridx = 3;
		gbc.gridy = 7;
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
					if (showNumbers.getText() == "0") {
						numbersString += "0";
					} else {
						numbersString += "0";
					}
					showNumbers.setText(numbersString);
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
				if (showNumbers.getText() == "0") {
					numbersString += "1";
				} else {
					numbersString += "1";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb1.addActionListener(action);
	}

	private void button2ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (showNumbers.getText() == "0") {
					numbersString += "2";
				} else {
					numbersString += "2";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb2.addActionListener(action);
	}

	private void button3ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (showNumbers.getText() == "0") {
					numbersString += "3";
				} else {
					numbersString += "3";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb3.addActionListener(action);
	}

	private void button4ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (showNumbers.getText() == "0") {
					numbersString += "4";
				} else {
					numbersString += "4";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb4.addActionListener(action);
	}

	private void button5ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (showNumbers.getText() == "0") {
					numbersString += "5";
				} else {
					numbersString += "5";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb5.addActionListener(action);
	}

	private void button6ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (showNumbers.getText() == "0") {
					numbersString += "6";
				} else {
					numbersString += "6";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb6.addActionListener(action);
	}

	private void button7ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (showNumbers.getText() == "0") {
					numbersString += "7";
				} else {
					numbersString += "7";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb7.addActionListener(action);
	}

	private void button8ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (showNumbers.getText() == "0") {
					numbersString += "8";
				} else {
					numbersString += "8";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb8.addActionListener(action);
	}

	private void button9ActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (showNumbers.getText() == "0") {
					numbersString += "9";
				} else {
					numbersString += "9";
				}
				showNumbers.setText(numbersString);
				enabled = true;
			}
		};
		jb9.addActionListener(action);
	}

	private void additionActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (enabled = true) {
					number1 = Double.parseDouble(numbersString); // cadena números
					show.setText(numbersString + " + ");// Etiqueta muestra y cadena números
					numbersString = ""; // Cadena números
					operation = "add";
					enabled = false;
				}
			}
		};
		jbAddition.addActionListener(action);
	}

	private void conversionActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numbersString.charAt(0) != '-') {
					numbersString = "-" + numbersString;
				} else {
					numbersString = numbersString.substring(1, numbersString.length());
				}
				showNumbers.setText(numbersString);
			}
		};
		jbConvert.addActionListener(action);
	}

	private void eraseActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int size = numbersString.length();
				if (size > 0) {
					if (size == 1) {
						numbersString = "0";
					} else {
						numbersString = numbersString.substring(0, numbersString.length() - 1);
					}
					showNumbers.setText(numbersString);
				}
			}
		};
		jbEraise.addActionListener(action);
	}

	private void differenceActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (enabled = true) {
					number1 = Double.parseDouble(numbersString);
					show.setText(numbersString + "-");
					numbersString = "";
					operation = "dif";
					enabled = false;
					dot = true;
				}
			}
		};
		jbDifference.addActionListener(action);
	}

	private void multiplicationActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (enabled = true) {
					number1 = Double.parseDouble(numbersString);
					show.setText(numbersString + "x");
					numbersString = "";
					operation = "mul";
					enabled = false;
					dot = true;
				}
			}
		};
		jbMultiplication.addActionListener(action);
	}

	private void divisionActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (enabled = true) {
					number1 = Double.parseDouble(numbersString);
					show.setText(numbersString + "x");
					numbersString = "";
					operation = "div";
					enabled = false;
					dot = true;
				}
			}
		};
		jbDivision.addActionListener(action);
	}

	private void radixActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(numbersString);
				show.setText("√" + numbersString + "");
				numbersString = "";
				result = Math.sqrt(number1);
				showNumbers.setText(String.format("%.2f", result)); // etiqueta numeros
				numbersString = String.valueOf(result); // Cadena números
				operation = "null";
				dot = true;
			}
		};
		jbRadix.addActionListener(action);
	}

	private void dotActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (dot == true) {
					if (numbersString == "") {
						numbersString += "0.";
					} else {
						numbersString += ".";
					}
					showNumbers.setText(numbersString); // Etiqueta numeros y cadena numeros
					dot = false;
				}
			}
		};
		jbDot.addActionListener(action);
	}

	private void equalsActionPerformed() {
		ActionListener action = new ActionListener() {
			double number2;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operation.equals("null")) {
					showNumbers.setText(numbersString); // etiqueta números y cadena números
				} else if (operation.equals("add")) {
					number2 = Double.parseDouble(numbersString); // cadena números
					result = number1 + number2;
					showNumbers.setText(String.format("%.2f", result)); // etiqueta numeros
					numbersString = String.valueOf(result); // Cadena números
					operation = "null";
				} else if (operation.equals("dif")) {
					number2 = Double.parseDouble(numbersString); // cadena números
					result = number1 - number2;
					showNumbers.setText(String.format("%.2f", result)); // etiqueta numeros
					numbersString = String.valueOf(result); // Cadena números
					operation = "null";
				} else if (operation.equals("mul")) {
					number2 = Double.parseDouble(numbersString); // cadena números
					result = number1 * number2;
					showNumbers.setText(String.format("%.2f", result)); // etiqueta numeros
					numbersString = String.valueOf(result); // Cadena números
					operation = "null";
				} else if (operation.equals("div")) {
					number2 = Double.parseDouble(numbersString); // cadena números
					result = number1 / number2;
					showNumbers.setText(String.format("%.2f", result)); // etiqueta numeros
					numbersString = String.valueOf(result); // Cadena números
					operation = "null";
				}
				show.setText("");
				enabled = true;
			}
		};
		jbEquals.addActionListener(action);
		enabled = true;
	}

	private void clearActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showNumbers.setText(numbersString);
				showNumbers.setText("0");
				numbersString = "";
				operation = "null";
				enabled = true;
				dot = true;
			}
		};
		jbClear.addActionListener(action);
	}
}