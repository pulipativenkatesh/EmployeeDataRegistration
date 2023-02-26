package employeedatareg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataEmp
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the Employee Id...");
			int emp_id =sc.nextInt();
			
			System.out.println("Enter the First Name...");
			String first_name = sc.next();
			
			System.out.println("Enter the Last Name....");
			String last_name = sc.next();
			
			System.out.println("Enter the User Name....");
			String user_name = sc.next();
			
			System.out.println("Enter the Password..");
			String paaswords = sc.next();
			
			System.out.println("Enter the Address...");
			String address = sc.next();
			
			System.out.println("Enter the Conatact....");
			String contact = sc.next();
			
			ps.setInt(1, emp_id);
			ps.setString(2, first_name);
			ps.setString(3, last_name);
			ps.setString(4, user_name);
			ps.setString(5, paaswords);
			ps.setString(6, address);
			ps.setString(7,contact);
			
			int  i = ps.executeUpdate();
			if(i != 0)
			{
				System.out.println("Inserted data Sucessfully...");
				
			}
			else
			{
				System.out.println("Data Not Inserted....");
			}
		}
		//conn.close();
		
	}

}
