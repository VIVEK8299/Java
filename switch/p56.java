import java.util.*;
class p56
{
 public static void main(String[]R)
 {
  int x;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  x=sc.nextInt();

  switch((x%13==0)?0:1)
  {
   case 0:
   System.out.println("divisible by 13");
   break;

   case 1:
   System.out.println("not divisible by 13");
   break;
  }
 }
}