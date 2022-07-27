import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class statementdemo {
	public static void main(String[] args) {
		String sql="insert into Customer values(5,'prabhas',50000)";
		Connection conn;
		try {
			conn = JdbcFactory.getConnection();
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record inserted....:)");
		} catch (SQLException e) {
			System.out.println("Record failed to insert...:(");
			e.printStackTrace();
		}
	}
}