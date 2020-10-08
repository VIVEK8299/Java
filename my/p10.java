import java.util.*;
class p10
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
   for(j=i+1;j<n;j++)
   {
    if(ar[i]>ar[j])
    {
     ar[i]=ar[i]+ar[j];
     ar[j]=ar[i]-ar[j];
     ar[i]=ar[i]-ar[j];
    }
   }
  }

  System.out.println("Selection sort:");
  for(i=0;i<n;i++) 
  {
   System.out.println("["+ar[i]+"]");
  }
 }
}