import java.util.*;
class p126
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],j,d,i;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  j=sc.nextInt();

  for(i=0;i<j;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  System.out.println("enter the data");
  d=sc.nextInt();
  for(i=0;i<j;i++)
  {
   if(ar[i]==d)
   {
    System.out.println("the index is = "+i); 
   }
  }
  if(ar[i]!=d)
  {
    System.out.println("data not found");
   }
 }
}