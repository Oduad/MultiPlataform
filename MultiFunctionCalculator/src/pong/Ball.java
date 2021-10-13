package pong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Ball {

	private int x, y;
	private final int WIDTH = 12, HEIGHT = 12;
	private int dx = 1, dy = 1;

	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// So that the ball is returned
	public Rectangle2D getBall() {
		return new Rectangle2D.Double(x, y, WIDTH, HEIGHT);
	}

	public void moveBall(Rectangle limits, boolean collisionR1, boolean collisionR2) {
		x += dx;
		y += dy;

		if (collisionR1) {
			dx = -dx;
			x = 25;
		}

		if (collisionR2) {
			dx = -dx;
			x = 755;
		}

		if (x > limits.getMaxX() - 12) {
			dx = -dx;
		}
		if (y > limits.getMaxY() - 12) {
			dy = -dy;
		}
		if (x < 0) {
			dx = -dx;
		}
		if (y < 0) {
			dy = -dy;
		}
	}

}
