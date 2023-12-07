package GenEnergy.User;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GenEnergy.Frame.ViewFrame;
import GenEnergy.Login.LoginModel;

public class HomePanel extends JPanel {
	
	public static Font fontThanks = new Font("Times", Font.ITALIC, (ViewFrame.fixedScreenResolution.width / 1000) * 18);
	
	private void loadPanel() {
		this.setLayout(null);
		this.add(loadUsernameLabel());
		this.add(loadEmailLabel());
		this.add(loadChangeUsername());
		this.add(loadChangePassword());
		this.add(loadPasswordLabel());
		this.add(loadTelLabel());
		this.add(loadChangeEmail());
		this.add(loadChangeTel());
		this.add(loadThanks());
		Color color = new Color(125,202,123);
		this.setBackground(color);
		this.setSize((ViewFrame.fixedScreenResolution.width / 100) * 50, (ViewFrame.fixedScreenResolution.height / 100) * 70);
		this.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 4,(ViewFrame.fixedScreenResolution.height / 100) * 20) ;
		this.setOpaque(true);
		this.setVisible(true);
	}
	
	public JPanel getPanel() {
		loadPanel();
		return this;
	}
	
	private JLabel loadUsernameLabel() {
		JLabel label = new JLabel("Username : " + LoginModel.usernameDatabase);
		label.setFont(UserView.fontHeader);
		label.setForeground(UserView.colorHeader);
		label.setSize((ViewFrame.fixedScreenResolution.width / 100) * 20, (ViewFrame.fixedScreenResolution.height / 100) * 3);
		label.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 1,(ViewFrame.fixedScreenResolution.height / 100) * 2) ;
		return label;
	}
	private JLabel loadPasswordLabel() {
		int lengthPass = LoginModel.passwordDatabase.length();
		JLabel label = new JLabel("Password : " + "*".repeat(lengthPass));
		label.setFont(UserView.fontHeader);
		label.setForeground(UserView.colorHeader);
		label.setSize((ViewFrame.fixedScreenResolution.width / 100) * 20, (ViewFrame.fixedScreenResolution.height / 100) * 3);
		label.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 1,(ViewFrame.fixedScreenResolution.height / 100) * 12) ;
		return label;
	}
	
	private JLabel loadEmailLabel() {
		JLabel label = new JLabel("Email : " + LoginModel.emailDatabase);
		label.setFont(UserView.fontHeader);
		label.setForeground(UserView.colorHeader);
		label.setSize((ViewFrame.fixedScreenResolution.width / 100) * 20, (ViewFrame.fixedScreenResolution.height / 100) * 3);
		label.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 1,(ViewFrame.fixedScreenResolution.height / 100) * 22) ;
		return label;
	}
	
	private JLabel loadTelLabel() {
		JLabel label = new JLabel("Tel : " + LoginModel.telDatabase);
		label.setFont(UserView.fontHeader);
		label.setForeground(UserView.colorHeader);
		label.setSize((ViewFrame.fixedScreenResolution.width / 100) * 20, (ViewFrame.fixedScreenResolution.height / 100) * 3);
		label.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 1,(ViewFrame.fixedScreenResolution.height / 100) * 32) ;
		return label;
	}
	
	private JButton loadChangeUsername() {
		JButton button = new JButton("Change Username");
		button.setBackground(UserView.colorHeaderBackground);
		button.setBorder(null);
		button.setFont(UserView.fontHeader);
		button.setForeground(UserView.colorHeader);
		button.setSize((ViewFrame.fixedScreenResolution.width / 100) * 13, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		button.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 25,(ViewFrame.fixedScreenResolution.height / 100) * 2);
		return button;
		
	}
	private JButton loadChangePassword() {
		JButton button = new JButton("Change Password");
		button.setBackground(UserView.colorHeaderBackground);
		button.setBorder(null);
		button.setFont(UserView.fontHeader);
		button.setForeground(UserView.colorHeader);
		button.setSize((ViewFrame.fixedScreenResolution.width / 100) * 13, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		button.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 25,(ViewFrame.fixedScreenResolution.height / 100) * 12);
		return button;
	}
	private JButton loadChangeEmail() {
		JButton button = new JButton("Change Email");
		button.setBackground(UserView.colorHeaderBackground);
		button.setBorder(null);
		button.setFont(UserView.fontHeader);
		button.setForeground(UserView.colorHeader);
		button.setSize((ViewFrame.fixedScreenResolution.width / 100) * 13, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		button.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 25,(ViewFrame.fixedScreenResolution.height / 100) * 22);
		return button;
	}
	private JButton loadChangeTel() {
		JButton button = new JButton("Change Tel");
		button.setBackground(UserView.colorHeaderBackground);
		button.setBorder(BorderFactory.createBevelBorder(5));
		button.setFont(UserView.fontHeader);
		button.setForeground(UserView.colorHeader);
		button.setSize((ViewFrame.fixedScreenResolution.width / 100) * 13, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		button.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 25,(ViewFrame.fixedScreenResolution.height / 100) * 32);
		return button;
	}
	private JLabel loadThanks() {
		JLabel label = new JLabel("Controlla la classe energetica dei tuoi elettrodomestici.");
		label.setFont(fontThanks);
		label.setForeground(UserView.colorHeader);
		label.setSize((ViewFrame.fixedScreenResolution.width / 100) * 29, (ViewFrame.fixedScreenResolution.height / 100) * 3);
		label.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 10,(ViewFrame.fixedScreenResolution.height / 100) * 65) ;
		return label;
	}
}
