import java.util.*;
class p12
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],n,i,k,d,mid=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  n=sc.nextInt();
  int lb=0,ub=n;

  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  for(i=1;i<n;i++)
  {
   d=ar[i];
   for(k=i-1;k>=0 && d<ar[k];k--)
   {
    ar[k+1]=ar[k];
    ar[k]=d;
   }
  }

  System.out.println("enter a no. for search:");
  d=sc.nextInt();

  while(lb<=ub)
  {
   mid=(lb+ub)/2;

   if(ar[mid]==d)
    break;

   if(ar[mid]>d)
    ub=mid-1;
   else
    lb=mid+1;
  }

  if(ar[mid]==d)
   System.out.println("data found:"+mid);
  else
   System.out.println("data not found");
 }
}  