import java.util.*;
class calc
{
 private int n;

 void setval(int x)
 {n=x;}

 void even()
 {
  if(n%2==0)
    System.out.println("even number");
  else
    System.out.println("odd number");
 }

  void integer()
  {
   if(n>=0)
     System.out.println("positive integer");
   else
     System.out.println("negative integer");
  }
}
 class p158
 {
  public static void main(String[]R)
  {
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
   n=sc.nextInt();
   
   calc ob=new calc();
   ob.setval(n);
   ob.even();

   ob.setval(n);
   ob.integer();
  }
 }