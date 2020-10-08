import java.sql.*;
class InsertJDBC
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

   //create a Query
   String s = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

   //create  statement 

   Statement stmt = con.createStatement();

   stmt.executeUpdate(s);

   System.out.println("table created in database");

   con.close();
   
  }catch(Exception e)
  {
   e.printStackTrace();
  }
 }
}