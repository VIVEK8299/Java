import java.util.*;
class p125
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],j,d;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  j=sc.nextInt();

  for(int i=0;i<j;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  for(int i=1;i<j;i++)
  {
   d=ar[i];
   for(int k=i-1;k>=0 && d<ar[k];k--)
   {
    ar[k+1]=ar[k];
    ar[k]=d;
   }
  }
  for(int i=0;i<j;i++)
  {
   System.out.print(ar[i]);
  }
 }
}