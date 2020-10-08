import java.util.*;
class p47
{
 public static void main(String[]R)
 {
  int marks;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the percentage");
  marks=sc.nextInt();

  if(marks>=85)
  {
   System.out.println("grade=s");
  }
  else
  {
   if(marks>=75 && marks<85)
   {
    System.out.println("grade=A");
   }
   else
   {
    if(marks>=65 && marks<75)
    {
     System.out.println("grade=B");
    }
    else
    {
     if(marks>=55 && marks<65)
     {
      System.out.println("grade=C");
     }
     else
     {
      if(marks>=50 && marks<55)
      {
       System.out.println("grade=D");
      }
      else
      {
       if(marks>=0 && marks<50)
       {
        System.out.println("grade=F");
       }
       else
       {
        System.out.println("invalid marks");
       }
      }
     }
    }
   }
  }
 }
}









