package GenEnergy.Frame;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import GenEnergy.Login.LoginView;

public class ViewFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Dimension screenResolution = Toolkit.getDefaultToolkit().getScreenSize();

    public static final int frameWidthPercentage = 85;
    public static final int frameHeightPercentage = 87;
	public static final Dimension fixedScreenResolution = new Dimension((screenResolution.width / 100) * frameWidthPercentage, (screenResolution.height / 100) * frameHeightPercentage);
	
	LoginView viewLogin = new LoginView();

	private void loadFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(fixedScreenResolution.width, fixedScreenResolution.height);
		this.setLocation((fixedScreenResolution.width - (fixedScreenResolution.width / 100) * frameWidthPercentage )/ 2, (fixedScreenResolution.height - (fixedScreenResolution.height / 100) * frameHeightPercentage )/ 2);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setMaximumSize(fixedScreenResolution);
		//this.add(viewLogin.getPanel());
	}
	public void start() {
		loadFrame();
		this.setVisible(true);
		this.repaint();
	}
	


	
}
