import java.util.*;
class p113
{
 public static void main(String[]R)
 {
  

  for(int i=5;i>=1;i--)
  {
   for(int j=5;j>=1;j--)
   {
    if(j==1 || j==5)
    {
     System.out.print("   *");
    }
    else
    {
     System.out.print(" ");
    }
    if(i==3 && j>1 && j<5)
    {
     System.out.print("*");
    }
   }
   System.out.println("");
  }
 }
}