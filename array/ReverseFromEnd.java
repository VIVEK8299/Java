import java.util.*;
class p120
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],k,j;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  j=sc.nextInt();
  k=j-1;

  for(int i=0;i<j;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  for(int i=0;i<j;i++)
  {
   System.out.print(ar[i]);
  }
  for(int i=0;i<k;i++)
  {
   ar[i]=ar[i]+ar[k];
   ar[k]=ar[i]-ar[k];
   ar[i]=ar[i]-ar[k];
   k--;
  }
  System.out.println("");
  for(int i=0;i<j;i++)
  {
   System.out.print(ar[i]);
  }
  System.out.println("");
  int n;
  System.out.println("enter the limit of reverse from end");
  n=sc.nextInt();
  for(int i=n;i<j;i++)
  {
   System.out.print(ar[i]);
  }
 }
}