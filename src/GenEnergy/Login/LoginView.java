package GenEnergy.Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import GenEnergy.Frame.ViewFrame;

public  class LoginView extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String[] comboBoxList = {"User", "Admin"}; 
	private JComboBox<?> loginAs = new JComboBox<Object>(comboBoxList);
	
	private JTextField usernameField = new JTextField("Username");
	private JPasswordField passwordField = new JPasswordField("Password");
	
	private String destinationImageBgLogin = "res/img/bgLogin.png";	
	private String destinationImageSaveThePlanet = "res/img/SaveThePlanet.png";	
	private String destinationLogo = "res/img/Logo.png";	
	
	private Font fontFooter = new Font("Times", Font.BOLD, (ViewFrame.fixedScreenResolution.width / 1000) * 19);
	private Font fontField = new Font("Times", Font.ITALIC, (ViewFrame.fixedScreenResolution.width / 1000) * 17);
	
	private Color fontColor = new Color(45,45,74);
	private Color fontBox = new Color(153,241,149);
	
	private LoginController loginController = new LoginController();
	
	private boolean checkFieldPassword = true;
	private boolean checkFieldUsername = true; 
	
	public LoginView() {
		loadPanel();
	}
	public JPanel getPanel() {
		return this;
	}
	private void loadPanel() {
		this.setLayout(null);
		
		

		this.add(loadLogo());
		this.add(loadFooter());
		this.add(loadLoginText());
		this.add(loadUsernameText());
		this.add(loadImageLogin());
		this.add(loadPasswordText());
		this.add(loadUsernameField());
		this.add(loadPasswordField());
		this.add(loadLoginAs());
		this.add(loadLoginAsText());
		this.add(loadLoginButton());
		this.add(loadBackgroundImage());
		
	}

	private JLabel loadBackgroundImage()  {
		ImageIcon img = new ImageIcon(destinationImageBgLogin);
		JLabel label;
		label = new JLabel("", img, JLabel.CENTER);
		label.setBounds(-7, -20,ViewFrame.fixedScreenResolution.width, ViewFrame.fixedScreenResolution.height);
		return label;
	}
	private JLabel loadLogo()  {
		ImageIcon img = new ImageIcon(destinationLogo);
		JLabel label;
		label = new JLabel("", img, JLabel.CENTER);
		label.setSize((ViewFrame.fixedScreenResolution.width / 100) * 12, (ViewFrame.fixedScreenResolution.height / 100) * 8);
		label.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 27,(ViewFrame.fixedScreenResolution.height / 100) * 18) ;
		return label;
	}

	private JLabel loadFooter() {
		JLabel imageTextLogin = new JLabel("Rendi il mondo più \r\n"
				+ "green con GenEnergy!");
		imageTextLogin.setForeground(fontColor);
		imageTextLogin.setFont(fontFooter);
		imageTextLogin.setSize((ViewFrame.fixedScreenResolution.width / 100) * 25, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		imageTextLogin.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 3,(ViewFrame.fixedScreenResolution.height / 100) * 92) ;
		imageTextLogin.setVisible(true);
		return imageTextLogin;
	}
	private JLabel loadLoginText() {
		JLabel loginText = new JLabel("Login");
		loginText.setForeground(fontColor);
		loginText.setFont(fontFooter);
		loginText.setSize((ViewFrame.fixedScreenResolution.width / 100) * 10, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		loginText.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 39,(ViewFrame.fixedScreenResolution.height / 100) * 20) ;
		loginText.setVisible(true);
		return loginText;
		
	}
	private JLabel loadUsernameText() {
		JLabel usernameText = new JLabel("Username :");
		usernameText.setForeground(fontColor);
		usernameText.setFont(fontFooter);
		usernameText.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		usernameText.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 30,(ViewFrame.fixedScreenResolution.height / 100) * 28) ;
		usernameText.setVisible(true);
		return usernameText;
	}
	private JLabel loadPasswordText() {
		JLabel usernameText = new JLabel("Password :");
		usernameText.setForeground(fontColor);
		usernameText.setFont(fontFooter);
		usernameText.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		usernameText.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 30,(ViewFrame.fixedScreenResolution.height / 100) * 34) ;
		usernameText.setVisible(true);
		return usernameText;
	}
	private JLabel loadLoginAsText() {
		JLabel usernameText = new JLabel("Login As :");
		usernameText.setForeground(fontColor);
		usernameText.setFont(fontFooter);
		usernameText.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		usernameText.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 30,(ViewFrame.fixedScreenResolution.height / 100) * 39) ;
		usernameText.setVisible(true);
		return usernameText;
	}
	private JTextField loadUsernameField() {
		
		usernameField.setFont(fontField);
		usernameField.setForeground(fontColor);
		usernameField.addFocusListener(new FocusAdapter() {
			public void focusGained (FocusEvent e) {
				if(usernameField.getText().equals("Username"))
					usernameField.setText("");
			}
		});
		usernameField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				if(usernameField.getText().equals(""))
					usernameField.setText("Username");
			}
		});

		usernameField.setBorder(null);
		usernameField.setBackground(fontBox);
		usernameField.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		usernameField.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 38,(ViewFrame.fixedScreenResolution.height / 100) * 28 + 4) ;
		usernameField.setVisible(true);
		return usernameField;
	}
	private JPasswordField loadPasswordField() {

		
		passwordField.setFont(fontField);
		
		passwordField.addFocusListener(new FocusAdapter() {
			public void focusGained (FocusEvent e) {
				if(passwordField.getText().equals("Password"))
				passwordField.setText("");
			}
		});
		passwordField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				if(passwordField.getText().equals(""))
					passwordField.setText("Password");
			}
		});
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					loginController.loginCheck(comboBoxList[loginAs.getSelectedIndex()],usernameField.getText(),passwordField.getText());
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		passwordField.setBorder(null);
		passwordField.setBackground(fontBox);
		passwordField.setForeground(fontColor);
		passwordField.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		passwordField.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 38,(ViewFrame.fixedScreenResolution.height / 100) * 34 + 4) ;
		passwordField.setVisible(true);
		return passwordField;
	}
	private JLabel loadImageLogin() {
		ImageIcon image = new ImageIcon(destinationImageSaveThePlanet);
		JLabel label = new JLabel("", image,JLabel.CENTER);
		label.setBounds((ViewFrame.fixedScreenResolution.width / 100) * 5, (ViewFrame.fixedScreenResolution.height / 100) * 10, (ViewFrame.fixedScreenResolution.width / 100) * 15, (ViewFrame.fixedScreenResolution.height / 100) * 28);
		return label;
	}
	private JComboBox<?> loadLoginAs() {
		loginAs.setFont(fontField);
		loginAs.setBackground(fontBox);
		loginAs.setForeground(fontColor);
		loginAs.setBorder(null);
		loginAs.setSelectedIndex(0);
		loginAs.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		loginAs.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 38,(ViewFrame.fixedScreenResolution.height / 100) * 39 + 4) ;
		loginAs.setVisible(true);
		return loginAs;
	}
	
	private JButton loadLoginButton() {
		JButton button = new JButton("Login");
		button.setFont(fontField);
		button.setForeground(fontColor);
		Color color = new Color(84,168,113);
		button.setBackground(color);
		button.setBorder(null);
		button.setBorder(new BevelBorder(10));
		button.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		button.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 38,(ViewFrame.fixedScreenResolution.height / 100) * 44 + 4);
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				loginController.loginCheck(comboBoxList[loginAs.getSelectedIndex()],usernameField.getText(),passwordField.getText());
				}
		});
		button.setVisible(true);
		return button;
	}
	
}
