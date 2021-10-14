package snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keys extends KeyAdapter {

	int direction = KeyEvent.VK_LEFT;

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			if (direction != KeyEvent.VK_DOWN) {
				direction = KeyEvent.VK_UP;
			}
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			if (direction != KeyEvent.VK_UP) {
				direction = KeyEvent.VK_DOWN;
			}
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (direction != KeyEvent.VK_RIGHT) {
				direction = KeyEvent.VK_LEFT;
			}
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (direction != KeyEvent.VK_LEFT) {
				direction = KeyEvent.VK_RIGHT;
			}
		}
	}
}
