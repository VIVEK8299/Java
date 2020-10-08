import java.util.*;
class p48
{
 public static void main(String[]R)
 {
  int n,a=1,j=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();

  do
  {
      if(n%a==0)
       j++;
    a++;
  }
  while(a<=(n/2-1));

  if(j==1)
  {
   System.out.println("no. is prime");
  }
  else
  {					
   System.out.println("no. is not prime");
  }
 }
}