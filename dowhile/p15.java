import java.util.*;
class p15
{
 public static void main(String[]R)
 {
  int n,a=1,b=1;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();

  do
  {
   b=b*a;
   a++;
  }
  while(a<=n);

  System.out.println("the factorial is ="+b);
 }
}