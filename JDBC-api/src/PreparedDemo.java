import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedDemo {
	public static void main(String[] args) {
		String sql="insert into Customer values(?,?,?)";
		try {
			Connection c = JdbcFactory.getConnection();
			PreparedStatement stmt=c.prepareStatement(sql);
			
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			stmt.executeUpdate();
			System.out.println("Record Inserted..:)");
			
		} catch (SQLException e) {
			System.out.println("Record Failed to Insert...:(");
			e.printStackTrace();
		}
	}
}