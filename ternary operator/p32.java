import java.util.*;
class p32
{
 public static void main(String[]R)
 {
  int x;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any number");
  x=sc.nextInt();

  String y=((x%13==0)?"divisible":"not divisible");
 
  System.out.println("the input number is "+y);
 }
}