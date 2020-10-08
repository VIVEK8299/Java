import java.util.*;
class p53
{
 public static void main(String[]R)
 {
  int a,b,c;
  Scanner sc=new Scanner(System.in);

  System.out.println("a?");
  a=sc.nextInt();

  System.out.println("b?");
  b=sc.nextInt();

  System.out.println("c?");
  c=sc.nextInt();

  switch((a>b)?((a>c)?0:2):(b>c)?1:2)
  {
   case 0:
   System.out.println("a is greatest ="+a);
   break;

   case 1:
   System.out.println("b is greatest ="+b);
   break;

   case 2:
   System.out.println("c is greatest ="+c);
   break;
  }
 }
}