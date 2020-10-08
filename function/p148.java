import java.util.*;
class p148
{
 static void prime(int n)
 {
  int i,j;
  
  for(j=0;j<n;j++)
  {
   for(i=2;i<j;i++)
    {
    if(j%i==0)
     break;
    }
   if(j==i)
   System.out.println(i);
  }
 }
 public static void main(String[]R)
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the limit");
  n=sc.nextInt();
  prime(n);
 }
}