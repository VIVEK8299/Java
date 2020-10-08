import java.util.*;
class p132
{
 public static void main(String[]R)
 {
  int ar[][]=new int[100][100],m,n,k;
  Scanner sc=new Scanner(System.in);

  System.out.println("row limit");
  m=sc.nextInt();
  System.out.println("column limit");
  n=sc.nextInt();
  k=n-1;

  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    System.out.println("enter a no.");
    ar[i][j]=sc.nextInt();
   }
  }

  for(int i=0;i<m;i++)
  {
   for(int j=0;j<k;j++)
   {
    ar[i][j]=ar[i][j]+ar[i][k];
    ar[i][k]=ar[i][j]-ar[i][k];
    ar[i][j]=ar[i][j]-ar[i][k];
    k--;
   }
k=n-1;
  }
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    System.out.print("["+ar[i][j]+"]");
   }
   System.out.println();
  }
 }
}