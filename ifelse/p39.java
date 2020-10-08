import java.util.*;
class p39
{
 public static void main(String[]R)
 {
  int c,s;
  Scanner sc=new Scanner(System.in);
 
  System.out.println("enter the cost price ");
  c=sc.nextInt();
  
  System.out.println("enter the sell price ");
  s=sc.nextInt();

  int y = s-c;
  int z = c-s;
  
  if(y>=0)
  {
   System.out.println("profit="+y);
  }
  else
  {
   System.out.println("loss="+z);
  }
 }
}