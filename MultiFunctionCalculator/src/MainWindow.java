import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	JPanel panel;
	JMenuBar menuBar;
	JMenu operations, help, plots, games;
	JMenuItem jMenuItem1, jMenuItem2, jMenuItem3, jMenuItem4, jMenuItem5, jMenuItem6;

	public MainWindow() {
		setVisible(true);
		setTitle("Oduad Multi plataform :)");
		setSize(400, 550);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		setPanel();
		setMenuBar();
	}

	private void setPanel() {
		panel = new JPanel();
		// setSize(300,450);
		// panel.setBackground(Color.magenta);
		panel.setLayout(null);
		this.add(panel);
	}

	private void setMenuBar() {
		menuBar = new JMenuBar();
		operations = new JMenu("Operations");
		plots = new JMenu("Plots");
		help = new JMenu("Help");
		games = new JMenu("Games");
		menuBar.setBounds(0, 0, 400, 25);
		// menuBar.setBackground(Color.yellow);
		jMenuItem1 = new JMenuItem("Aritmetic operations");
		aritmeticActionPerformed();
		jMenuItem2 = new JMenuItem("Algebra operations");
		algebraActionPerformed();
		jMenuItem3 = new JMenuItem("Vector operations");
		jMenuItem4 = new JMenuItem("Algebra operations");
		jMenuItem5 = new JMenuItem("Numerical Methods");
		jMenuItem6 = new JMenuItem("Exit");
		close();
		menuBar.add(operations);
		menuBar.add(plots);
		menuBar.add(help);
		menuBar.add(games);
		operations.add(jMenuItem1);
		operations.add(jMenuItem2);
		operations.add(jMenuItem3);
		operations.add(jMenuItem4);
		operations.add(jMenuItem5);
		operations.add(jMenuItem6);
		setJMenuBar(menuBar);
	}

	private void aritmeticActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowArithmetic wa = new WindowArithmetic();
			}
		};
		jMenuItem1.addActionListener(action);
	}

	private void algebraActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowAlgebra wAlgebra = new WindowAlgebra();
			}
		};
		jMenuItem2.addActionListener(action);
	}

	private void close() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		jMenuItem6.addActionListener(action);
	}
}
