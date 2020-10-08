import java.util.*;
class p37
{
 public static void main(String[]R)
 {
  int x;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter any number");
  x=sc.nextInt();
 
  if(x%13==0)
  {
   System.out.println("number is divisible by 13");
  }
  else
  {
   System.out.println("number is not divisible by 13");
  }
 }
}