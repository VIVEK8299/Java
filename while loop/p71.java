import java.util.*;
class p71
{
 public static void main(String[]R)
 {
  int n,i=1,b;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any number");
  n=sc.nextInt();
  System.out.println("the table of the number is :");

  while(i<=10)
  {
   b=n*i;
   System.out.println(b);
   i++;
  }
 }
}