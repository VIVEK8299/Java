// PreparedStatement : insert

import java.sql.*;
import java.io.*;
class PreparedInsert
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

   //create a query

  String s = "insert into table1(tCity, tName) values(?, ?)";

  //get the PreparedStatement object

  PreparedStatement pstmt = con.prepareStatement(s);

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  System.out.println("Enter the City");
  String city = br.readLine();

  System.out.println("Enter the Name");
  String name = br.readLine();

  //set the values to query

  pstmt.setString(1, city);
  pstmt.setString(2, name);

  pstmt.executeUpdate();

  System.out.println("Inserted...");

  con.close();

  }catch(Exception e)
   {
    e.printStackTrace();
   }
 }
}