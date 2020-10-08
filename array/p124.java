import java.util.*;
class p124
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],j;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  j=sc.nextInt();

  for(int i=0;i<j;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  for(int i=0;i<j-1;i++)
  {
   for(int k=i+1;k<j;k++)
   {
    if(ar[i]>ar[k])
    { 
     ar[i]=ar[i]+ar[k];
     ar[k]=ar[i]-ar[k];
     ar[i]=ar[i]-ar[k];
    }
   }
  }
  for(int i=0;i<j;i++)
  {
   System.out.print(ar[i]);
  }
 }
}