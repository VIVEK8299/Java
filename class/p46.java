import java.io.*;
class A
{
 public static void main(String[]R)
 {
  InputStreamReader ir= new InputStreamReader(System.in);
  BufferedReader br= new BufferedReader(ir);
  System.out.println("Enter the name");
  String name =br.readLine();
  System.out.println("Welcome "+name);
 }
}