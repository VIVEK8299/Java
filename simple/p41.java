import java.util.*;
class p41
{
 public static void main(String[]R)
 {
  int n,a,b,c,d,sum,product;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any four digit number");
  n=sc.nextInt();

  a=n/1000;
  n=n-a*1000;

  b=n/100;
  n=n-b*100;

  c=n/10;
  n=n-c*10;

  d=n;

  sum=a+d;
  product=b*c;

  System.out.println(sum);
  System.out.println(product);

 }
}