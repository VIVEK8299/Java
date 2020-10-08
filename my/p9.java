import java.util.*;
class p9
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],i,j,n;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the limit of array:");
  n=sc.nextInt();

  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  for(i=0;i<n-1;i++)
  {
   for(j=0;j<n-1;j++)
   {
    if(ar[j]>ar[j+1])
    {
     ar[j]=ar[j]+ar[j+1];
     ar[j+1]=ar[j]-ar[j+1];
     ar[j]=ar[j]-ar[j+1];
    }
   }
  }

  System.out.println("Bubble sorted Array:");
  for(i=0;i<n;i++)
  {
   System.out.println("["+ar[i]+"]");
  }
 }
}