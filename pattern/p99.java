import java.util.*;
class p99
{
 public static void main(String[]R)
 {
  int i,j,k;
  
  for(i=1;i<=5;i++)
  {
   for(j=4;j>=i;j--)
   {
    System.out.print("1");
   }
   for(k=1;k<=i;k++)
   {
    System.out.print(i);
   }
    System.out.println("");
  }
 }
}