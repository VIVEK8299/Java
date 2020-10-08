import java.util.*;
class p60
{
 public static void main(String[]R)
 {
  int y;
  char c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  c=sc.next().charAt(0);

  switch((c>=65 && c<=90)?0:(c>=97 && c<=122)?1:2)
  {
   case 0:
   y=(int)c+32;
   System.out.println((char)y);
   break;

   case 1:
   y=(int)c-32;
   System.out.println((char)y);
   break;

   case 2:
   System.out.println("invalid character");
   break;
  }
 }
}