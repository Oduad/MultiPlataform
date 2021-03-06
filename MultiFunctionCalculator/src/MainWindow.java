import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import tictactoe.MainTicTacToe;

public class MainWindow extends JFrame {

	JPanel panel;
	JMenuBar menuBar;
	JMenu operations, help, plots, games, apps, close, plainCalculator;
	JMenuItem jMenuItemArithmetic, jMenuItemAlgebra, jMenuItem3, jMenuItem4, jMenuItem5, jMenuItemStatistics,
			jMenuItemPlainCalculator, jMenuItemExit;
	JMenuItem jMenuItemGameColors, jMenuItemTTT, jMenuItemPong ;
	JMenuItem jMenuItemCounter, jMenuItemChronometer, jMenuItemAddPerson, jMenuItemShowSports, jMenuItemBillboard,
			jMenuItemCRUD;
	Toolkit tk = getToolkit().getDefaultToolkit();;
	
	public MainWindow() {
		setVisible(true);
		setTitle("  Welcome to Oduad Multi plataform :)");
		setSize((int)tk.getScreenSize().getWidth()/2, (int)tk.getScreenSize().getHeight()/2);
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
		panel.setBackground(new Color(160, 250, 70));
		panel.setLayout(null);
		this.add(panel);
	}

	private void setMenuBar() {
		menuBar = new JMenuBar();
		close = new JMenu("Close");
		games = new JMenu("Games");
		help = new JMenu("Help");
		operations = new JMenu("Interface Calculators");
		plainCalculator = new JMenu("Plain Calculator");
		plots = new JMenu("Plots");
		apps = new JMenu("Small Aps");
		menuBar.setBounds(0, 0, 500, 25);
		
		// For option operations:
		jMenuItemArithmetic = new JMenuItem("Aritmetic operations");
		aritmeticActionPerformed();
		jMenuItemAlgebra = new JMenuItem("Algebra operations");
		algebraActionPerformed();
		jMenuItem3 = new JMenuItem("Vector operations");
		jMenuItem4 = new JMenuItem("Matrix operations");
		jMenuItem5 = new JMenuItem("Numerical Methods");
		jMenuItemPlainCalculator = new JMenuItem("Plain Calculator");
		jMenuItemStatistics = new JMenuItem("Statistics");
		plainCalculatorActionPerformed();
		jMenuItemExit = new JMenuItem("Exit");
		close();
		operations.add(jMenuItemArithmetic);
		operations.add(jMenuItemAlgebra);
		operations.add(jMenuItem3);
		operations.add(jMenuItem4);
		operations.add(jMenuItem5);
		operations.add(jMenuItemStatistics);
		operations.add(jMenuItemPlainCalculator);
		// For option small aps:
		jMenuItemCounter = new JMenuItem("Click Counter");
		CounterActionPerformed();
		jMenuItemChronometer = new JMenuItem("Chronometer");
		ChronometerActionPerformed();
		jMenuItemAddPerson = new JMenuItem("Add Person");
		AddPersonActionPerformed();
		jMenuItemShowSports = new JMenuItem("Show Sports");
		sportsActionPerformed();
		jMenuItemBillboard = new JMenuItem("Billboard");
		billboardActionPerformed();
		jMenuItemCRUD = new JMenuItem("CRUD");

		apps.add(jMenuItemAddPerson);
		apps.add(jMenuItemBillboard);
		apps.add(jMenuItemCounter);
		apps.add(jMenuItemCRUD);
		apps.add(jMenuItemChronometer);
		apps.add(jMenuItemShowSports);
		// For option games:
		jMenuItemGameColors = new JMenuItem("Game 'Colors' ");
		colorsGameActionPerformed();
		jMenuItemTTT = new JMenuItem("Tic-tac-toe");
		tttActionPerformed();
		jMenuItemPong = new JMenuItem("Pong");
		///pongActionPerformed();
		games.add(jMenuItemGameColors);
		games.add(jMenuItemPong);
		games.add(jMenuItemTTT);
		
		plainCalculator.add(jMenuItemPlainCalculator);

		menuBar.add(close);
		menuBar.add(games);
		menuBar.add(help);
		menuBar.add(operations);
		menuBar.add(plainCalculator);
		menuBar.add(plots);
		menuBar.add(apps);

		setJMenuBar(menuBar);
	}

	private void aritmeticActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowArithmetic wa = new WindowArithmetic();
				// setVisible(false);
			}
		};
		jMenuItemArithmetic.addActionListener(action);
	}

	private void algebraActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowAlgebra wAlgebra = new WindowAlgebra();
				
				//setVisible(false);
			}
		};
		jMenuItemAlgebra.addActionListener(action);
	}

	private void colorsGameActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowColorGame wColorGame = new WindowColorGame();
				//setVisible(false);
			}
		};
		jMenuItemGameColors.addActionListener(action);
	}

	private void CounterActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowCounter wCounter = new WindowCounter();
				//WindowChronometer wChr = new WindowChronometer();
				//setVisible(false);
			}
		};
		jMenuItemCounter.addActionListener(action);
	}

	private void ChronometerActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowChronometer wChr = new WindowChronometer();
				//setVisible(false);
			}
		};
		jMenuItemChronometer.addActionListener(action);
	}

	private void AddPersonActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowPerson wPerson = new WindowPerson();
				//setVisible(false);
			}
		};
		jMenuItemAddPerson.addActionListener(action);
	}

	private void tttActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowTTT wTTT = new WindowTTT();
				wTTT.setVisible(true);
			}
		};
		jMenuItemTTT.addActionListener(action);
	}

	private void sportsActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowSports wSport = new WindowSports();
				
			}
		};
		jMenuItemShowSports.addActionListener(action);
	}

	private void plainCalculatorActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlainCalculator pc = new PlainCalculator();
				pc.chooseOption();
			}
		};
		jMenuItemPlainCalculator.addActionListener(action);
	}

	private void billboardActionPerformed() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WindowBillboard wBb = new WindowBillboard();
			}
		};
		jMenuItemBillboard.addActionListener(action);
	}

	private void close() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		jMenuItemExit.addActionListener(action);
	}
}
