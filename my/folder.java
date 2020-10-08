import java.io.File;
class Folder
{
 public static void main(String[]R)
 {
  File obj = new File("E:\\java\\my\\New Folder");
  if(obj.delete())
    System.out.println("Folder deleted.");
  else
    System.out.println("couldn't delete the goddamn folder.");
 }
}