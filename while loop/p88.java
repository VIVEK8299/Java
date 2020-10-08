import java.util.*;
class p88
{
 public static void main(String[]R)
 {
  int n,a,j=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();

  while(n>0)
  {
   j++;
   n=n/10;
  }
  System.out.println("the digits in this number are="+j);
 }
}