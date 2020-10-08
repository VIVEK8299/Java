import java.util.*;
class p128
{
 public static void main(String[]R)
 {
  int dr[]=new int[100];
  int cr[]=new int[100];
  int br[]=new int[100];
  int ar[]=new int[100];
  int m,i,j;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  m=sc.nextInt();

  for(i=0;i<m;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  System.out.println("Second array :");

  for(j=0;j<m;j++)
  {
   System.out.println("enter a no.");
   br[j]=sc.nextInt();
  }
   i=0;j=0;
  for(int k=0;k<m;k++)
  {
   cr[k]=ar[i]+br[j];
   i++;
   j++;
   System.out.print("["+cr[k]+"]");
  }
  System.out.println();
  i=0;j=0;
  for(int l=0;l<m;l++)
  {
   dr[l]=ar[i]*br[j];
   i++;
   j++;
   System.out.print("["+dr[l]+"]");
  }
 }
}