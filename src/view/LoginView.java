package view;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LoginView extends JFrame {
	private JFrame frame;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	private JButton login;
	
	public LoginView(String title) {
		frame = new JFrame(title);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		usernameLabel = new JLabel("Username");
		
		usernameTextField = new JTextField();
		usernameTextField.setColumns(10);
		
		passwordLabel = new JLabel("Password");
		
		passwordTextField = new JPasswordField();
		passwordTextField.setColumns(10);
		
		login = new JButton("Login");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(193)
							.addComponent(usernameLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(193)
							.addComponent(passwordLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(152)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(usernameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(182)
							.addComponent(login)))
					.addContainerGap(168, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(75)
					.addComponent(usernameLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(usernameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(passwordLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(login)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}


	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public JLabel getUsernameLabel() {
		return usernameLabel;
	}


	public void setUsernameLabel(JLabel username) {
		this.usernameLabel = username;
	}


	public JLabel getPasswordLabel() {
		return passwordLabel;
	}


	public void setPasswordLabel(JLabel password) {
		this.passwordLabel = password;
	}


	public JTextField getUsernameTextField() {
		return usernameTextField;
	}


	public void setUsernameTextField(JTextField usernameTextField) {
		this.usernameTextField = usernameTextField;
	}


	public JTextField getPasswordTextField() {
		return passwordTextField;
	}


	public void setPasswordTextField(JTextField passwordTextField) {
		this.passwordTextField = passwordTextField;
	}


	public JButton getLogin() {
		return login;
	}


	public void setLogin(JButton login) {
		this.login = login;
	}
}
