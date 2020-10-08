import java.util.*;
class p62
{
 public static void main(String[]R)
 {
  char c;
  int y;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  c=sc.next().charAt(0);

  switch((c>=65 && c<=89 || c>=97 && c<=121)?0:1)
  {
   case 0:
   y=(int)c+1;
   System.out.println((char)y);
   break;

   case 1:
   y=(int)c-25;
   System.out.println((char)y);
   break;
  }
 }
}