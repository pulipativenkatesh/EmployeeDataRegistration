package employeedatareg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataEmpl
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("update  employee set User_Name =? where emp_id=?");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the emp_id....");
		int emp_id = sc.nextInt();
		System.out.println("Enter the update user Name");
		String username = sc.next();
		
		ps.setString(1, username);
		ps.setInt(2, emp_id);
		
		int i = ps.executeUpdate();
		if(i != 0)
		{
			System.out.println("Data Sucessfully updated.....");
		}
		else
		{
			System.out.println("Not Updated something went wrong..");
		}
		conn.close();
		
	}

}
