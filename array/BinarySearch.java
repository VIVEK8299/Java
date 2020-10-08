import java.util.*;
class p127
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],j,d,lb,ub,mid=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the range");
  j=sc.nextInt();
  lb=0;
  ub=j-1;

  for(int i=0;i<j;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  for(int i=1;i<j;i++)
  {
   d=ar[i];
   for(int k=i-1;k>=0 && d<ar[k];k--)
   {
    ar[k+1]=ar[k];
    ar[k]=d;
   }
  }
  System.out.println("enter the data");
  d=sc.nextInt();
  
  while(lb<=ub)
  {
   mid=(lb+ub)/2;
   if(ar[mid]==d)
    break;
   else
   
    if(d>ar[mid])
     lb=mid+1;
    else
     ub=mid-1;
   }
   if(ar[mid]==d)
     System.out.println("data found:index="+mid);
   else
     System.out.println("data not found ");
 }
}