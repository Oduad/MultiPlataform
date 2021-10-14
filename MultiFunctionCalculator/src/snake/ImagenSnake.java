package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

public class ImagenSnake extends JPanel {

	Point snake;
	int widthPoint = 10;
	int heighPoint = 10;
	private final int WIDTH = 640, HEIGHT = 480;
	
	public void paintComponent(Graphics g) {
		snake = new Point(WIDTH / 2, HEIGHT / 2);
		super.paintComponent(g);
		g.setColor(new Color(0,0,255));
		g.fillRect(snake.x, snake.y, widthPoint, heighPoint);
	}
}
