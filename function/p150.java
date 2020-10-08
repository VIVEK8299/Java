import java.util.*;
class p150
{
 static void function(int ar[],int r)
 {
  int i,j;

  for(i=0;i<r-1;i++)
  {
   for(j=i+1;j<r;j++)
   {
    if(ar[i]>ar[j])
    {
     ar[i]=ar[i]+ar[j];
     ar[j]=ar[i]-ar[j];
     ar[i]=ar[i]-ar[j];
    }
   }
  }
  for(i=0;i<r;i++)
  {
   System.out.println("["+ar[i]+"]");
  }
 }
 public static void main(String[]R)
 {
  int ar[]=new int[100],r;
  Scanner sc=new Scanner(System.in);

  System.out.println("row limit");
  r=sc.nextInt();

  for(int i=0;i<r;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  function(ar,r);
 }
}