import java.util.*;
class p61
{
 public static void main(String[]R)
 {
  char c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  c=sc.next().charAt(0);

  switch((c>=65 && c<=90)?0:(c>=97 && c<=122)?1:(c>=48 && c<=57)?2:3)
  {
   case 0:
   System.out.println("upper alphabet");
   break;

   case 1:
   System.out.println("lower alphabet");
   break;

   case 2:
   System.out.println("digit");
   break;

   case 3:
   System.out.println("invalid character");
   break;
  }
 }
}