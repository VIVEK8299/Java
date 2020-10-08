import java.util.*;
class p135
{
 public static void main(String[]R)
 {
  int ar[][]=new int[100][100],m,n;
  Scanner sc=new Scanner (System.in);

  System.out.println("row limit");
  m=sc.nextInt();
  System.out.println("column limit");
  n=sc.nextInt();

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
   for(int j=0;j<n-1;j++)
   {
    for(int k=j+1;k<n;k++)
    {
     if(ar[i][j]>ar[i][k])
     {
      ar[i][j]=ar[i][j]+ar[i][k];
      ar[i][k]=ar[i][j]-ar[i][k];
      ar[i][j]=ar[i][j]-ar[i][k];
     }
    }
   }
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