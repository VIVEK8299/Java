import java.util.*;
class p154
{
 static void sum(int n)
 {
  int i;
  for(i=2;i<n;i++)
  {
   if(n%i==0)
   break;
  }
  if(n==i)
   System.out.println("prime no.");
  else
   System.out.println("not prime no.");
 }
 public static void main(String[]R)
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a no.");
  n=sc.nextInt();
  sum(n);
 }
}