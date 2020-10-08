import java.util.*;
class p149
{
 static void function(int ar[],int m)
 {
  int i,j;

  for(i=0;i<m-1;i++)
  {
   for(j=i+1;j<m;j++)
   {
    if(ar[i]>ar[j])
    {
     ar[i]=ar[i]+ar[j];
     ar[j]=ar[i]-ar[j];
     ar[i]=ar[i]-ar[j];
    }
   }
  }
  for(j=0;j<m;j++)
   {
    System.out.print(ar[j]);
   }
  }
 public static void main(String[]R)
 {
  int ar[]=new int[100],m;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("row limit");
  m=sc.nextInt();

  for(int j=0;j<m;j++)
  {
   System.out.println("enter a no.");
   ar[j]=sc.nextInt();
  }
  function(ar,m);
 }
}