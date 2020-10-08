import java.util.*;
class p51
{
 public static void main(String[]R)
 {
  float d=0,p;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the amount of purchase");
  p=sc.nextInt();
 
  if(p>100 && p<200)
  {
   d=p*(5.0f/100.0f);
   p=(float)p-d;  
   System.out.println("the discount is "+d);
   System.out.println("the payable amount is "+p);
  }
  else
  {
   if(p>200 && p<400)
   {
    d=p*(10.f/100.f);
    p=(float)p-d;
    System.out.println("the discount is "+d);
    System.out.println("the payable amount is "+p);
   }
   else
   {
    if(p>400 && p<800)
    {
     d=p*(20.f/100.f);
     p=(float)p-d;
     System.out.println("the discount is "+d);
     System.out.println("the payable amount is "+p); 
    }
    else
    {
     if(p>800)
     {
      d=p*10.f/100.f;
      p=(float)p-d;
      System.out.println("the discount is "+d);
      System.out.println("the payable amount is "+p);

     }
    }
   }
  }
 }
}