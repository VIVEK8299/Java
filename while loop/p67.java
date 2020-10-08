import java.util.*;
class p67
{
 public static void main(String[]R)
 {
  int a=1,b=2,c=4,v,i=1,n;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter any number");
  n=sc.nextInt();
  System.out.println("the series is");
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);

  while(i<=n)
  {
   v=a+b+c;
   System.out.println(v);
   a=b;
   b=c;
   c=v;
   i++;
  }
 }
}