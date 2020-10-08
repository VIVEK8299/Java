import java.util.*;
import java.lang.Math;
class Scan
{
 public static void main(String[]R)
 {
  int ar[][]=new int[100][100],i,q;
  double s=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the no. of inputs");
  q=sc.nextInt();

  for(i=0;i<q;i++)
  {
   System.out.println("Enter inputs:");
   ar[0][i]=sc.nextInt();
   ar[1][i]=sc.nextInt();
   ar[2][i]=sc.nextInt();
  }
  for(i=0;i<ar[2][i];i++)
   {
    s=ar[0][i]+Math.pow(2,i)*ar[1][i]+s;
    System.out.print(" "+s);
   }s=0;
 }
}