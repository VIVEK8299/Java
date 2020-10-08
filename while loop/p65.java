import java.util.*;
class p65	
{
 public static void main(String[]R)
 {
  int i=1,n,v,p=0;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter any number");
  n=sc.nextInt();
  System.out.println("the series is");

  while(i<=n)
  {
   v=i*p;
   System.out.println(v);
   i++;
   p++;
  }
 }
}