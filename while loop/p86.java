import java.util.*;
class p86
{
 public static void main(String[]R)
 {
  int n=1,a=1,b=0;
  System.out.println("the perfect no's are:");

  while(n<=1000)
   {
    while(a<=n/2)
    {
     if(n%a==0)
      b=b+a;
     a++;
    }
    if(b==n)
    System.out.println(n);
    n++;
    b=0;
    a=1;
  }
 }
}