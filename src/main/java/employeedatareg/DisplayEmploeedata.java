package employeedatareg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DisplayEmploeedata
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		//PreparedStatement ps = conn.prepareStatement(null)
		System.out.println("Employee_id\t\tFirst Name\t\tLast Name\t\tUser Name\t\tPasword\t\tAddress\t\tContact");
		System.out.println("===================================================================================================");
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6)+"\t\t"+rs.getString(7));
		}
		conn.close();
	}

}
