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
	JMenu operations, help, plots, games, apps;
	JMenuItem jMenuItemArithmetic, jMenuItemAlgebra, jMenuItem3, jMenuItem4, jMenuItem5, jMenuItem6, jMenuItem7;
	JMenuItem jMenuItemGameColors, jMenuItemThree;
	JMenuItem jMenuItemCounter, jMenuItemChronometer, jMenuItemAddPerson;

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
		games = new JMenu("Games");
		help = new JMenu("Help");
		operations = new JMenu("Operations");
		plots = new JMenu("Plots");
		apps = new JMenu("Small Aps");
		menuBar.setBounds(0, 0, 400, 25);
		// menuBar.setBackground(Color.yellow);
		// For option operations:
		jMenuItemArithmetic = new JMenuItem("Aritmetic operations");
		aritmeticActionPerformed();
		jMenuItemAlgebra = new JMenuItem("Algebra operations");
		algebraActionPerformed();
		jMenuItem3 = new JMenuItem("Vector operations");
		jMenuItem4 = new JMenuItem("Matrix operations");
		jMenuItem5 = new JMenuItem("Numerical Methods");
		jMenuItem6 = new JMenuItem("Statistics");
		jMenuItem7 = new JMenuItem("Exit");
		close();
		operations.add(jMenuItemArithmetic);
		operations.add(jMenuItemAlgebra);
		operations.add(jMenuItem3);
		operations.add(jMenuItem4);
		operations.add(jMenuItem5);
		operations.add(jMenuItem6);
		// For option small aps:
		jMenuItemCounter = new JMenuItem("Click Counter");
		CounterActionPerformed();
		jMenuItemChronometer = new JMenuItem("Chronometer");
		ChronometerActionPerformed();
		jMenuItemAddPerson = new JMenuItem("Add Person");
		AddPersonActionPerformed();
		apps.add(jMenuItemAddPerson);
		apps.add(jMenuItemCounter);
		apps.add(jMenuItemChronometer);
		// For option games:
		jMenuItemGameColors = new JMenuItem("Game 'Colors' ");
		colorsGameActionPerformed();
		jMenuItemThree = new JMenuItem("Tic-tac-toe");
		tttActionPerformed();
		
		games.add(jMenuItemGameColors);
		games.add(jMenuItemThree);

		menuBar.add(apps);
		menuBar.add(games);
		menuBar.add(help);	
		setJMenuBar(menuBar);
		menuBar.add(operations);
		menuBar.add(plots);
	}

	private void aritmeticActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowArithmetic wa = new WindowArithmetic();
			}
		};
		jMenuItemArithmetic.addActionListener(action);
	}

	private void algebraActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowAlgebra wAlgebra = new WindowAlgebra();
			}
		};
		jMenuItemAlgebra.addActionListener(action);
	}

	private void colorsGameActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowColorGame wColorGame = new WindowColorGame();
			}
		};
		jMenuItemGameColors.addActionListener(action);
	}
	
	
	private void CounterActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowCounter wColorGame = new WindowCounter();
			}
		};
		jMenuItemCounter.addActionListener(action);
	}
	
	private void ChronometerActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowChronometer wChr = new WindowChronometer();
			}
		};
		jMenuItemChronometer.addActionListener(action);
	}
	
	private void AddPersonActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowPerson wPerson = new WindowPerson();
			}
		};
		jMenuItemAddPerson.addActionListener(action);
	}
	
	private void tttActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//WindowTTT wTTT = new WindowTTT();
			}
		};
		jMenuItemThree.addActionListener(action);
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
