package snake;

import java.awt.Point;
import java.awt.event.KeyEvent;

public class Moment extends Thread {

	long frequency = 20;
	int direction = KeyEvent.VK_LEFT;
	Point snake;
	int widthPoint = 10;
	int heighPoint = 10;
	private final int WIDTH = 640;
	private final int HEIGHT = 500;
	ImagenSnake imagenSnake;

	public void update() {
		imagenSnake = new ImagenSnake();
		imagenSnake.repaint();
	}

	public void run() {
		long last = 0;
		while (true) {
			if ((java.lang.System.currentTimeMillis() - last) > frequency) {

				if (direction == KeyEvent.VK_UP) {
					snake.y = snake.y - heighPoint;
					if (snake.y < 0) {
						snake.y = HEIGHT - heighPoint;
					}
					if (snake.y > HEIGHT) {
						snake.y = 0;
					}
				} else if (direction == KeyEvent.VK_DOWN) {
					snake.y = snake.y + heighPoint;
					if (snake.y < 0) {
						snake.y = HEIGHT - heighPoint;
					}
					if (snake.y > HEIGHT) {
						snake.y = 0;
					}
				} else if (direction == KeyEvent.VK_LEFT) {
					snake.x = snake.x - widthPoint;
					if (snake.x > WIDTH) {
						snake.x = 0;
					}
					if (snake.x < 0) {
						snake.x = WIDTH - widthPoint;
					}
				} else if (direction == KeyEvent.VK_RIGHT) {
					snake.x = snake.x + widthPoint;
					if (snake.x > WIDTH) {
						snake.x = 0;
					}
					if (snake.x < 0) {
						snake.x = WIDTH - widthPoint;
					}
				}
				update();
				last = java.lang.System.currentTimeMillis();
			}
		}
	}
}
