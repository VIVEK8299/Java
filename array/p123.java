import java.util.*;
class p123
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],j,i;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  j=sc.nextInt();

  for(i=0;i<j;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  for(i=0;i<j;i++)
  {
   System.out.print(ar[i]);
  }
  System.out.println("");
  for(i=0;i<j;i++)
  {
   for(int k=0;k<j-1;k++)
   {
    if(ar[k]>ar[k+1])
    {
     ar[k]=ar[k]+ar[k+1];
     ar[k+1]=ar[k]-ar[k+1];
     ar[k]=ar[k]-ar[k+1];
    }
   }
  }
  for(int l=0;l<j;l++)
  {
   System.out.print(ar[l]);
  }
 }
}