package employeedatareg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		Statement st = conn.createStatement();
		st.execute("create table employee(emp_id int(3) primary key,First_Name varchar(20) not null,Last_Name varchar(20) not null,"
				+ "User_Name varchar(20) not null, Password varchar(20) not null,address varchar(40) not null,Contact_Num varchar(10) not null)");
		System.out.println("Table created.....");
		conn.close();
		
	}

}
