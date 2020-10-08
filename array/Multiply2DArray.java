import java.util.*;
class p131
{
 public static void main(String[]R)
 {
  int ar[][]=new int [100][100];
  int br[][]=new int [100][100];
  int cr[][]=new int [100][100];
  int m,n;
  Scanner sc=new Scanner(System.in);

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

  System.out.println("Second Array :");
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    System.out.println("enter a no.");
    br[i][j]=sc.nextInt();
   }
  }

  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    cr[i][j]=ar[i][j]*br[i][j];
   }
  }

  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    System.out.print("["+cr[i][j]+"]");
   }
   System.out.println();
  }
 }
}