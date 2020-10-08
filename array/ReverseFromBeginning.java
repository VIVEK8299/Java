import java.util.*;
class p119
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],j,k;
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
  int n;
  System.out.println("enter the limit for reverse from the beginning");
  n=sc.nextInt();
  for(int i=0;i<=n;i++)
  {
   System.out.print(+ar[i]);
  }
 }
}