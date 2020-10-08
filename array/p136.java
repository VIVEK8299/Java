import java.util.*;
class p136
{
 public static void main(String[]R)
 {
  int ar[][]=new int [100][100],m,n,sum=0,add=0,k;
  Scanner sc=new Scanner(System.in);

  System.out.println("row limit");
  m=sc.nextInt();
  System.out.println("Column limit");
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
    if(i==j)
    {
     sum=sum+ar[i][j];
    }
   }
  }

  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    if(i+j==(m-1))
    {
     add=add+ar[i][j];
    }
   }
  }

  k=sum-add;
  System.out.println(add);
  System.out.println(sum);
  System.out.println(k);
 }
}