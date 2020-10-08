import java.util.*;
class p49
{
 public static void main(String[]R)
 {
  double w,p=32.50f;
  Scanner sc=new Scanner(System.in);
 
  System.out.println("enter the weight");
  w=sc.nextFloat();

  if(w<=2)
 
  System.out.print("the price of parcel is "+p);
  else
  {
   if(w>2)
   {
    w=w-2;
    w=w*10.50;
    p=p+w;
    System.out.print("the price of parcel is "+p);
   }
   else
   {
    System.out.print("invalid input");
   }
  }
 }
}