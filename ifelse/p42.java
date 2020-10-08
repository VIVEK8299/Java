import java.util.*;
class p42
{
 public static void main(String[]R)
 {
  int t;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any time between 0 to 24 hours");
  t=sc.nextInt();

   if(t>=1 && t<=12)
   {
    System.out.println("Good Morning");
   }
   else
   {
    if(t<=16 && t>=12)
    {
     System.out.println("good afternoon");
    }
    else
    {
     if(t>16 && t<=20)
     {
       System.out.println("good evening");
     }
     else
     {
      if(t>20 && t<=24)
      {
       System.out.println("good night");
      }
     else
     {
      System.out.println("invalid");
     }
    }
   }
  }
 }
}