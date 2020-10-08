import java.util.*;
class p29
{
 public static void main(String[]R)
 {
  int ar[][]=new int[100][100]; 
  int i,j,m,n;
  Scanner sc=new Scanner(System.in);

  System.out.println("row limit");
  m=sc.nextInt();

  System.out.println("column limit");
  n=sc.nextInt();

  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.println("enter an element:");
    ar[i][j]=sc.nextInt();
   }
  }
System.out.println("the original array is :");
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.print("["+ar[i][j]+"]");
   }
   System.out.println();
  }
System.out.println("transpose array is :");
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
    System.out.print("["+ar[j][i]+"]");
   }
   System.out.println();
  }
 }
}