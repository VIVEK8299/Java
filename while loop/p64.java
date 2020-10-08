import java.util.*;
class p64
{
 public static void main(String[]R)
 {
  int i=1,n,v;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter any number");
  n=sc.nextInt();
  System.out.println("the series is");

  while(i<=n)
  {
   v=i*i;
   System.out.println(v);
   i++;
  }
 }
}