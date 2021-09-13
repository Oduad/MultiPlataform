import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	JPanel panel;
	JMenuBar menuBar;
	JMenu operations, help, plots;
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
		//panel.setBackground(Color.magenta);
		panel.setLayout(null);
		this.add(panel);
	}

	private void setMenuBar() {
		menuBar = new JMenuBar();
		operations = new JMenu("Operations");
		plots = new JMenu("Plots");
		help = new JMenu("Help");
		menuBar.setBounds(0, 0, 400, 25);
		// menuBar.setBackground(Color.yellow);
		jMenuItem1 = new JMenuItem("Aritmetic operations");
		jMenuItem1.addActionListener(null);
		jMenuItem2 = new JMenuItem("Algebra operations");
		jMenuItem3 = new JMenuItem("Vector operations");
		jMenuItem4 = new JMenuItem("Algebra operations");
		jMenuItem5 = new JMenuItem("Numerical Methods");
		jMenuItem6 = new JMenuItem("Exit");
		menuBar.add(operations);
		menuBar.add(plots);
		menuBar.add(help);
		operations.add(jMenuItem1);
		operations.add(jMenuItem2);
		operations.add(jMenuItem3);
		operations.add(jMenuItem4);
		operations.add(jMenuItem5);
		setJMenuBar(menuBar);
	}
	
	private void aritmeticActionPerformed(ActionEvent ae) {
		WindowArithmetic wa = new WindowArithmetic();
	}
}
