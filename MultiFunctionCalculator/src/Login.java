import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	private JPanel panel;
	private JTextField text1;
	private JPasswordField text2;
	private JLabel label1, label2;
	private JButton button;

	public Login() {
		setVisible(true);
		setSize(600, 400);
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
		panel.setBackground(Color.magenta);
		panel.setLayout(null);
		this.add(panel);
	}

	private void setLabels() {
		label1 = new JLabel("User: ");
		label1.setBounds(50, 100, 200, 20);
		label1.setFont(new Font("Arial", 1, 24));
		panel.add(label1);

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
		button.setBounds(235, 270, 150, 50);
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
					System.out.println(pass);
					if (password.equals(pass)) {
						System.out.println("You are in the system");
						MainWindow mainWindow = new MainWindow();
						setVisible(false);
					} else {
						System.out.println("Password unknown");
					}
				} else {
					System.out.println("User unknown");
				}
			}
		};
		button.addActionListener(action);
	}
}
