import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public final class  JdbcFactory {
private JdbcFactory(){	
}
public static Connection getConnection() throws SQLException{
	
String url = "jdbc:mysql://localhost:3306/shiva";
	DriverManager.registerDriver(new Driver());
	Connection c = DriverManager.getConnection(url, "root", "root");
	return c;
}
}