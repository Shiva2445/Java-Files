import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class Connectiondemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/shiva";
		try {
			DriverManager.registerDriver(new Driver());
			Connection c = DriverManager.getConnection(url, "root", "root");
			System.out.println("Succesfully connected");

		} catch (SQLException e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}
	}
}
