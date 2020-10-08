import java.util.*;
class p5
{
 public static void main(String[]R)
 {
  int a,b,s;
  a=Integer.parseInt(R[0]);
  b=Integer.parseInt(R[1]);
  s=Integer.parseInt(R[2]);
  switch(s)
  {
   case 1:
   System.out.println("the sum is="+(a+b));
   break;

   case 2:
   System.out.println("the difference is="+(a-b));
   break;
}
}
}