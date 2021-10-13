import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class WindowTTT extends JFrame{

	JMenuBar menuBar;
	JMenu game, help;
	JMenuItem jMenuItemTable, jMenuItemNewGame, jMenuItemExit;
	JPanel panel;

	public WindowTTT() {
		System.out.println("Entra aquí");
		setSize(600,600);
		setLocationRelativeTo(null);
		initComponents();
	}
	
	public void initComponents() {
		setPanel();
		setMenu();
	}
	
	public void setPanel() {
		panel = new JPanel();
		setSize(600,600);
		panel.setBackground(new Color(160, 250, 70));
		panel.setLayout(null);
		this.add(panel);
	}
	
	public void setMenu() {		
		game = new JMenu("Game");
		help = new JMenu("Help");
		//menuBar.setBounds(0, 0, 600, 25);
		
		jMenuItemTable = new JMenuItem("New Game");
		jMenuItemNewGame = new JMenuItem("Show Results Table"); 
		jMenuItemExit = new JMenuItem("Exit"); 
		game.add(jMenuItemTable);
		game.add(jMenuItemNewGame);
		game.add(jMenuItemExit);
		
		menuBar.add(game);
		menuBar.add(help);
		
		setJMenuBar(menuBar);
	}
}
