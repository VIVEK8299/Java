import java.util.*;
class p35
{
 public static void main(String[]R)
 {
  float a,b,c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the value of a");
  a=sc.nextFloat();

  System.out.println("enter the value of b");
  b=sc.nextFloat();

  System.out.println("enter the value of c");
  c=sc.nextFloat();

  if(a>b)
  {
   if(a>c)
   {
    System.out.println("the greatest number is a="+a);
   }
   else
   {
    System.out.println("the greatest number is c="+c);
   }
  }
   else
   {
    if(b>c)
    {
     System.out.println("the greatest number is b="+b);
    }
    else
    {
     System.out.println("the greatest value is c="+c);
    }
   }
 }
}