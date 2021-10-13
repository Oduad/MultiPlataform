package pong;

public class Thread2 extends Thread {

	GameBoard sheet;

	public Thread2(GameBoard sheet) {
		this.sheet = sheet;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(4);
			} catch (Exception e) {
				// TODO: handle exception
			}
			sheet.repaint();
		}
	}
}
