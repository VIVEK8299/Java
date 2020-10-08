import java.util.*;
class p74
{
 public static void main(String[]R)
 {
  int n,i=1,v,b=1;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();
  System.out.println("the factorial of the number is :");
  
  while(i<=n)
  {
   v=i*b; 
   b=v;
   i++;
  }
  System.out.println(b);
 }
}