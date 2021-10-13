package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class GameBoard extends JPanel {

	Ball ball = new Ball(0, 0);
	Racket r1 = new Racket(010, 200);
	Racket r2 = new Racket(769, 200);

	public GameBoard() {
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.YELLOW);
		draw(g2);
		update();
	}

	// To draw the ball and the rackets
	public void draw(Graphics2D g) {
		// Graphics2D g2 = (Graphics2D)g;
		g.fill(ball.getBall());
		g.fill(r1.getRacket());
		g.fill(r2.getRacket());
	}

	public void update() {
		ball.moveBall(getBounds(), collision(r1.getRacket()), collision(r2.getRacket()));
		r1.moveRacket1(getBounds());
		r2.moveRacket2(getBounds());
	}

	public void iterateGame() {
		while (true) {
			try {
				repaint();
				Thread.sleep(6);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	private boolean collision(Rectangle2D r) {
		return ball.getBall().intersects(r);

	}
}
