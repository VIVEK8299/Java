import java.util.*;
class p28
{
 public static void main(String[]R)
 {
  float c,s;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the value of c");
  c=sc.nextFloat();

  System.out.println("enter the value of s");
  s=sc.nextFloat();

  float y=s-c;
  float z=c-s;
 
  String x=((s-c>=0)?"profit"+y:"loss"+z);
  System.out.println("we got "+x);
 }
}