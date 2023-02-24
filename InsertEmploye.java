package aryman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
	

class InsertEmploye
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{
		System.out.println("Error in loading drivers");
		}
		
		try 
		{
			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=12345@54321");
			
			PreparedStatement ps;
			ps = con.prepareStatement("insert into employedetail values(?,?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			
			int e=0,s=0, id=0;
			String n="";
			int x=0;
			for (int i = 1; i <=5; i++)
			{
				System.out.println("Enter Employee ID: - ");
				id = sc.nextInt();
				System.out.println("Enter Name of Employe Number " +(id)+": - ");
				n = sc.next();
				System.out.println("Enter Experience of  Employe Number " +(id)+ ": - ");
				e = sc.nextInt();
				System.out.println("Enter Salary of Employee Number " +(id)+": - ");
				s = sc.nextInt();
				ps.setInt(1,id);
				ps.setString(2, n);
				ps.setInt(3, e);
				ps.setInt(4, s);
				
				x = x+ps.executeUpdate();
				
			}
			System.out.println(x+" Employee Record Inserted Successfully");
			con.close();
			ps.close();
		}
		catch (SQLException e) 
		{
		System.out.println("An Error in SQL Statement, Please check again");
		}
	}

}


