package employeedatareg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataEmp 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("delete from employee where emp_id =?");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee_id....");
		int emp_id = sc.nextInt();
		
		ps.setInt(1, emp_id);		
		int i =ps.executeUpdate();
		
		if(i != 0)
		{
			System.out.println("Data Sucessfully deleted.....");
		}
		else
		{
			System.out.println("Data Incorrect not deleted......");
		}
		conn.close();
		
	}

}
