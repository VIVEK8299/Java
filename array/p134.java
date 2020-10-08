import java.util.*;
class p134
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

  for(int i=0;i<m-1;i++)
  {
   for(int j=0;j<n;j++)
   {
    for(int k=i+1;k<m;k++)
    {
     if(ar[i][j]>ar[k][j])
     {
      ar[i][j]=ar[i][j]+ar[k][j];
      ar[k][j]=ar[i][j]-ar[k][j];
      ar[i][j]=ar[i][j]-ar[k][j];
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