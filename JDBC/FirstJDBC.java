// first program for JDBC

import java.sql.*;
class FirstJDBC
{
	public static void main(String[]R)
	{
		try
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Creating a Connection

			String url = "jdbc:mysql://127.0.0.1:3306/vivek";
			String username = "root";
			String password = "VIVEK12345";

			Connection con = DriverManager.getConnection(url, username, password);

			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else
			{
				System.out.println("Connection Created...");
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}