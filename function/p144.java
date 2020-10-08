import java.util.*;
class p144
{
 static int perfect(int n)
 {
  int a=1,b=0;

  while(a<=n/2)
  {
   if(n%a==0)
   {
    b=a+b;
   }
   a++;
  }
  if(n==b)
   System.out.println("perfect no.");
  else
   System.out.println("not perfect no.");
   
  return(0);
 }
 public static void main(String[]R)
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();
  perfect(n);
 }
}