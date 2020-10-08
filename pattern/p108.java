import java.util.*;
class p108
{
 public static void main(String[]R)
 {

  for(int i=1;i<=4;i++)
  {
   for(int j=4;j>=i;j--)
   {
    System.out.print(j);
   }
   for(int k=2;k<=i;k++)
   {
    System.out.print(" ");
   }
   for(int l=3;l<=i;l++)
   {
    System.out.print(" ");
   }
   for(int m=4;m>=i;m--)
   {
    if(m==1)
    {
     System.out.print("");
    }
    else
    {
     System.out.print(m);
    }
   }
   System.out.println("");
  }
 }
}