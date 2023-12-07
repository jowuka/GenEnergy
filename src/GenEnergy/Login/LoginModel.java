package GenEnergy.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginModel {
	private String usernameDB = "root";
	private String passwordDB = "anil1996";
	private String urlDB = "jdbc:mysql://localhost:3306/";
	public static String usernameDatabase = "";
	public static String emailDatabase = "";
	public static String telDatabase = "";
	public static String passwordDatabase = "";
	private Connection con;
	
	public LoginModel() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(urlDB, usernameDB, passwordDB);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public boolean checkLoginUser(String username, String password) {
		boolean authentication = false;
		usernameDatabase = username;
		getPasswordDatabase();
		System.out.println(passwordDatabase + "   " + password);
		if (passwordDatabase.equals(password) && !passwordDatabase.equals("") && !password.equals("")) {
			authentication = true;
		}
		System.out.println(authentication);
		return authentication;
	}
	private void getPasswordDatabase() {
		Statement stmt;
		String getUsername = "SELECT * FROM USERS WHERE username = '" + usernameDatabase + "';";
		try {
			stmt = con.createStatement();
			stmt.execute("USE progettofinale;");
			ResultSet rset = stmt.executeQuery(getUsername);
			while(rset.next()) {
				passwordDatabase = rset.getString("password");
				telDatabase = rset.getString("tel");
				emailDatabase = rset.getString("email");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
