import java.util.*;
class p82
{
 public static void main(String[]R)
 {
  int n,j=0,a=1;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();

  while(a<=n/2)
  {
     if(n%a==0)
      j++;
    a++;
  }

  if(j==1)
  {
   System.out.println("prime number");
  }
  else
  {
   System.out.println("not a prime number");
  }
 }
}