import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost/it230?user=root&password=";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connect to JDBC successfully.");
			
			Connection connection = DriverManager.getConnection(URL);
			System.out.println("Log in to MySQL successfully.");
		}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
		catch(SQLException exception) {
			exception.printStackTrace();
		}
		
	}
}
