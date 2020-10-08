import java.util.*;
class p31
{
 public static void main(String[]R)
 {
  int age;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the age of the person");
  age=sc.nextInt();

  String vote=((age>=18)?"can vote":"cannot vote");

  System.out.println("the person "+vote);
 }
}