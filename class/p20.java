import java.util.*;
class p20
{
 public static void main(String[]R)
 {
  int n,sub,sum=0,i;
  float per;
  n=Integer.parseInt(R[0]);
  int x[]=new int[n];
  System.out.println("No. of Subjects="+n);
  

  for(i=0;i<n;i++)
  {
   x[i]=Integer.parseInt(R[i+1]);
   sum=sum+x[i];
  }
  per=(float)sum/n;
  System.out.println("The marks given are:");
  for(i=0;i<n;i++)
  {
   System.out.println(+x[i]);
  }
  System.out.println("total marks are="+sum);
  System.out.println("%age is="+per);
 }
}