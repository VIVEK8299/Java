import java.util.*;
class p91
{
 public static void main(String[]R)
 {
  int n,a=0,i=0,b;
  float avg;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number of elements");
  n=sc.nextInt();
  System.out.println("enter the numbers");

  while(i<n)
  {
   b=sc.nextInt();
   a=a+b;
   i++;
  }
  avg=(float)a/n;
  System.out.println("the average is="+avg);
 }
}