import java.util.*;
class p90
{
 public static void main(String[]R)
 {
  int n=2,a=1,j=0;

  while(n<=100)
  {
   while(a<=n/2)
   {
    if(n%a==0)
    {j++;
    }
     a++;
   }
   if(j==1)
     System.out.println(n);
   n++;
   j=0;
   a=1;
  }
 }
}