import java.util.*;
class p57
{
 public static void main(String[]R)
 {
  float s,c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the sell price");
  s=sc.nextFloat();

  System.out.println("enter the cost price");
  c=sc.nextFloat();

  switch((s>c)?0:1)
  {
   case 0:
   System.out.println("profit="+(s-c));
   break;

   case 1:
   System.out.println("loss="+(c-s));
   break;
  }
 }
}