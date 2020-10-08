import java.util.*;
class PrintArray
{
 public static void main(String[]R)
 {
  int ar[]=new int[6];
  Scanner sc=new Scanner(System.in);

  for(int i=0;i<=5;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  System.out.println("the no.'s are :");
  for(int i=0;i<=5;i++)
  {
   System.out.print("["+ar[i]+"]");
  }
 }
}
