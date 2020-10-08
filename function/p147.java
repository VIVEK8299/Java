import java.util.*;
class p147
{
 static void prime()
 {
  int n,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();
  for(i=2;i<n;i++)
  {
   if(n%i==0)
   break;
  }

  if(n==i)
   System.out.println("prime number");
  else
   System.out.println("not prime number");
 }

 public static void main(String[]R)
 {
  prime();
 }
}