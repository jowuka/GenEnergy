package GenEnergy.Frame;

import javax.swing.JPanel;

import GenEnergy.Login.LoginView;
import GenEnergy.User.UserView;

public class Main {
	private static ViewFrame frame = new ViewFrame();
	private static UserView userView = new UserView();
	public static void main(String[] args) {
		LoginView panelLogin = new LoginView();
		frame.add(panelLogin.getPanel());
		//frame.add(userView.getPanel());
		frame.start();
	}
	
	public static void changePanel(String username, String destination) {
		frame.getContentPane().removeAll(); 
		frame.add(getPanel(destination));
		frame.revalidate();
		frame.repaint();
	}
	private static JPanel getPanel(String destination) {
		if (destination.equals("User")) {
			return userView.getPanel();
		}
		else 
			return null;
			//return adminView.getPanel();
	}
	public static void repaintFrame() {
		frame.revalidate();
		frame.repaint();
	}
}
