import java.util.*;
class p117
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],n,a,b;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  n=sc.nextInt();

  for(int i=0;i<=n-1;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  a=ar[0];
  b=ar[0];
  for(int i=0;i<=n-1;i++)
  {
   if(ar[i]>b)
   b=ar[i];
   else
   {
    if(ar[i]<a)
    {
     a=ar[i];
    }
   }
  }
  System.out.println("lowest"+a);
  System.out.println("highest"+b);
 }
}