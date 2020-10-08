import java.util.*;
class p38
{
 public static void main(String[]R)
 {
  char x;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  x=sc.next().charAt(0);

  if(x=='m'||x=='M')
  {
   System.out.println("the person is male");
  }
  else
  {
   if(x=='f'||x=='F')
   {
    System.out.println("the person is female");
   }
   else
   {
    System.out.println("invalid input");
   }
  }
 }
}