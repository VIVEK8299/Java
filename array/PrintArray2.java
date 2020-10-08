import java.util.*;
class p115
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],n;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter limit");
  n=sc.nextInt();

  for(int i=0;i<=n;i++)
  {
   System.out.println("enter a number");
   ar[i]=sc.nextInt();
  }
  for(int i=0;i<=n;i++)
  {
   System.out.print(+ar[i]);
  }
 }
}