import java.util.*;
class p33
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

  x=(a>b)?((a<c)?a:(b>c)?b:c):((b<c)?b:(a>c)?a:c);
  System.out.println("the second greater value is="+x);
 }
}