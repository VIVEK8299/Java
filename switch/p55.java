import java.util.*;
class p55
{
 public static void main(String[]R)
 {
  int age;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the age of person");
  age=sc.nextInt();

  switch((age>=18)?0:1)
  {
   case 0:
   System.out.println("the person can vote");
   break;

   case 1:
   System.out.println("the person cannot vote");
   break;
  }
 }
}