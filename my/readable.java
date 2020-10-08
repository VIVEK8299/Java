import java.io.File;
class Readable
{
 public static void main(String[]R)
 {
  File obj = new File("filename.txt");
  if(obj.exists()){
   System.out.println("File Name: "+obj.getName());
   System.out.println("Absolute Path: "+obj.getAbsolutePath());
   System.out.println("Readable: "+obj.canRead());
   System.out.println("Writable: "+obj.canWrite());
   System.out.println("Size in Bytes: "+obj.length());
  }
  else
  {
   System.out.println("File doesn't exist.");
  }
 }
}