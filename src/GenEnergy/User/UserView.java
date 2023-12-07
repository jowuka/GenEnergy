package GenEnergy.User;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import GenEnergy.Frame.Main;
import GenEnergy.Frame.ViewFrame;
import GenEnergy.Login.LoginModel;

public class UserView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String destinationImageBg = "res/img/bgLogin.png";	
	public static Font fontHeader = new Font("Times", Font.BOLD, (ViewFrame.fixedScreenResolution.width / 1000) * 18);
	public static Color colorHeader = new Color(45,45,74);
	public static Color colorHeaderBackground = new Color(84,168,113);
	
	HomePanel labelHome = new HomePanel();
	
	public JPanel getPanel() {
		loadPanel();
		return this;
	}
	private void loadPanel() {
		this.setLayout(null);
		this.add(loadHomeButton());
		this.add(loadGraphicButton());
		this.add(loadUserText());
		this.add(labelHome.getPanel());
		this.add(loadBackgroundImage());
	}
	private JLabel loadBackgroundImage()  {
		ImageIcon img = new ImageIcon(destinationImageBg);
		JLabel label;
		label = new JLabel("", img, JLabel.CENTER);
		label.setBounds(-7, -20,ViewFrame.fixedScreenResolution.width, ViewFrame.fixedScreenResolution.height);
		return label;
	}
	private JLabel loadUserText() {
		JLabel label = new JLabel("Welcome " + LoginModel.usernameDatabase);
		label.setFont(fontHeader);
		label.setSize((ViewFrame.fixedScreenResolution.width / 100) * 30, (ViewFrame.fixedScreenResolution.height / 100) * 2);
		label.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 3,(ViewFrame.fixedScreenResolution.height / 100) * 2);
		label.setVisible(true);
		return label;
	}
	private JButton loadHomeButton() {
		JButton button = new JButton("Home");
		button.setFont(fontHeader);
		button.setForeground(colorHeader);
		button.setBackground(colorHeaderBackground);
		button.setBorder(null);
		button.setBorder(new BevelBorder(10));
		button.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		button.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 10,(ViewFrame.fixedScreenResolution.height / 100) * 10);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickMenuButton();
			}
		});
		return button;
	}
	private JButton loadGraphicButton() {
		JButton button = new JButton("Graphic");
		button.setFont(fontHeader);
		button.setForeground(colorHeader);
		button.setBackground(colorHeaderBackground);
		button.setBorder(null);
		button.setBorder(new BevelBorder(10));
		button.setSize((ViewFrame.fixedScreenResolution.width / 100) * 8, (ViewFrame.fixedScreenResolution.height / 100) * 4);
		button.setLocation((ViewFrame.fixedScreenResolution.width / 100) * 22,(ViewFrame.fixedScreenResolution.height / 100) * 10);
		button.setVisible(true);
		return button;
	}
	private void clickMenuButton() {
		labelHome.setVisible(true);
		Main.repaintFrame();
		
	}
}
