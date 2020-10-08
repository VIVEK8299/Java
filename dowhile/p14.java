import java.util.*;
class p14
{
 public static void main(String[]R)
 {
  int n,a=0,p;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();
  System.out.println("the table of no. is :");

  do{
     p=a*n;
     System.out.println(p);
     a++;
    }
    while(a<=10);
 }
}