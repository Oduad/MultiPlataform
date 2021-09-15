import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowAlgebra extends JFrame {

	JPanel panel = new JPanel();
	GridBagConstraints gbc;
	GridBagLayout gbl;
	JLabel numbers;
	JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	JButton jbc, jbdiv, jberaise, jbmult, jbdiff, jbadd;
	JButton jbEquals;

	public WindowAlgebra() {
		setVisible(true);
		setTitle("Algebra Operations");
		setSize(350, 400);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		setPanel();
	}

	private void setPanel() {
		panel = new JPanel();
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		panel.setBackground(Color.magenta);
		panel.setLayout(gbl);
		this.add(panel);
	}
}
