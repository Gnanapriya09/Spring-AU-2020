package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	      Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
		
	      CallableStatement stmt = null;
	      String sql = "{call employeedatabase.retrieval()}";
	      stmt = con.prepareCall(sql);
	      
	      System.out.println("Executing stored procedure..." );
	     ResultSet rs = stmt.executeQuery();
	      System.out.println("FirstName  LastName Depart_id Department_name");
	      while (rs.next()) {
	         String fname = rs.getString("first_name");
	         String lname = rs.getString("last_name");
	         	int d_id = rs.getInt("department_id");
	         String dname = rs.getString("dept_name");

	         System.out.println(fname + "    " + lname+"   "+d_id + "    " + dname);
	    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}