import java.util.Scanner;
class p3
{
 public static void main(String[]R)
 {
  int ar[]= new int[100],i,n,e=0,o=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit of array");
  n=sc.nextInt();

  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }

  for(i=0;i<n;i++)
  {
   if(ar[i]%2==0)
   e++;
   if(ar[i]%2!=0)
   o++;
  }

  System.out.println("no. of even are = "+e);
  System.out.println("no. of odd are = "+o);
 }
}