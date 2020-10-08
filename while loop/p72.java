import java.util.*;
class p72
{
 public static void main(String[]R)
 {
  int n,i=1,c=1,b=1;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the power of 10");
  n=sc.nextInt();

  while(i<=n)
  {
    b=10*c;
    c=b;
    i++;
  }
  System.out.println(b);
 }
}