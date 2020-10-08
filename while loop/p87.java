import java.util.*;
class p87
{
 public static void main(String[]R)
 {
  int n,a=1;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();
  System.out.println("the factors are:");

  while(a<=n/2)
  {
   if(n%a==0)
   {
    System.out.println(a);
   }
   a++;
  }
 }
}