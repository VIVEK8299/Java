import java.util.*;
class ReverseArray
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],j,k;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter limit");
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
  for(int i=0;i<j;i++)
  {
   System.out.print(ar[i]);
  }
 }
}