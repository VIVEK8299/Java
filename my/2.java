import java.util.*;
import java.lang.Math;
class hello
{
 public static void main(String[]R)
 {
  int q,a,b,n;
  double s=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the no. of inputs:");
  q=sc.nextInt();
  System.out.println("");
  for(int j=0;j<q;j++)
  {
   a=sc.nextInt(); b=sc.nextInt(); n=sc.nextInt();
   s=s+a;
   for(int i=0;i<=n;i++)
   {
    s=s+(Math.pow(2,i))*b;
    if(j!=n-1)
     System.out.print(s+" ");
    else
     System.out.print(s);
   }
   System.out.println("\n");
   s=0;
  }
 }
}