import java.util.*;
class p11
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],i,k,n,d;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the limit of array:");
  n=sc.nextInt();

  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  for(i=1;i<n;i++)
  {
   d=ar[i];
   for(k=i-1;k>=0 && d<ar[k];k--)
   {
    ar[k+1]=ar[k];
    ar[k]=d;
   }
  }

  System.out.println("Insertion sorted array:");
  for(i=0;i<n;i++)
  {
   System.out.println("["+ar[i]+"]");
  }
 }
}