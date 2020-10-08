import java.util.*;
class p43
{
 public static void main(String[]R)
 {
  int x;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any value of x");
  x=sc.nextInt();

  if(x==1)
  {
   System.out.println("one");
  }
  else
  {
   if(x==2)
   {
    System.out.println("two");
   }
   else
   {
    System.out.println("invalid");
   }
  }
 }
}