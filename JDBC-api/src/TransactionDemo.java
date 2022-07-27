import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		String s1 = "insert into Customer values(10,'kumar',100000)";
		String s2 = "update Customer set cr_limit=20 where cname='dolo'";
		String s3 = "delete from Customer where cname='prasad'";
		Connection c = null;

		try {
			c=JdbcFactory.getConnection();
			c.setAutoCommit(false);
			Statement s = c.createStatement();
			s.addBatch(s1);
			s.addBatch(s2);
			s.addBatch(s3);
			s.executeBatch();
			c.commit();
			System.out.println("Transaction completed");
		} catch (SQLException e) {
			System.out.println("Transaction failed");
			e.printStackTrace();
			try {
				c.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();

			}

		}

	}
}