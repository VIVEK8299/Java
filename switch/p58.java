import java.util.*;
class p58
{
 public static void main(String[]R)
 {
  int t;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter time between 0 to 24 hours");
  t=sc.nextInt();

  switch((t>0 && t<=12)?0:(t>12 && t<=16)?1:(t>16 && t<=20)?2:(t>20 && t<=24)?3:4)
  {
   case 0:
   System.out.println("Good Morning");
   break;

   case 1:
   System.out.println("Good Afternoon");
   break;

   case 2:
   System.out.println("Good Evening");
   break;

   case 3:
   System.out.println("Good Night");
   break;
 
   case 4:
   System.out.println("Invalid time input");
   break;
  }
 }
}