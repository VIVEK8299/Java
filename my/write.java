import java.io.FileWriter;
import java.io.IOException;
class WriteFile
{
 public static void main(String[]R)
 {
  try{
   FileWriter fw = new FileWriter("filename.txt");
   fw.write("hey there my name is vivek srivastava\ni am doing my graduation from ghaziabad ");
   fw.close();
   System.out.println("succesfully wrote to the file.");
   }
   catch(IOException e)
   {
    System.out.println("An error occured");
    e.printStackTrace();
   }
 }
}