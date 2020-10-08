import java.util.*;
class p94
{
 public static void main(String[]R)
 {
  int n,i=1,s,j=0,k=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number of inputs");
  n=sc.nextInt();

  while(i<=n)
  {
   System.out.println("enter number");
   s=sc.nextInt();
   if(s%2==0)
   {
    j++;
    i++;
   }
   else
   {
    i++;
    k++;
   }
  }
  System.out.println("no. of even are="+j);
  System.out.println("no. of odd are="+k);
 }
}