import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class WindowPerson extends JFrame{

	private JPanel panel;
	private JLabel person, personData, name, lastName, email, cel, home;;
	private JComboBox combo;
	private JButton button1;
	private JTable table;
	private JTextField text1, text2, text3, text4, text5;
	private DefaultComboBoxModel<Person> modelCombo = new DefaultComboBoxModel<Person>();
	private DefaultTableModel tableModel = new DefaultTableModel();
	private DefaultTableModel model;
	
	public WindowPerson() {
		setVisible(true);
		setSize(450, 650);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("      AddPerson Interface");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		fillComboBox();
		initComponents();
	}

	private void initComponents() {
		setPanel();
		setButton();
		setLabels();
		setCombo();
		addDatatoTableModel();
		setTextFields();
	}
	
	private void setPanel() {
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		this.add(panel);
	}

	private void setLabels() {
		person = new JLabel("Person");
		person.setBounds(50, 50, 90, 20);
		panel.add(person);

		personData = new JLabel("Person Data");
		personData.setBounds(50, 350, 80, 25);
		panel.add(personData);

		name = new JLabel("Name");
		name.setBounds(50, 380, 90, 30);
		panel.add(name);

		lastName = new JLabel("Last Name");
		lastName.setBounds(250, 380, 90, 30);
		panel.add(lastName);

		email = new JLabel("Email");
		email.setBounds(50, 440, 90, 30);
		panel.add(email);

		home = new JLabel("Phone");
		home.setBounds(250, 440, 90, 30);
		panel.add(home);

		cel = new JLabel("Home");
		cel.setBounds(50, 520, 90, 30);
		panel.add(cel);
	}

	private void setButton() {
		button1 = new JButton("Insert Person");
		button1.setBounds(250, 90, 120, 25);
		button1.setFont(new Font("Arial", 0, 12));
		panel.add(button1);
		button1ActionPerformed();
	}

	private void setCombo() {
		combo = new JComboBox(modelCombo);
		combo.setBounds(50, 90, 120, 25);
		panel.add(combo);
	}

	private void fillComboBox() {
		modelCombo.addElement(new Person("Carlos", "Aragón", "ing.aragon", "222345679", "Ant-Riva Palacio"));
		modelCombo.addElement(new Person("Oduad", "Aragón", "aragon", "551345679", "Riva Palacio"));
		modelCombo.addElement(new Person("Ollin", "Aragón", "lic.aragon", "550345679", "Chopo"));
		modelCombo.addElement(new Person("Luigi", "Aragón", "no_mail", "USA", "Ex-Riva Palacio"));
	}

	private void addDatatoTableModel() {

		model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Last name");
		model.addColumn("Email");
		model.addColumn("Cellphone");
		model.addColumn("Direction");
		
		table = new JTable(model);
		panel.add(table);

		JScrollPane scroll = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED); // Added to the table
		scroll.setBounds(50, 150, 320, 180);
		table.setBounds(50, 150, 320, 180);
		panel.add(scroll);

		String[] person1 = { "Oduad", "Aragón", "aragon", "9513549692" };
		String[] person2 = { "Xochitl", "Reyes", "reyes", "2223549692" };
		model.addRow(person1);
		model.addRow(person2);
		tableActionPerformed();
	}

	private void setTextFields() {
		text1 = new JTextField();
		text1.setBounds(50, 410, 120, 25);
		panel.add(text1);
		text2 = new JTextField();
		text2.setBounds(250, 410, 120, 25);
		panel.add(text2);
		text3 = new JTextField();
		text3.setBounds(50, 480, 120, 25);
		panel.add(text3);
		text4 = new JTextField();
		text4.setBounds(250, 480, 120, 25);
		panel.add(text4);
		text5 = new JTextField();
		text5.setBounds(50, 560, 320, 25);
		panel.add(text5);
	}
	
	/*private void button1ActionPerformed(ActionEvent ae){
		Person p = (Person)combo.getSelectedItem();
		String name = p.getName();
		String lastName = p.getLastName();
		String email = p.getEmail();
		String cel = p.getCellphone();
		String dir = p.getDirection();
		
		String [] person = {name, lastName, email, cel, dir};
		tableModel.addRow(person);
	}*/
	
	private void button1ActionPerformed() {
		
		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Person p = (Person)combo.getSelectedItem();
				String name = p.getName();
				String lastName = p.getLastName();
				String email = p.getEmail();
				String cel = p.getCellphone();
				String dir = p.getDirection();
				
				String [] person = {name, lastName, cel, email, dir};
				model.addRow(person);
				}
		};
		button1.addActionListener(action);
	}
	
private void tableActionPerformed() {
		ListSelectionListener listSelectionListener = new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) {
					int rowSelected = table.getSelectedRow();
					String name = (String)model.getValueAt(rowSelected, 0);
					String lastName = (String)model.getValueAt(rowSelected, 1);
					String email = (String)model.getValueAt(rowSelected, 2);
					String cel = (String)model.getValueAt(rowSelected, 3);
					String dir = (String)model.getValueAt(rowSelected, 4);
					
					text1.setText(name);
					text2.setText(lastName);
					text3.setText(email);
					text4.setText(cel);
					text5.setText(dir);
				}
			}};
		table.getSelectionModel().addListSelectionListener(listSelectionListener);
		//Previous line says that the table has a specific model and it has a SelectionListener to know
		//in what specific moment a row has been selected. 
	}
	
}
