package aryman;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC 
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Error Can't Load Drivers Check Connections!!");
		}
		try
		{
			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=12345@54321"  );               
			PreparedStatement ps; 
			ps = con.prepareStatement("delete from employedetail where ID= ?"); 
			Scanner s= new Scanner(System.in);
			int id=0;
			int x=0;
			System.out.println("Enter ID");
			id= s.nextInt();
			
			ps.setInt(1,id);
			
			x= x+ps.executeUpdate();
			System.out.println(id+ " Employee details Deleted Successfully!");
			con.close();
			ps.close();
		}
		catch (SQLException se)
		{
			System.out.println("An Error in SQL Statement, Please check again");
		}
	}
}

