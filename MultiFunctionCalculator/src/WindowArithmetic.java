import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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

	public WindowArithmetic() {
		setVisible(true);
		setTitle("Oduad Multi plataform :)");
		setSize(350, 400);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		setPanel();
	}

	private void setPanel() {
		panel = new JPanel();
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		panel.setBackground(Color.cyan);
		panel.setLayout(gbl);
		this.add(panel);

		numbers = new JLabel(" ANAYA ");
		numbers.setBackground(Color.magenta);
		numbers.setSize(150, 60);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		panel.add(numbers, gbc);

		jbc = new JButton("  C  ");
		// jbc.setSize(40, 20);
		// gbc.fill();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		//gbc.weightx = 0.5;
		//gbc.weighty = 0.5;
		panel.add(jbc, gbc);

		jbpow = new JButton("Pow");
		// jbpow.setSize(40, 20);
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbpow, gbc);

		jbdiv = new JButton("  / ");
		// jbdiv.setSize(40, 20);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jbdiv, gbc);

		jberaise = new JButton("<--");
		// jberaise.setSize(40, 20);
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jberaise, gbc);

		jb7 = new JButton("  7  ");
		// jb7.setSize(40, 20);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb7, gbc);

		jb8 = new JButton("  8  ");
		// jb8.setSize(40, 20);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb8, gbc);

		jb9 = new JButton("  9  ");
		// jb9.setSize(40, 20);
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb9, gbc);

		jbmult = new JButton("  X  ");
		// jbmult.setSize(40, 20);
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

		jb2 = new JButton("  2  ");
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		panel.add(jb2, gbc);

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
	}
}
