import java.util.*;
class p29
{
 public static void main(String[]R)
 {
  char x;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  x=sc.next().charAt(0);

  String y=((x=='f'||x=='F')?"female":(x=='m'||x=='M')?"male":"invalid");

  System.out.println("the input is a "+y);
 }
}