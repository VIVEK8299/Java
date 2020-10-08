import java.sql.*;
import java.io.*;
class ImageSave
{
 public static void main(String[]R)
 {
  try
  {
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vivek", "root", "VIVEK12345");

  String s = "insert into images(pic) values(?)";

  PreparedStatement pstmt = con.prepareStatement(s);

  //pstmt.setString(1, "value");
  FileInputStream fis = new FileInputStream("E:\\Others\\photos\\Vivek\\img1.jpg");

  pstmt.setBinaryStream(1, fis, fis.available());

  pstmt.executeUpdate();

  System.out.println("Done....");

  }catch(Exception e)
  {
    e.printStackTrace();
  }
 }
}