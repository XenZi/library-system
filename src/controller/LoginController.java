package controller;

import javax.swing.JOptionPane;

import managers.LibraryManager;
import model.abstracts.Staff;
import view.LoginView;

public class LoginController {
	
	private LoginView view;
	private LibraryManager model;
	
	public LoginController(LibraryManager model, LoginView view) {
		this.model = model;
		this.view = view;
	}
	
	public void initController() {
		actionListeners();
		this.view.setVisible(true);
	}
	
	private void actionListeners() {
		view.getLogin().addActionListener(e -> checkCreditionals());
	}
	
	private void checkCreditionals() {
		String username = view.getUsernameTextField().getText();
		String password = view.getPasswordTextField().getText();
		
		Staff staff = model.getStaffManager().getAllStaff().stream().filter(el -> el.getUsername().equals(username) && el.getPassword().equals(password)).findAny().orElse(null);
		if (staff == null) {
			JOptionPane.showMessageDialog(null, "Error! Login creditionals are wrong", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
