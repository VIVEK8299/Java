import java.util.*;
class p44
{
 public static void main(String[]R)
 {
  char c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  c=sc.next().charAt(0);

  if(c>=65&&c<=90)
  {
   int a= (int)c+32;
   System.out.println((char)a);
  }
  else
  {
   if(c>=97&&c<=122)
   {
    int a= (int)c-32;
    System.out.println((char)a);
   }
   else
   {
    System.out.println("invalid");
   }
  }
 }
}