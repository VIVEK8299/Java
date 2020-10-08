import java.util.*;
class p118
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],n,a=0,b=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  n=sc.nextInt();

  for(int i=0;i<=n-1;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }
  for(int i=0;i<=n-1;i++)
  {
   if(ar[i]%2==0)
    a++;
   else
    b++;
  }
  System.out.println("no. of even"+a);
  System.out.println("no. of odd"+b);
 }
}