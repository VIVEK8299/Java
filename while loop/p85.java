import java.util.*;
class p85
{
 public static void main(String[]R)
 {
  int n,a=1,b=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();

  while(a<=n/2)
  {
   if(n%a==0)
   b=b+a;
   a++;
  }
  if(b==n)
  {
   System.out.println("perfect number");
  }
  else
  {
   System.out.println("not perfect number");
  }
 }
}