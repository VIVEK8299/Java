import java.util.Scanner;
class p2
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],i,g,s,n;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter limit of array:");
  n=sc.nextInt();

  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  g=ar[0];
  s=ar[0];

  for(i=0;i<n;i++)
  {
   if(ar[i]>g)
   g=ar[i];
   if(ar[i]<s)
   s=ar[i];
  }

  System.out.println("the greatest no. is = "+g);
  System.out.println("the smallest no. is = "+s);
 }
}