import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowBillboard extends JFrame {

	Toolkit tk = getToolkit().getDefaultToolkit();
	JPanel panel;
	
	public WindowBillboard() {
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Billboard");
		setSize((int)tk.getScreenSize().getWidth()/2, (int)tk.getScreenSize().getHeight()/2);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		initComponents();
	}

	public void initComponents() {
		setPanel();
	}

	public void setPanel() {
		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
	}

}
