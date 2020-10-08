import java.util.*;
class p110
{
 public static void main(String[]R)
 {
  int n,a=0,r,rev=0;
  String s = "";
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the no.");
  n=sc.nextInt();
  System.out.println("the output is:");

  while(n>0)
  {
   r=n%10;
   rev=rev*10+r;
   n=n/10;
  }

  while(rev>0)
  {
   a=rev%10;
  if(a==0)
  {
   System.out.print("zero ");
  }
  else
  {
   if(a==1)
   {
    System.out.print("one ");
   }
   else
   {
    if(a==2)
    {
     System.out.print("two ");
    }
    else
    {
     if(a==3)
     {
      System.out.print("three ");
     }
     else
     {
      if(a==4)
      {
       System.out.print("four ");
      }
      else
      {
       if(a==5)
       {
        System.out.print("five ");
       }
       else
       {
        if(a==6)
        {
         System.out.print("six ");
        }
        else
        {
         if(a==7)
         {
          System.out.print("seven ");
         }
         else
         {
          if(a==8)
          {
           System.out.print("eight ");
          }
          else
          {
           if(a==9)
           {
            System.out.print("nine ");
           }
          }
         }
        }
       }
      }
     }
    }
   }
  }
   s=a+s;
   rev=rev/10;
  }
  System.out.print("");
 }
}