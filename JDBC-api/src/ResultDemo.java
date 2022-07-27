import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class ResultDemo {

	public static void main(String[] args){
		String sql="select * from Customer";
		try {
		Connection c=JdbcFactory.getConnection();
		Statement stmt=c.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		ResultSetMetaData meta= rs.getMetaData();
		for(int i=1;i<=meta.getColumnCount();i++)
			System.out.print(meta.getColumnName(i)+"\t");
	System.out.println();

	while(rs.next())
			System.out.println(rs.getString("cust_id")+"\t"+rs.getString(2)+"\t"+ rs.getString(3));
    Statement stmt1 = c.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE);	

rs.absolute(2); // moves the cursor to the fifth row of rs
rs.updateString("cname", "AINSWORTH"); // updates the
   // NAME column of row 5 to be AINSWORTH
rs.updateRow();
	       rs.moveToInsertRow(); // moves cursor to the insert row
	      rs.updateString(1, "AINSWORTH"); // updates the
	          // first column of the insert row to be AINSWORTH
	       rs.updateInt(2,35); // updates the second column to be 35
	       rs.updateBoolean(3, true); // updates the third column to true
	       rs.insertRow();
	       rs.moveToCurrentRow();
		}
		catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
	}

}}
