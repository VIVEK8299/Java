import java.util.*;
class p69
{
 public static void main(String[]R)
 {
  int n,i=1,b,c=1;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter any number");
  n=sc.nextInt();
  System.out.println("the series is");
  System.out.println(c);

  while(i<=n)
  {
   b=c+i;
   System.out.println(b);
   c=b;
   i++;
  }
 }
}