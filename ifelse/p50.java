import java.util.*;
class p50
{
 public static void main(String[]R)
 {
  int call,p=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the no. of calls made");
  call=sc.nextInt();

  if(call<=200)
  {
   System.out.println("the cost of calls made is free");
  }
  else
  {
   if(call>200 && call<=500)
   {
    call=call-200;
    p=call*1;
    System.out.println("the price of the calls made is "+p);
   }
   else
   {
    if(call>500)
    {
     call=call-500;
     p=call*2;
     p=p+300;
     System.out.print("the price of the calls made is "+p);
    }
   }
  }
 }
}