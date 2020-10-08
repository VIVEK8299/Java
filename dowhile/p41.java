import java.util.*;
class p41
{
 public static void main(String[]R)
 {
  int n,r,rev=0;
  Scanner sc=new Scanner(System.in);

  System.out.print("enter the no.:");
  n=sc.nextInt();

  do
  {
   r=n%10;
   rev=rev*10+r;
   n=n/10;
  }
  while(n>0);
  System.out.println("the reverse is="+rev);
 }
}