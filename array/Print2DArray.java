import java.util.*;
class p129
{
 public static void main(String[]R)
 {
  int ar[][]=new int[100][100],m,n;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  m=sc.nextInt();
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
   for(int j=0;j<n;j++)
   {
    System.out.print("["+ar[i][j]+"]");
   }
  System.out.println();
  }
 }
}