import java.util.*;
class p151
{
 static void function(int ar[],int n)
 {
  int d;
  for(int i=0;i<n;i++)
  {
   d=ar[i];
   for(int j=i-1;j>=0 && d<ar[j];j--)
   {
    ar[j+1]=ar[j];
    ar[j]=d;
   }
  }
  for(int i=0;i<n;i++)
  {
   System.out.println("["+ar[i]+"]");
  }
 }
 public static void main(String[]R)
 {
  int ar[]=new int[100],n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter row limit");
  n=sc.nextInt();

  for(int i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  function(ar,n);
 }
}