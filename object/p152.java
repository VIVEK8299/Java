import java.util.*;
class calc
{
 private int n,rev;
 void setval(int x)
 {n=x;}

 int reve()
 {int rev=0,r,t;
  
  while(n>0)
  {
   r=n%10;
   rev=rev*10+r;
   n=n/10;
  }
  return(rev);
 }
 int pallindrome()
 {
  int t;
   t=n;
   
  if(t==rev)
    System.out.println("pallindrome");
  else
    System.out.println("not pallindrome");
   return(rev);
  }
}
class p152
{
 public static void main(String[]R)
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();

  calc ob=new calc();
  ob.setval(n);
  System.out.println("the reverse is="+ob.reve());
  System.out.println(ob.pallindrome());
 }
}
	