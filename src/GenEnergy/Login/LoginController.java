package GenEnergy.Login;

import javax.swing.JOptionPane;

import GenEnergy.Frame.Main;

public class LoginController {
	private LoginModel loginModel = new LoginModel();

	public void loginCheck(String role, String username, String password) {
		if (role.equals("Admin")) {
			loginAdmin(username, password);
		}
		else {
			loginUser(username, password);
		}
	}
	private void loginAdmin(String username, String password) {
		
	}
	private void loginUser(String username, String password) {
		if(loginModel.checkLoginUser(username, password)) {
			Main.changePanel(username, "User");
		} 
		else {
			JOptionPane.showMessageDialog(null, "Wrong Username or Password\nTry Again...");
		}
	}
}
