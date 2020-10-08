import java.util.*;
class p26
{
 public static void main(String[]R)
 {
  float x,a,b,c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the value of a");
  a=sc.nextFloat();

  System.out.println("enter the value of b");
  b=sc.nextFloat();

  System.out.println("enter the value of c");
  c=sc.nextFloat();

  x=(a>b)?((a>c)?a:b):((b>c)?b:c);
  
  System.out.println("the greater value is="+x);
 }
}