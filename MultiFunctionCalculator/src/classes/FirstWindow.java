package classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstWindow extends JFrame{

	private Toolkit tk = getToolkit().getDefaultToolkit();
	private JPanel panel;
	private JLabel label1, label2;
	private JButton button1, button2;

	public FirstWindow() {
		setVisible(true);
		setSize((int) tk.getScreenSize().getWidth() / 2, (int) tk.getScreenSize().getHeight() / 2);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setUndecorated(true); //Para eliminar botones de un JFrame
		initComponents();
	}

	public void initComponents() {
		setPanel();
		setLabels();
		setButtons();
	}

	private void setPanel() {
		panel = new JPanel();
		panel.setBackground(new Color(250, 120, 20));
		panel.setLayout(null);
		this.add(panel);
	}

	private void setLabels() {
		label1 = new JLabel("User: ");
		label1.setBounds(50, 100, 200, 20);
		label1.setFont(new Font("Arial", 1, 18));
		panel.add(label1);

		label2 = new JLabel("Guest: ");
		label2.setBounds(50, 180, 200, 20);
		label2.setFont(new Font("Arial", 1, 18));
		panel.add(label2);
	}

	private void setButtons() {
		button1 = new JButton();
		button1.setBounds(220, 95, 200, 28);
		button1.setFont(new Font("Arial", 1, 18));
		button1.setText("Enter as user");
		panel.add(button1);
		button1_ActionPerformed();

		button2 = new JButton();
		button2.setBounds(220, 175, 200, 28);
		button2.setFont(new Font("Arial", 1, 18));
		button2.setText("Enter as guest");
		panel.add(button2);		
		button2_ActionPerformed();
	}
	
	private void button1_ActionPerformed() {

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				setVisible(false);
			}
		};
		button1.addActionListener(action);
	}
	
	private void button2_ActionPerformed() {

		ActionListener action = new ActionListener() {
			
			 @Override
			public void actionPerformed(ActionEvent e) {
				MainWindow mw = new MainWindow();
				setVisible(false);
			}
		};
		button2.addActionListener(action);
	}
	
}
