import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class WindowBillboard extends JFrame {

	Toolkit tk = getToolkit().getDefaultToolkit();
	private JPanel panel;
	private JScrollPane scroll;
	
	public WindowBillboard() {
		
		scroll = new JScrollPane();
		//scroll.setSize((int)tk.getScreenSize().getWidth()/2, (int)tk.getScreenSize().getHeight()/2);
		setPreferredSize(new Dimension((int)tk.getScreenSize().getWidth(), (int)tk.getScreenSize().getHeight()));
		this.getContentPane().add(scroll);
		initComponents();
		scroll.add(panel);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Billboard");
		setSize((int)tk.getScreenSize().getWidth()/2, (int)tk.getScreenSize().getHeight()/2);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

	public void initComponents() {
		setPanel();
	}

	public void setPanel() {
		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setLayout(new GridBagLayout());
		
	}
}
