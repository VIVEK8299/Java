import java.util.Scanner;
class p4
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],i,n,j;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit of array:");
  n=sc.nextInt();

  for(i=0;i<n;i++)
  {
   System.out.println("Enter a no.");
   ar[i]=sc.nextInt();
  }

  System.out.println("Enter the index from beginning to reverse array:");
  j=sc.nextInt();

  for(i=0;i<j;i++)
  {
   {
    if(i==j)
    break;
    ar[i]=ar[i]+ar[j];
    ar[j]=ar[i]-ar[j];
    ar[i]=ar[i]-ar[j];
   }j--;
  }

  for(i=0;i<n;i++)
  {
   System.out.print("["+ar[i]+"]");
  }
 }
}