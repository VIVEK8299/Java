import java.util.*;
class p15
{
 public static void main(String[]R)
  {
   float p,r,t,s;
   Scanner sc=new Scanner(System.in);

   System.out.println("enter he value of p");
   p=sc.nextFloat();
 
   System.out.println("enter the value of r");
   r=sc.nextFloat();
   
   System.out.println("enter teh value of t");
   t=sc.nextFloat();

   s=p*r*t/100;
  
   System.out.println("value of s="+s);
 }
}