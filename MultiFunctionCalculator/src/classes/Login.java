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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	private JPanel panel;
	private JTextField text1;
	private JPasswordField text2;
	private JLabel label1, label2, labelShow;
	private JButton button;
	Toolkit tk = getToolkit().getDefaultToolkit();

	public Login() {
		setVisible(true);
		setSize((int)tk.getScreenSize().getWidth()/2+50, (int)tk.getScreenSize().getHeight()/2);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setUndecorated(true); //Para eliminar botones de un JFrame
		initComponents();
	}

	private void initComponents() {
		setPanel();
		setLabels();
		setTextFields();
		setButton();
	}

	private void setPanel() {
		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setLayout(null);
		this.add(panel);
	}

	private void setLabels() {
		label1 = new JLabel("User: ");
		label1.setBounds(50, 100, 200, 20);
		label1.setFont(new Font("Arial", 1, 24));
		panel.add(label1);
		
		labelShow = new JLabel("");
		labelShow.setBounds(450, 140, 250, 20);
		labelShow.setBackground(new Color(135, 206, 250));
		labelShow.setFont(new Font("Arial", 1, 15));
		panel.add(labelShow);

		label2 = new JLabel("Password: ");
		label2.setBounds(50, 180, 200, 20);
		label2.setFont(new Font("Arial", 1, 24));
		panel.add(label2);
	}

	private void setTextFields() {
		text1 = new JTextField();
		text1.setBounds(220, 95, 200, 28);
		text1.setFont(new Font("Arial", 1, 22));
		text1.setText("oduad");
		panel.add(text1);

		text2 = new JPasswordField();
		text2.setBounds(220, 175, 200, 28);
		text2.setFont(new Font("Arial", 1, 22));
		text2.setText("aragon");
		panel.add(text2);
	}

	private void setButton() {
		button = new JButton("Start");
		button.setFont(new Font("Arial", 1, 15));
		button.setBounds(235, 250, 150, 50);
		panel.add(button);
		jButtonActionPerformed();
	}

	private void jButtonActionPerformed() {

		String user = "oduad";
		String password = "aragon";

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (user.equals(text1.getText())) {
					String pass = "";
					for (int i = 0; i < text2.getPassword().length; i++) {
						pass += text2.getPassword()[i];
					}
					if (password.equals(pass)) {
						System.out.println("You are in the application");
						MainWindow mainWindow = new MainWindow();
						setVisible(false);
					} else {
						labelShow.setText("Wrong password!");
						System.out.println(pass+ " is a wrong password!");
					}
				} else {
					labelShow.setText(text1.getText()+" is not an user.");
					System.out.println(text1.getText()+" is not an user.");
				}
			}
		};
		button.addActionListener(action);
	}
}
