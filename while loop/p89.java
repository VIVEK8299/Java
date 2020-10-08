import java.util.*;
class p89
{
 public static void main(String[]R)
 {
  int n,a;
  String o="";
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();

  while(n>0)
  {
   a=n%2;
   o=a+o;
   n=n/2;
  }
System.out.println(o);
 }
}