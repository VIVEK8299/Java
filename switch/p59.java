import java.util.*;
class p59
{
 public static void main(String[]R)
 {
  int t;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any number b/w 1,2,3");
  t=sc.nextInt();

  switch((t==1)?0:(t==2)?1:(t==3)?2:3)
  {
   case 0:
   System.out.println("one");
   break;

   case 1:
   System.out.println("two");
   break;

   case 2:
   System.out.println("three");
   break;

   case 3:
   System.out.println("invalid input");
   break;
  }
 }
}