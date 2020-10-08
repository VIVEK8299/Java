import java.util.*;
class p1
{
 public static void main(String Arg[])
 {
  int ar[]=new int[100];
  int i,j,n,t;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter limit of array");
  n=sc.nextInt();
  t=n;
  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  System.out.println("the input array is:");

  for(i=0;i<n;i++)
  {
   System.out.println("["+ar[i]+"]");
  }

  for(i=0;i<n;i++)
  {
   {
    if(i==n-1)
    break;
    ar[i]=ar[i]+ar[n-1];
    ar[n-1]=ar[i]-ar[n-1];
    ar[i]=ar[i]-ar[n-1];
   }n--;
  }

  System.out.println("reversed array:");

  for(i=0;i<t;i++)
  {
   System.out.println("["+ar[i]+"]");
  }
 }
}