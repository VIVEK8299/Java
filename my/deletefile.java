import java.io.File;
class DeleteFile
{
 public static void main(String[]R)
 {
  File obj = new File("abc.java");
  if(obj.delete())
    System.out.println("File deleted");
  else
    System.out.println("couldn't delete file.");
 }
}