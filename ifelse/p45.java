import java.util.*;
class p45
{
 public static void main(String[]R)
 {
  char c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  c=sc.next().charAt(0);
 
  if(c>=65&&c<=90)
  {
   System.out.println("upper alphabet");
  }
  else
  {
   if(c>=97&&c<=122)
   {
    System.out.println("lower alphabet");
   }
   else
   {
    if(c>=48&&c<=57)
    {
     System.out.println("digit");
    }
    else
    {
     System.out.println("invalid");
    }
   }
  }
 }
}