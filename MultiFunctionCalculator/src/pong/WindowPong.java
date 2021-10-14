package pong;

import javax.swing.JFrame;

public class WindowPong extends JFrame {

	private final int high = 800, width = 500;
	private GameBoard sheet;
	private Thread thread;

	public WindowPong() {
		setVisible(true);
		setSize(high, width);
		setTitle("Pong");
		setLocationRelativeTo(null);
		setResizable(false);
		sheet = new GameBoard();
		add(sheet);
		addKeyListener(new KeyBoardEvent());
		thread = new Thread2(sheet);
		thread.start();
		//sheet.iterateGame();
	}
	
}
