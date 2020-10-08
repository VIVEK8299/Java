import java.util.Scanner;
class p5
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],i,j,n,m,o;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the limit of array:");
  n=sc.nextInt();
  o=n;

  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  System.out.println("enter the index to reverse from the end");
  m=sc.nextInt();

  for(i=m;i<n;i++)
  {
   if(i==n)
   break;
   ar[i]=ar[i]+ar[n-1];
   ar[n-1]=ar[i]-ar[n-1];
   ar[i]=ar[i]-ar[n-1];
   n--;
  }

  for(i=0;i<o;i++)
  {
   System.out.println("["+ar[i]+"]");
  }
 }
}