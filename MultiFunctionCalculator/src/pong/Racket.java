package pong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Racket {

	private int x, y;
	private final int WIDTH = 10, HEIGHT = 45;

	public Racket(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Rectangle2D getRacket() {
		return new Rectangle2D.Double(x, y, WIDTH, HEIGHT);
	}

	public void moveRacket1(Rectangle limits) {
		if (KeyBoardEvent.w && y > limits.getMinY()) {
			y--;
		}
		if (KeyBoardEvent.s && y < limits.getMaxY() - HEIGHT) {
			y++;
		}
	}

	public void moveRacket2(Rectangle limits) {
		if (KeyBoardEvent.up && y > limits.getMinY()) {
			y--;
		}
		if (KeyBoardEvent.down && y < limits.getMaxY() - HEIGHT) {
			y++;
		}
	}

}
