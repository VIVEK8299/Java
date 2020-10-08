import java.util.*;
class p66
{
 public static void main(String[]R)
 {
  int a=0,b=1,v,i=1,n;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter any number");
  n=sc.nextInt();
  System.out.println("the series is");
  System.out.println(a);
  System.out.println(b);

  while(i<=n)
  {
   v=a+b;
   System.out.println(v);
   a=b;
   b=v;
   i++;
  }
 }
}