import java.util.*;
class p81
{
 public static void main(String[]R)
 {
  int n,rev=0,r,t;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number"); 
  n=sc.nextInt();
  t=n;

  while(n>0)
  {
   r=n%10;
   rev=rev*10+r;
   n=n/10;
  }
  if(t==rev)
  {
   System.out.println("no. is palindrome");
  }
  else
  {
   System.out.println("no. is not pallindrome");
  }
 }
}