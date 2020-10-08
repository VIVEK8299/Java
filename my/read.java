import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Read
{
 public static void main(String[]R)
 {
  try{
  File obj = new File("filename.txt");
  Scanner sc = new Scanner(obj);
  while(sc.hasNextLine())
  { String data = sc.nextLine();
    System.out.println(data);
  }
  sc.close();
 }
  catch(FileNotFoundException e)
  {
   System.out.println("An error occured");
   e.printStackTrace();
  }
 }
}