package snake;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Snake extends JFrame {

	private final int WIDTH = 640, HEIGHT = 480;
	Point snake;
	int widthPoint = 10;
	int heighPoint = 10;
	ImagenSnake imagenSnake;

	public Snake() {
		setTitle("Snake");
		setSize(WIDTH, HEIGHT);
		//Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		//this.setLocation(dim.width / 2 - WIDTH / 2, dim.height / 3 - HEIGHT / 2);
		this.setLocationRelativeTo(null);
		Keys keys = new Keys();
		this.addKeyListener(keys);
		snake = new Point(WIDTH / 2, HEIGHT / 2);
		imagenSnake = new ImagenSnake();
		this.getContentPane().add(imagenSnake);
		setVisible(true);
		
		Moment moment = new Moment();
		Thread thread = new Thread(moment);
		thread.start();
		
	}

}
