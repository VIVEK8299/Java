import java.util.Scanner;
class p8
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],i,n,m,j=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter limit of array");
  n=sc.nextInt();

  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  System.out.println("Enter the no. for searching:");
  m=sc.nextInt();

  for(i=0;i<n;i++)
  {
   if(ar[i]==m)
   {System.out.println("the index is:"+i);
   break;}
   j++;
  }
  if(j==n)
  System.out.println("Data not found");
 }
}