import java.util.*;
class p19
{
 public static void main(String[]R)
 {
  int sub,sum=0,i;
  float per;
  int x[]=new int[5];
  System.out.println("No. of Subjects=5");
  

  for(i=0;i<5;i++)
  {
   x[i]=Integer.parseInt(R[i]);
   sum=sum+x[i];
  }
  per=(float)sum/5;
  System.out.println("The marks given are:");
  for(i=0;i<5;i++)
  {
   System.out.println(+x[i]);
  }
  System.out.println("total marks are="+sum);
  System.out.println("%age is="+per);
 }
}