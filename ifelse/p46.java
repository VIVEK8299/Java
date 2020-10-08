import java.util.*;
class p46
{
 public static void main(String[]R)
 {
  char c;
  int a;
  Scanner sc=new Scanner(System.in);
 
  System.out.println("enter any chatracter");
  c=sc.next().charAt(0);

  if(c>=65&&c<=89 || c>=97 && c<=121)
  
   a=(int)c+1;
  else
   a=(int)c-25; 
   
  System.out.println((char)a);
 }
}